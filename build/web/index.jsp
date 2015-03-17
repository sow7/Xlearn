<%-- 
    Document   : index
    Created on : Nov 28, 2014, 10:12:54 PM
    Author     : SONGSONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="CSS/Index_bn.css" rel="stylesheet" type="text/css" />
        <title>Index
        
        </title>
    	<script type="text/javascript" src="index.js"></script>
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
                <div class="category" onmouseout="restoreM()"  onmouseover="swapM()">
    				<map name="MapMusic" id="MapMusic" onmouseover="MM_swapImage('music','','icon/cat_mus.png',1)">
                        <area shape="rect" coords="5,210,298,256" href="music.jsp" alt="find out more" />
                    </map>	
                    <img src="icon/cat_mus.png" alt="" width="300" id="music"   usemap="#MapMusic"/>
                    <table id="musictb" class="hide">
                      <tr>
                        <td>
                       <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_drum.png" width="100" height="37" alt="Drum"/></a>
                    <% }else{%>
                          <form name="matchskill" method="get" action="match">
                            <input type="hidden" name="skillid" value="13"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_drum.png" width="100" height="37" alt="Drum"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_guitar.png" width="100" height="37" alt="Guitar"/></a>
                    <% }else{%>
                          <form name="matchskill" method="get" action="match">
                            <input type="hidden" name="skillid" value="14"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_guitar.png" width="100" height="37" alt="Guitar"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                      <tr>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_piano.png" width="100" height="37" alt="Piano"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="15"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_piano.png" width="100" height="37" alt="Piano"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_saxphone.png" width="100" height="37" alt="Saxphone"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="16"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_saxphone.png" width="100" height="37" alt="Saxphone"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                      <tr>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_violin.png" width="100" height="37" alt="Violin"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="17"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_violin.png" width="100" height="37" alt="Violin"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_vocal.png" width="100" height="37" alt="Vocal"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="18"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_vocal.png" width="100" height="37" alt="Vocal"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                    </table>
             	</div>
                <div class="category" onmouseout="restoreL()"  onmouseover="swapL()">
    				<map name="MapLang" id="MapLang" onmouseover="MM_swapImage('lang','','icon/cat_lang.png',1)">
                        <area shape="rect" coords="5,210,298,256" href="lang.jsp" alt="find out more" />
                    </map>	
                    <img src="icon/cat_lang.png" alt="" width="300" id="lang"   usemap="#MapLang"/>
                    <table id="langtb" class="hide">
                      <tr>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_cantonese.png" width="100" height="37" alt="Cantonese"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="19"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_cantonese.png" width="100" height="37" alt="Cantonese"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_chinese.png" width="100" height="37" alt="Chinese"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="20"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_chinese.png" width="100" height="37" alt="Chinese"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                      <tr>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img  src="icon/skillbutton_english.png" width="100" height="37" alt="English"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="21"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_english.png" width="100" height="37" alt="English"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_french.png" width="100" height="37" alt="French"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="22"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_french.png" width="100" height="37" alt="French"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                      <tr>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_japanses.png" width="100" height="37" alt="Japanese"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="23"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_japanses.png" width="100" height="37" alt="Japanese"/>
                          </form>
                    <%}%>
                        </td>
                        <td>
                                                <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_korean.png" width="100" height="37" alt="Korean"/></a>
                    <% }else{%>
                          <form name="matchskill" method="post" action="match">
                            <input type="hidden" name="skillid" value="24"/>
                            <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                            <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                            <input type="image" src="icon/skillbutton_korean.png" width="100" height="37" alt="Korean"/>
                          </form>
                    <%}%>
                        </td>
                      </tr>
                    </table>
             	</div>
                <div class="category" onmouseout="restoreT()"  onmouseover="swapT()">
    				<map name="MapTech" id="MapTech" onmouseover="MM_swapImage('tech','','icon/cat_tech.png',1)">
                        <area shape="rect" coords="5,210,298,256" href="tech.jsp" alt="find out more" />
                    </map>	
                    <img src="icon/cat_tech.png" alt="" width="300" id="tech"   usemap="#MapTech"/>
                        <table id="techtb" class="hide">
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_c++.png" width="100" height="37" alt="C++"/></a>
                    <% }else{%>
                                	<form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="1"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_c++.png" width="100" height="37" alt="C++"/>
                                    </form>
                    <%}%>
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_photoshop.png" width="100" height="37" alt="photoshop"/></a>
                    <% }else{%>
                                	<form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="5"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_photoshop.png" width="100" height="37" alt="photoshop"/>
                                    </form>
                    <%}%>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_java.png" width="100" height="37" alt="java"/></a>
                    <% }else{%>
                                	<form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="4"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_java.png" width="100" height="37" alt="java"/>
                                    </form>
                    <%}%>
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_excel.png" width="100" height="37" alt="excel"/></a>
                    <% }else{%>
                                    <form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="2"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_excel.png" width="100" height="37" alt="excel"/>
                                  	</form>
                    <%}%>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_sql.png" width="100" height="37" alt="SQL"/></a>
                    <% }else{%>
                                    <form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="6"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_sql.png" width="100" height="37" alt="SQL"/>
                                  	</form>
                    <%}%>
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_html.png" width="100" height="37" alt="html"/></a>
                    <% }else{%>
                                    <form name="matchskill" method="post" action="match">
                                        <input type="hidden" name="skillid" value="3"/>
                                        <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                        <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                        <input type="image" src="icon/skillbutton_html.png" width="100" height="37" alt="html"/>
                                  	</form>
                    <%}%>
                                </td>
                            </tr>
                        </table>
                        
                    
             	</div>
                
                <div class="category" onmouseout="restoreS()"  onmouseover="swapS()">
    				<map name="MapSport" id="MapSport" onmouseover="MM_swapImage('sport','','icon/cat_spo.png',1)">
                        <area shape="rect" coords="5,210,298,256" href="sport.jsp" alt="find out more" />
                    </map>	
                    <img src="icon/cat_spo.png" alt="" width="300" id="sport"   usemap="#MapSport"/>
                    <form method="post" name="matchform" action="match">
                        <table id="sporttb" class="hide">
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_basketball.png" width="100" height="37" alt="Basketball"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="7"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                    <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                    <input type="image" src="icon/skillbutton_basketball.png" width="100" height="37" alt="Basketball"/>
                    </form>
                    <%}%>
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_badminton.png" width="100" height="37" alt="Badminton"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="8"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                     <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                    <input type="image" src="icon/skillbutton_badminton.png" width="100" height="37" alt="Badminton"/>
                    </form>
                    <%}%>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_tennis.png" width="100" height="37" alt="Tennis"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="9"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                   <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                  <input type="image" src="icon/skillbutton_tennis.png" width="100" height="37" alt="Tennis"/>
                    </form>
                    <%}%>                                    
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_jogging.png" width="100" height="37" alt="Jogging"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="10"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                   <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                  <input type="image" src="icon/skillbutton_jogging.png" width="100" height="37" alt="Jogging"/>
                    </form>
                    <%}%>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_skateboard.png" width="100" height="37" alt="Skateboard"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="11"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                   <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                  <input type="image" src="icon/skillbutton_skateboard.png" width="100" height="37" alt="Skateboard"/>
                    </form>
                    <%}%>
                                </td>
                                <td>
                                                        <% 
                    if (session.getAttribute("login") == null){
                    %><a href="Signin.html">
                    <img src="icon/skillbutton_swimming.png"width="100" height="37" alt="Swimming"/></a>
                    <% }else{%>
                    <form action="match" name="matchskill" method="post">
                                    <input type="hidden" name="skillid" value="12"/>
                                    <input type="hidden" name="eMail" value="<%=session.getAttribute("eMail")%>"/>
                                   <input type="hidden" name="time" value="<%=session.getAttribute("available_time")%>"/>
                                  <input type="image" src="icon/skillbutton_swimming.png" width="100" height="37" alt="Swimming"/>
                    </form>
                    <%}%>
                                </td>
                            </tr>
                        </table>
                     <form>
   	</div>
            </div>
        </div>
    </main>
</body>
</html>
