<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="CSS/PersonalPage.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="CSS/reset.css" />
        <link rel="stylesheet" href="CSS/style.css" />
        <script type="text/javascript" src="jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="modernizr.js"></script>
        <script type="text/javascript" src="main.js"></script>
        <script type="text/javascript" src="jquery-2.1.1.js"></script>
        <script type="text/javascript" src="index.js"></script>
        <title>PersonalPage</title>
    </head>
    
<body>

    <main>
        
        <div class="header">
        	<div class="logo">
            	<a href="index.jsp" alt="Home page">
                <img src="icon/xl-13.png" alt="X-Learning" height="80%" class="logoimg" /> </a>
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
                <div id="PersonalInfo" class="con-left">
                    <div class="PersonHeader">
                    	<div class="PersonalImage">
                            
                            <% if(session.getAttribute("gender").equals("male")){ %>
                                <img src="icon/boy_icon.png" alt="BOY" height="130" />
                                <%}else{%>
                                <img src="icon/girl_icon.png" alt="GIRL" height="130" /><%}%>
                        	<!--<img src="icon/boy_icon.png" alt="BOY" height="130" />-->
                        </div>
                        <div class="PersonalDetail">
                        	<div class="CollegeIcon">
                            	<% if(session.getAttribute("school").equals("cmu")){ %>
                                <img src="icon/cmu_icon.png" alt="CMU" height="50" />
                                <%}else{%>
                                <img src="icon/pitt_icon.png" alt="PITT" height="50" /><%}%>
                            	<!--<img src="icon/cmu_icon.png" alt="CMU" height="50" />-->
                            </div>
                            <h1><b><%= session.getAttribute("user_name")%></b></h1>
                            <!--<h1><b>Username</b></h1>-->
                            <h3><%= session.getAttribute("major")%></h3>
                            <!--<h3>MSIS</h3>-->
                            <h3>
                                <% String time1 = session.getAttribute("available_time").toString();
                                char[] time = time1.toCharArray();
                                String time2="";
                                for(int i=0;i<time.length;i++)
                                {
                                    if(time[i]=='|'){
                                        if(time2.equals("1")) {%>Mon.&nbsp;&nbsp;<%;}
                                        else if(time2.equals("2")) {%>Tue.&nbsp;&nbsp;<%;}
                                        else if(time2.equals("3")) {%>Wed.&nbsp;&nbsp;<%;}
                                        else if(time2.equals("4")) {%>Thu.&nbsp;&nbsp;<%;}
                                        else if(time2.equals("5")) {%>Fri.&nbsp;&nbsp;<%;}
                                        else if(time2.equals("6")) {%>Sat.&nbsp;&nbsp;<%;}
                                        else {%>Sun.&nbsp;&nbsp;<%;}
                                        time2="";
                                        continue;
                                    }else{time2=time2+time[i];}
                                }
                                %></h3>
                            <!--<h3>Mon.&nbsp;&nbsp;Tue.</h3>-->
                        </div>
                    </div>
                    <div class="PersonContent">
                    	<p><%= session.getAttribute("motto")%></p>
                    	<!--<p>Hello everyone! <br />My name is Username and I'm a test account. <br />lol~</p>-->
                    </div>
                    <div class="PersonSkills">
                    	<div class="Teach">
                        	<p>I can teach:<b>&nbsp;&nbsp;&nbsp;&nbsp;
                                <% String tskill1 = session.getAttribute("teach_skills").toString();
                                char[] tskill = tskill1.toCharArray();
                                String tskill2="";
                                for(int i=0;i<tskill.length;i++)
                                {
                                    if(tskill[i]=='|'){
                                        if(tskill2.equals("1")) {%>C++&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("2")) {%>Excel&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("3")) {%>HTML&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("4")) {%>Java&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("5")) {%>Photoshop&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("6")) {%>SQL&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("7")) {%>Basketball&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("8")) {%>Badminton&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("9")) {%>Tennis&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("10")){%>Jogging&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("11")) {%>Skateboard&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("12")) {%>Swimming&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("13")) {%>Drum&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("14")) {%>Guitar&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("15")) {%>Piano&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("16")) {%>Saxphone&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("17")) {%>Violin&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("18")) {%>Vocal&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("19")) {%>Cantonese&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("20")) {%>Chinese&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("21")) {%>English&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("22")) {%>French&nbsp;&nbsp;<%;}
                                        else if(tskill2.equals("23")) {%>Japanese&nbsp;&nbsp;<%;}
                                        else {%>Korean&nbsp;&nbsp;<%;}
                                        tskill2="";
                                        continue;
                                    }else{
                                    tskill2=tskill2+tskill[i];}
                                }
                                %></b></p>
                        	<!--<p>I can teach:<b>&nbsp;&nbsp;&nbsp;&nbsp;C++&nbsp;&nbsp;Java</b></p>-->
                            <br />
                        </div>
                        <div class="Learn">
                        	<p>I want to learn:<b>&nbsp;&nbsp;&nbsp;&nbsp; 
                                        <% String lskill1 = session.getAttribute("learn_skills").toString();
                                char[] lskill = lskill1.toCharArray();
                                String lskill2="";
                                for(int i=0;i<lskill.length;i++)
                                {
                                    if(lskill[i]=='|'){
                                        if(lskill2.equals("1")) {%>C++&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("2")) {%>Excel&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("3")) {%>HTML&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("4")) {%>Java&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("5")) {%>Photoshop&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("6")) {%>SQL&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("7")) {%>Basketball&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("8")) {%>Badminton&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("9")) {%>Tennis&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("10")){%>Jogging&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("11")) {%>Skateboard&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("12")) {%>Swimming&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("13")) {%>Drum&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("14")) {%>Guitar&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("15")) {%>Piano&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("16")) {%>Saxphone&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("17")) {%>Violin&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("18")) {%>Vocal&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("19")) {%>Cantonese&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("20")) {%>Chinese&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("21")) {%>English&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("22")) {%>French&nbsp;&nbsp;<%;}
                                        else if(lskill2.equals("23")) {%>Japanese&nbsp;&nbsp;<%;}
                                        else {%>Korean&nbsp;&nbsp;<%;}
                                        lskill2="";
                                        continue;
                                    }else{
                                    lskill2=lskill2+lskill[i];}
                                }
                                %></b></p>
                        	<!--<p>I want to learn:<b>&nbsp;&nbsp;&nbsp;&nbsp;Basketball&nbsp;&nbsp;Drum</b></p>-->
                            <br />
                        </div>
                    </div>
                </div>
                <div id="RightContent" class="con-right">
                	<div class="cd-tabs" style="margin-top: 10px;">
                    	<nav>
                        	<ul class="cd-tabs-navigation">
                            	<li><a data-content="inbox" class="selected" href="#0" style="padding-left: 35px; padding-right: 35px;">Inbox</a></li>
                            	<li><a data-content="partner" href="#0" style="padding-left: 35px; padding-right: 35px;">Partner</a></li>
                        	</ul> <!-- cd-tabs-navigation -->
                    	</nav>
                        <ul class="cd-tabs-content" style="width:260px;">
							<li data-content="inbox" class="selected" style="padding:20px;">
                       <% 
                                String skill="";
                                String email="";
                                String matchid="";
                                Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                                try{
                                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn");
                                Statement st = conn.createStatement();
                                ResultSet rs1 = st.executeQuery("SELECT SKILL_ID,LEARNER_EMAIL,MATCH_ID FROM MATCH_REQUEST WHERE TEACHER_EMAIL='"+session.getAttribute("eMail")+"' AND MATCH_STATUS='submitted'");
                                while(rs1.next()){
                                email=rs1.getString(2);
                                matchid=rs1.getString(3);
                                if(rs1.getInt(1)==1)
                                skill="C++";
                            else if(rs1.getInt(1)==2)
                                skill="Excel";
                            else if(rs1.getInt(1)==3)
                                skill="HTML";
                            else if(rs1.getInt(1)==4)
                                skill="Java";
                            else if(rs1.getInt(1)==5)
                                skill="Photoshop";
                            else if(rs1.getInt(1)==6)
                                skill="SQL";
                            else if(rs1.getInt(1)==7)
                                skill="Basketball";
                            else if(rs1.getInt(1)==8)
                                skill="Badminton";
                            else if(rs1.getInt(1)==9)
                                skill="Tennis";
                            else if(rs1.getInt(1)==10)
                                skill="Jogging";
                            else if(rs1.getInt(1)==11)
                                skill="Skateboard";
                            else if(rs1.getInt(1)==12)
                                skill="Swimming";
                            else if(rs1.getInt(1)==13)
                                skill="Drum";
                            else if(rs1.getInt(1)==14)
                                skill="Guitar";
                            else if(rs1.getInt(1)==15)
                                skill="Piano";
                            else if(rs1.getInt(1)==16)
                                skill="Saxphone";
                            else if(rs1.getInt(1)==17)
                                skill="Violin";
                            else if(rs1.getInt(1)==18)
                                skill="Vocal";
                            else if(rs1.getInt(1)==19)
                                skill="Cantonese";
                            else if(rs1.getInt(1)==20)
                                skill="Chinese";
                            else if(rs1.getInt(1)==21)
                                skill="English";
                            else if(rs1.getInt(1)==22)
                                skill="French";
                            else if(rs1.getInt(1)==23)
                                skill="Japanese";
                            else skill="Korean";
                                        %>
                                        <div class="Message">
                                	<div class="Match_Mess">
                                		<img alt="NewMessage" src="icon/message_u.png" />
                                    	<h5>Match Message</h5>
                                    	<p>We are glad to inform you that User:<%=email%> sent out a request in hope of learning <%=skill%></p>
                                	</div>
                                    <div class="Match_Option">
                                     <form action="Updatematch" id="match_option" method="post">
                                            <input type="hidden" name="matchid" value="<%=matchid%>"/>
                                            <input type="radio" name="Options" id="accept" value="accept" onclick="submit()"/>
                                            <label for="accept"><b>ACCEPT</b></label>
                                            <input type="radio" name="Options" id="reject" value="reject" onclick="submit()"/>
                                            <label for="reject"><b>REJECT</b></label>
                                    </form>
                                    </div>
                                 </div>
                                       <%}}catch( SQLException cnfe)
        {
            cnfe.printStackTrace();
        }%>   
			    </li>
                            <li data-content="partner" style="padding:20px;">
                                <%
                                skill="";
                                email="";
                                String username="";
                                try{
                                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn");
                                Statement st = conn.createStatement();
                                ResultSet rs2 = st.executeQuery("SELECT SKILL_ID,LEARNER_EMAIL FROM MATCH_REQUEST WHERE TEACHER_EMAIL='"+session.getAttribute("eMail")+"' AND MATCH_STATUS='accepted'");
                                while(rs2.next()){
                                email=rs2.getString(2);
                                
                                if(rs2.getInt(1)==1)
                                skill="C++";
                            else if(rs2.getInt(1)==2)
                                skill="Excel";
                            else if(rs2.getInt(1)==3)
                                skill="HTML";
                            else if(rs2.getInt(1)==4)
                                skill="Java";
                            else if(rs2.getInt(1)==5)
                                skill="Photoshop";
                            else if(rs2.getInt(1)==6)
                                skill="SQL";
                            else if(rs2.getInt(1)==7)
                                skill="Basketball";
                            else if(rs2.getInt(1)==8)
                                skill="Badminton";
                            else if(rs2.getInt(1)==9)
                                skill="Tennis";
                            else if(rs2.getInt(1)==10)
                                skill="Jogging";
                            else if(rs2.getInt(1)==11)
                                skill="Skateboard";
                            else if(rs2.getInt(1)==12)
                                skill="Swimming";
                            else if(rs2.getInt(1)==13)
                                skill="Drum";
                            else if(rs2.getInt(1)==14)
                                skill="Guitar";
                            else if(rs2.getInt(1)==15)
                                skill="Piano";
                            else if(rs2.getInt(1)==16)
                                skill="Saxphone";
                            else if(rs2.getInt(1)==17)
                                skill="Violin";
                            else if(rs2.getInt(1)==18)
                                skill="Vocal";
                            else if(rs2.getInt(1)==19)
                                skill="Cantonese";
                            else if(rs2.getInt(1)==20)
                                skill="Chinese";
                            else if(rs2.getInt(1)==21)
                                skill="English";
                            else if(rs2.getInt(1)==22)
                                skill="French";
                            else if(rs2.getInt(1)==23)
                                skill="Japanese";
                            else skill="Korean";
                                Statement st1 = conn.createStatement();
                                ResultSet rs = st1.executeQuery("SELECT USER_NAME FROM USER_INFO WHERE EMAIL='"+rs2.getString(2)+"'");
                                while(rs.next()){
                                        %>
				<div class="NewPartner">
                                	<img alt="Partner" src="icon/boy_icon.png" height="25px" width="25px" />
                                    <h3><%=rs.getString(1)%></h3>
                                    <p><b><%=skill%></b></p>
                                </div>
                                <%}}}catch( SQLException cnfe)
        {
            cnfe.printStackTrace();
        }%>
                                        <%
                                skill="";
                                email="";
                                try{
                                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn");
                                Statement st = conn.createStatement();
                                ResultSet rs2 = st.executeQuery("SELECT SKILL_ID,TEACHER_EMAIL FROM MATCH_REQUEST WHERE LEARNER_EMAIL='"+session.getAttribute("eMail")+"' AND MATCH_STATUS='accepted'");
                                while(rs2.next()){
                                email=rs2.getString(2);
                                if(rs2.getInt(1)==1)
                                skill="C++";
                            else if(rs2.getInt(1)==2)
                                skill="Excel";
                            else if(rs2.getInt(1)==3)
                                skill="HTML";
                            else if(rs2.getInt(1)==4)
                                skill="Java";
                            else if(rs2.getInt(1)==5)
                                skill="Photoshop";
                            else if(rs2.getInt(1)==6)
                                skill="SQL";
                            else if(rs2.getInt(1)==7)
                                skill="Basketball";
                            else if(rs2.getInt(1)==8)
                                skill="Badminton";
                            else if(rs2.getInt(1)==9)
                                skill="Tennis";
                            else if(rs2.getInt(1)==10)
                                skill="Jogging";
                            else if(rs2.getInt(1)==11)
                                skill="Skateboard";
                            else if(rs2.getInt(1)==12)
                                skill="Swimming";
                            else if(rs2.getInt(1)==13)
                                skill="Drum";
                            else if(rs2.getInt(1)==14)
                                skill="Guitar";
                            else if(rs2.getInt(1)==15)
                                skill="Piano";
                            else if(rs2.getInt(1)==16)
                                skill="Saxphone";
                            else if(rs2.getInt(1)==17)
                                skill="Violin";
                            else if(rs2.getInt(1)==18)
                                skill="Vocal";
                            else if(rs2.getInt(1)==19)
                                skill="Cantonese";
                            else if(rs2.getInt(1)==20)
                                skill="Chinese";
                            else if(rs2.getInt(1)==21)
                                skill="English";
                            else if(rs2.getInt(1)==22)
                                skill="French";
                            else if(rs2.getInt(1)==23)
                                skill="Japanese";
                            else skill="Korean";
                                                                Statement st2 = conn.createStatement();
                                ResultSet rs = st2.executeQuery("SELECT USER_NAME FROM USER_INFO WHERE EMAIL='"+rs2.getString(2)+"'");
                                while(rs.next()){
                                        %>
				<div class="NewPartner">
                                	<img alt="Partner" src="icon/boy_icon.png" height="25px" width="25px" />
                                    <h3><%=rs.getString(1)%></h3>
                                    <p><b><%=skill%></b></p>
                                </div>
                                <%}}}catch( SQLException cnfe)
        {
            cnfe.printStackTrace();
        }%>
			    </li>
                         </ul>
                    </div>
                </div>
            </div>
        </div>
    </main>
</body>
</html>