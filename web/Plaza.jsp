<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="CSS/Plaza.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="index.js"></script>
<title>Plaza</title>
</head>

<body onload="MM_preloadImages('icon/cat_o_mus.png')">
	<main>
    	<div class="header">
        	<div class="logo">
            	<a href="index.jsp" alt="Home page">
                <img src="icon/xl-13.png" alt="X-Learning" height="80%" class="logoimg" /></a>
            </div>
            <div class="welcome">
            	<div id="personal">
                <% 
        if(session.getAttribute("login") == null) {
            %>      <h5><a href="Signin.html" alt="Personal page">
                                        SIGN IN  /</a>
                    <a href="Register.jsp" alt="Personal page">
                    SIGN UP</a></h5>
            <% }else{if(session.getAttribute("gender1").equals("male")){%>
                <a href="PersonalPage.jsp" alt="Personal page">
                <img src="icon/boy_icon.png" width="50" height="50" alt=""/> </a>
                <div class="signout">   
                <form action="Signout" method="post" name="signout" id="form1">
                    <input type="image" src="icon/button_signout.png" width="80" height="16" alt="SIGN OUT" />   
                </form></div>
              <%}else{%>
                <a href="PersonalPage.jsp" alt="Personal page">
                <img src="icon/girl_icon.png" width="60" height="50" alt=""/> </a>
                <div class="signout">   
                <form action="Signout" method="post" name="signout" id="form1">
                    <input type="image" src="icon/button_signout.png" width="80" height="16" alt="SIGN OUT" />   
                </form></div>
        <%}}%>
                </div>
          </div>
        </div>
        <div class="contain">
            <div class='col-left'>              
                <ul id="miSider">
                    <li class="panel">	
                        <a data-toggle="collapse" data-parent="#miSider">SKILL</a>
                        <ul id="subMenu-1" class="collapse in">
                            <li><a href="music.jsp">&nbsp;&nbsp;MUSIC</a>
                            </li>
                            <li><a href="lang.jsp">&nbsp;&nbsp;LANGUAGE</a>
                            </li>
                            <li><a href="tech.jsp">&nbsp;&nbsp;TECHNOLOGY</a>
                            </li>
                            <li><a href="sport.jsp">&nbsp;&nbsp;SPORT</a>
                            </li>
                        </ul>
                    </li>
                    <li class="panel">	
                        <a data-toggle="collapse" data-parent="#miSider" href="Plaza.jsp">PLAZA</a>
                    </li>
                </ul>
              </div>
              <div class='col-remaining'>
              	<div class="con-main">
                	<div class="con-header">
                	<!--node-type="textElDiv"-->
                    	<form action="Plaza" id="Plaza" method="post" accept-charset="UTF-8">
                		<div class="TextInput">
                    	<!--form=??-->
                    	<textarea maxlength="500" class="T-Input" name="InputBox" rows="5" cols="100" required="required"></textarea> 
                    	</div>
                    	<div class="TextBottom">
                    	<div class="ReqSkill">
                    		<b>SKILL:</b><input type="text" name="skill_content" id="skill_content" placeholder="  Running" size="30" style="font-size:16px;" required="required" />&nbsp;&nbsp;&nbsp;
                            <input type="radio" name="purpose" id="learn" value="learn" />
                            <label for="learn"><b>LEARN</b></label>
                            <input type="radio" name="purpose" id="teach" value="teach" />
                            <label for="teach"><b>TEACH</b></label>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        </div>
                            <div class="ReqButton">
                                
                        	<input type="submit" value="POST" class="ReqPost" />
                        </div>
                    	</div>
                    	</form>
                	</div>
                                <%
                                Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                                try{
                                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn");
                                Statement st = conn.createStatement();
                                ResultSet rs2 = st.executeQuery("SELECT user_email,request_descreption,skill_content,purpose FROM PUBLISH_REQUEST");
                                while(rs2.next()){
                                    Statement st1 = conn.createStatement();
                                    ResultSet rs = st1.executeQuery("SELECT USER_NAME,GENDER FROM USER_INFO WHERE EMAIL='"+rs2.getString(1)+"'");
                                       while(rs.next()){
                                           if(rs.getString(2).equals("male")){
                                    %>
                	<div class="con-exh">
                    	<div class="InfoExh">
                        	<div class="InfoDetail">
                            	<div class="InfoFace">
                                	<img alt="Boy" src="icon/boy_icon.png" height="50" width="50" />
                                </div>
                                <div class="InfoContent">
                                	<div class="InfoUser">
                                            <h2><%=rs.getString(1)%></h2>
                                    </div>
                        <div class="InfoText">
                                    	<p><%=rs2.getString(2)%></p>
                                    </div>
                                </div>
                            </div>
                            <div class="InfoTage">
                                <ul class="Tages">
                                    <!--<li> Example@email.com</li>-->
                                    <li>
                                    	<span class="pos"><%=rs2.getString(1)%></span>
                                    </li>
                                    <li>
                                    	<span class="pos"><%=rs2.getString(3)%></span>
                                    </li>
                                    <li>
                                    	<span class="pos"><%=rs2.getString(4)%></span>
                                    </li> 
                                </ul>
                            </div>
                        </div>
                        </div><%}else{%>
                	<div class="con-exh">
                    	<div class="InfoExh">
                        	<div class="InfoDetail">
                            	<div class="InfoFace">
                                	<img alt="Girl" src="icon/girl_icon.png" height="50" width="50" />
                                </div>
                                <div class="InfoContent">
                                	<div class="InfoUser">
                                            <h2><%=rs.getString(1)%></h2>
                                    </div>
                        <div class="InfoText">
                                    	<p><%=rs2.getString(2)%></p>
                                    </div>
                                </div>
                            </div>
                            <div class="InfoTage">
                                <ul class="Tages">
                                    <!--<li> Example@email.com</li>-->
                                    <li>
                                    	<span class="pos"><%=rs2.getString(1)%></span>
                                    </li>
                                    <li>
                                    	<span class="pos"><%=rs2.getString(3)%></span>
                                    </li>
                                    <li>
                                    	<span class="pos"><%=rs2.getString(4)%></span>
                                    </li> 
                                </ul>
                            </div>
                        </div>
                        </div><%
                                               
                                           }
                                       }}}catch( SQLException cnfe)
        {
            cnfe.printStackTrace();
        }%>
              	</div>
              </div>
         </div>
    </main>
</body>
</html>
