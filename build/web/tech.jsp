<%-- 
    Document   : tech
    Created on : Nov 28, 2014, 10:19:56 PM
    Author     : SONGSONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="CSS/Index.css" rel="stylesheet" type="text/css" />
        <link href="CSS/skill.css" rel="stylesheet" type="text/css" />
        <title>Technology</title>
    </head>
    
	<body>

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
                <div class="skill">
                	<img src="icon/skill_html.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="3" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
                <div class="skill">
                	<img src="icon/skill_c++.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="1" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
                <div class="skill">
                	<img src="icon/skill_excel.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="2" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
                <div class="skill">
                	<img src="icon/skill_java.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="4" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
                <div class="skill">
                	<img src="icon/skill_ps.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="5" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
                <div class="skill">
                	<img src="icon/skill_sql.png" width="300" height="224" alt=""/> 
                    <div class="find">
                    <% 
                    if (session.getAttribute("login") == null) {
                    %><a href="Signin.html">
                    <img src="icon/button_find.png" width="201" height="34" alt=""/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                        <input type="hidden" name="skillid" value="6" />
                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                        <input type="image" src="icon/button_find.png" width="201" height="34" alt="find a partner"/>
                    </form>
                    <%}%>
                    </div>
                </div>
            </div>
        </div>
    </main>
</body>
</html>