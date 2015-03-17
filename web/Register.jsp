<%-- 
    Document   : Register1
    Created on : Nov 29, 2014, 10:35:50 PM
    Author     : SONGSONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="CSS/Register.css" />
<title>Register</title>
<script type="text/javascript" src="jquery.idTabs.min.js"></script>
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<script type="text/javascript">
function showPage(page){
      var div = document.getElementById(page);
      if(div != null){
       div.style.visibility = "visible";
       div.style.display = "inline";
      }
     }
     
     function hidePage(page){
      var div = document.getElementById(page);
      if(div != null){
       
       div.style.visibility = 'hidden';
       div.style.display = 'none';
      }
     }
     
     function switchPage(hiddenPage , shownPage){
      hidePage(hiddenPage);
      showPage(shownPage);
	  return false;
     }    
    </script>
</head>

<body>
<div class="header">
	<a href="index.jsp" alt="Home page"><img alt="X-Learning" src="icon/xl-13.png" height="80%" style="margin-top: 0.4em; margin-left:48%;" /></a>
</div>
<main>
<form action="Register" method="post" accept-charset="UTF-8" target="_parent">
<div id="page1" style="visibility:true; display:inline">
	<nav class="navigate-bar">	
    	<img alt="INFORMATION" src="icon/info_o.png" height="100%"/>
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="SKILLS" src="icon/ski_b.png" height="100%" />
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="DECRIPTION" src="icon/des_b.png" height="100%" />
	</nav>
	<div class="contain">
        <div class="row">
            <div class="box" id="left">
            <p>GENDER</p>
            </div>
            <div class="box" id="right">
                <input type="radio" name="gender" id="male" value="male" />
                <label for="male"><img src="icon/boy_icon.png" alt="Male" width="40" height="40" /></label>
                <input type="radio" name="gender" id="male" value="female" />
                <label for="female"><img src="icon/girl_icon.png" alt="Female" width="50" height="40" /></label>      
            </div>
        </div>
        <div class="row">
            <div class="box" id="left">
            <p>COLLEGE</p>
            </div>
            <div class="box" id="right">
                <input type="radio" name="school" id="pitt" value="pitt" />
                <label for="pitt"><img src="icon/pitt_icon.png" alt="PITT" width="36" height="36" /></label>&nbsp;
                <input type="radio" name="school" id="cmu" value="cmu" />
                <label for="pitt"><img src="icon/cmu_icon.png" alt="CMU" width="36" height="36" /></label>      
            </div>
        </div>
    	<div class="row">
    	<div class="box" id="left">
        <p>EMAIL</p>
        </div>
        <div class="box" id="right">
        	<input type="email" name="eMail" id="eMail" placeholder="    ****@EMAIL.COM" size="35"
            maxlength="40" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
            <label for="eMail"></label>     
        </div>
    	</div>
        <div class="row">
            <div class="box" id="left">
            <p>PASSWORD</p>
            </div>
            <div class="box" id="right">
                <input type="password" name="password" id="password" placeholder="    8 characters" size="35"
                maxlength="8" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
                <label for="password"></label>     
            </div>
        </div>
        <div class="row">
            <div class="box" id="left">
            <p>USERNAME</p>
            </div>
            <div class="box" id="right">
                <input type="text" name="user_name" id="user_name" placeholder="    Username" size="35"
                maxlength="40" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
                <label for="user_name"></label>     
            </div>
        </div>
    	<div class="nextbutton">
    		<input type="image" src="icon/button_next.png" width="110" alt="NEXT" onclick="return switchPage('page1','page2');" />
            <p class="small">Already have an <b><a href="Signin.html">Account</a></b>.</p>
    	</div>
    </div>    
</div>

<div id="page2" style="visibility:hidden; display:none">
	<nav class="navigate-bar">	
    	<img alt="INFORMATION" src="icon/info_b.png" height="100%"/>
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="SKILLS" src="icon/ski_o.png" height="100%" />
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="DECRIPTION" src="icon/des_b.png" height="100%" />
	</nav>
    <div class="contain">
    	<div class="row">
    		<div class="box" id="left">
        		<p>MAJOR</p>
        	</div>
        	<div class="box" id="right">
        		<input type="text" name="major" id="major" placeholder="    MSIS" size="35"
            maxlength="40" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
            <label for="major"></label>     
        	</div>
    	</div>
        <div class="rowNew">
        	<div class="box" id="left">
        			<p>SKILL</p>
        		</div>
            <div class="box" id="right">
            		<ul class="idTabs">
                    	<li><a class="selected" href="#TabTech"><img src="icon/icon-01.png" alt="Tech" height="30"/></a></li>
                        <li><a class="" href="#TabSport"><img src="icon/icon-02.png" alt="Sport" height="30" /></a></li>
                        <li><a class="" href="#TabMusic"><img src="icon/icon-03.png" alt="Music" height="30" /></a></li>
                        <li><a class="" href="#TabLanguage"><img src="icon/icon-04.png" alt="Language" height="30" /></a></li>
                    </ul>
                    <div class="Options" id="TabTech">
                    	<input type="checkbox" name="teach_skills" id="C" value="1" />C++
                        <input type="checkbox" name="teach_skills" id="Excel" value="2" />Excel
                        <input type="checkbox" name="teach_skills" id="HTML" value="3" />HTML <br />
                        <input type="checkbox" name="teach_skills" id="Java" value="4" />Java
                        <input type="checkbox" name="teach_skills" id="Photoshop" value="5" />Photoshop
                        <input type="checkbox" name="teach_skills" id="SQL" value="6" />SQL
                    </div>
                    <div class="Options" id="TabSport">
                    	<input type="checkbox" name="teach_skills" id="Basketball" value="7" />Basketball
                        <input type="checkbox" name="teach_skills" id="Badminton" value="8" />Badminton
                        <input type="checkbox" name="teach_skills" id="Tennis" value="9" />Tennis <br />
                        <input type="checkbox" name="teach_skills" id="Jogging" value="10" />Jogging
                        <input type="checkbox" name="teach_skills" id="Skateboard" value="11" />Skateboard
                        <input type="checkbox" name="teach_skills" id="Swimming" value="12" />Swimming
                    </div>
                    <div class="Options" id="TabMusic">
                    	<input type="checkbox" name="teach_skills" id="Drum" value="13" />Drum
                        <input type="checkbox" name="teach_skills" id="Guitar" value="14" />Guitar
                        <input type="checkbox" name="teach_skills" id="Piano" value="15" />Piano <br />
                        <input type="checkbox" name="teach_skills" id="Saxphone" value="16" />Saxphone
                        <input type="checkbox" name="teach_skills" id="Violin" value="17" />Violin
                        <input type="checkbox" name="teach_skills" id="Vocal" value="18" />Vocal
                    </div>
                    <div class="Options" id="TabLanguage">
                    	<input type="checkbox" name="teach_skills" id="Cantonese" value="19" />Cantonese
                        <input type="checkbox" name="teach_skills" id="Chinese" value="20" />Chinese
                        <input type="checkbox" name="teach_skills" id="English" value="21" />English <br />
                        <input type="checkbox" name="teach_skills" id="French" value="22" />French
                        <input type="checkbox" name="teach_skills" id="Japanese" value="23" />Japanese
                        <input type="checkbox" name="teach_skills" id="Korean" value="24" />Korean
                    </div>
            	</div>
         </div> 
        <div class="rowNew">
        	<div class="box" id="left">
        			<p>WANT TO LEARN</p>
        		</div>
            <div class="box" id="right">
            		<ul class="idTabs">
                    	<li><a class="selected" href="#TabTechLearn"><img src="icon/icon-01.png" alt="Tech" height="30"/></a></li>
                        <li><a class="" href="#TabSportLearn"><img src="icon/icon-02.png" alt="Sport" height="30" /></a></li>
                        <li><a class="" href="#TabMusicLearn"><img src="icon/icon-03.png" alt="Music" height="30" /></a></li>
                        <li><a class="" href="#TabLanguageLearn"><img src="icon/icon-04.png" alt="Language" height="30" /></a></li>
                    </ul>
                    <div class="Options" id="TabTechLearn">
                    	<input type="checkbox" name="learn_skills" id="C" value="1" />C++
                        <input type="checkbox" name="learn_skills" id="Excel" value="2" />Excel
                        <input type="checkbox" name="learn_skills" id="HTML" value="3" />HTML <br />
                        <input type="checkbox" name="learn_skills" id="Java" value="4" />Java
                        <input type="checkbox" name="learn_skills" id="Photoshop" value="5" />Photoshop
                        <input type="checkbox" name="learn_skills" id="SQL" value="6" />SQL
                    </div>
                    <div class="Options" id="TabSportLearn">
                    	<input type="checkbox" name="learn_skills" id="Basketball" value="7" />Basketball
                        <input type="checkbox" name="learn_skills" id="Badminton" value="8" />Badminton
                        <input type="checkbox" name="learn_skills" id="Tennis" value="9" />Tennis <br />
                        <input type="checkbox" name="learn_skills" id="Jogging" value="10" />Jogging
                        <input type="checkbox" name="learn_skills" id="Skateboard" value="11" />Skateboard
                        <input type="checkbox" name="learn_skills" id="Swimming" value="12" />Swimming
                    </div>
                    <div class="Options" id="TabMusicLearn">
                    	<input type="checkbox" name="learn_skills" id="Drum" value="13" />Drum
                        <input type="checkbox" name="learn_skills" id="Guitar" value="14" />Guitar
                        <input type="checkbox" name="learn_skills" id="Piano" value="15" />Piano <br />
                        <input type="checkbox" name="learn_skills" id="Saxphone" value="16" />Saxphone
                        <input type="checkbox" name="learn_skills" id="Violin" value="17" />Violin
                        <input type="checkbox" name="learn_skills" id="Vocal" value="18" />Vocal
                    </div>
                    <div class="Options" id="TabLanguageLearn">
                    	<input type="checkbox" name="learn_skills" id="Cantonese" value="19" />Cantonese
                        <input type="checkbox" name="learn_skills" id="Chinese" value="20" />Chinese
                        <input type="checkbox" name="learn_skills" id="English" value="21" />English <br />
                        <input type="checkbox" name="learn_skills" id="French" value="22" />French
                        <input type="checkbox" name="learn_skills" id="Japanese" value="23" />Japanese
                        <input type="checkbox" name="learn_skills" id="Korean" value="24" />Korean
                    </div>
            </div>
         </div>        
        <div class="nextbutton">
    		<input type="image" src="icon/button_back.png" alt="BACK" width="110"onclick="return switchPage('page2','page1');" />&nbsp;&nbsp;&nbsp;
            <input type="image" src="icon/button_next.png" alt="NEXT" width="110"onclick="return switchPage('page2','page3');" />
            <p class="small">Already have an <b><a href="Signin.html">Account</a></b>.</p>
    	</div>
    </div>
</div>

<div id="page3" style="visibility:hidden; display:none">
	<nav class="navigate-bar">	
    	<img alt="INFORMATION" src="icon/info_b.png" height="100%"/>
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="SKILLS" src="icon/ski_b.png" height="100%" />
        <img alt="------" src="icon/line.png" height="100%" />
        <img alt="DECRIPTION" src="icon/des_o.png" height="100%" />
	</nav>
    <div class="contain">
    	<div class="DesRow">
        	<p>CHOOSE YOUR AVALIBLE TIME:</p><br />
            <div class="TimeList">
            	<input type="checkbox" name="available_time" id="Monday" value="1" />MONDAY
                <input type="checkbox" name="available_time" id="Tuesday" value="2" />TUESDAY
                <input type="checkbox" name="available_time" id="Wednesday" value="3" />WEDNESDAY
                <input type="checkbox" name="available_time" id="Thursday" value="4" />THURSDAY
                <input type="checkbox" name="available_time" id="Friday" value="5" />FRIDAY
                <input type="checkbox" name="available_time" id="Saturday" value="6" />SATURDAY
                <input type="checkbox" name="available_time" id="Sunday" value="7" />SUNDAY
            </div>
        </div>
        <div class="DesRow">
        	<p>WRITE SOMETHING TO DESCRIPTE YOURSELF:</p><br />
            <textarea name="motto" rows="4" cols="50" placeholder="Hello everyone. My name is..."  ></textarea>
        </div>
    	<div class="nextbutton">
    		<input type="image" src="icon/button_back.png" width="110" alt="BACK" onclick="return switchPage('page3','page2');" />&nbsp;&nbsp;&nbsp;
            <input type="image" src="icon/button_signup.png" width="110" alt="SignUp"/>
            <p class="small">Already have an <b><a href="Signin.html">Account</a></b>.</p>
    	</div>
     </div>
</div>
</form>	
</main>
</body>
</html>
