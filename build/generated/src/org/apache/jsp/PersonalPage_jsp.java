package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PersonalPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link href=\"CSS/PersonalPage.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/reset.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"modernizr.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"main.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-2.1.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"index.js\"></script>\n");
      out.write("        <title>PersonalPage</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("        \t<div class=\"logo\">\n");
      out.write("            \t<a href=\"index.jsp\" alt=\"Home page\">\n");
      out.write("                <img src=\"icon/xl-13.png\" alt=\"X-Learning\" height=\"80%\" class=\"logoimg\" /> </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"welcome\">\n");
      out.write("                <div id=\"personal\">\n");
      out.write("                ");
 
        if(session.getAttribute("login") == null) {
            
      out.write("      <h5><a href=\"Signin.html\" alt=\"Personal page\">\n");
      out.write("                                        SIGN IN  /</a>\n");
      out.write("                    <a href=\"Register.jsp\" alt=\"Personal page\">\n");
      out.write("                    SIGN UP</a></h5>\n");
      out.write("            ");
 }else{if(session.getAttribute("gender1").equals("male")){
      out.write("\n");
      out.write("                <a href=\"PersonalPage.jsp\" alt=\"Personal page\">\n");
      out.write("                <img src=\"icon/boy_icon.png\" width=\"50\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("                <div class=\"signout\">   \n");
      out.write("                <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n");
      out.write("                    <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n");
      out.write("                </form></div>\n");
      out.write("              ");
}else{
      out.write("\n");
      out.write("                <a href=\"PersonalPage.jsp\" alt=\"Personal page\">\n");
      out.write("                <img src=\"icon/girl_icon.png\" width=\"60\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("                <div class=\"signout\">   \n");
      out.write("                <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n");
      out.write("                    <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n");
      out.write("                </form></div>\n");
      out.write("        ");
}}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contain\">\n");
      out.write("            <div class='col-left'>\n");
      out.write("                <ul id=\"miSider\">\n");
      out.write("                    <li class=\"panel\">\t\n");
      out.write("                        <a data-toggle=\"collapse\" data-parent=\"#miSider\">SKILL</a>\n");
      out.write("                        <ul id=\"subMenu-1\" class=\"collapse in\">\n");
      out.write("                            <li><a href=\"music.jsp\">&nbsp;&nbsp;MUSIC</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"lang.jsp\">&nbsp;&nbsp;LANGUAGE</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"tech.jsp\">&nbsp;&nbsp;TECHNOLOGY</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"sport.jsp\">&nbsp;&nbsp;SPORT</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"panel\">\t\n");
      out.write("                        <a data-toggle=\"collapse\" data-parent=\"#miSider\" href=\"Plaza.html\">PLAZA</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>             \n");
      out.write("            </div>\n");
      out.write("            <div class='col-remaining'>\n");
      out.write("                <div id=\"PersonalInfo\" class=\"con-left\">\n");
      out.write("                    <div class=\"PersonHeader\">\n");
      out.write("                    \t<div class=\"PersonalImage\">\n");
      out.write("                            \n");
      out.write("                            ");
 if(session.getAttribute("gender").equals("male")){ 
      out.write("\n");
      out.write("                                <img src=\"icon/boy_icon.png\" alt=\"BOY\" height=\"130\" />\n");
      out.write("                                ");
}else{
      out.write("\n");
      out.write("                                <img src=\"icon/girl_icon.png\" alt=\"GIRL\" height=\"130\" />");
}
      out.write("\n");
      out.write("                        \t<!--<img src=\"icon/boy_icon.png\" alt=\"BOY\" height=\"130\" />-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"PersonalDetail\">\n");
      out.write("                        \t<div class=\"CollegeIcon\">\n");
      out.write("                            \t");
 if(session.getAttribute("school").equals("cmu")){ 
      out.write("\n");
      out.write("                                <img src=\"icon/cmu_icon.png\" alt=\"CMU\" height=\"50\" />\n");
      out.write("                                ");
}else{
      out.write("\n");
      out.write("                                <img src=\"icon/pitt_icon.png\" alt=\"PITT\" height=\"50\" />");
}
      out.write("\n");
      out.write("                            \t<!--<img src=\"icon/cmu_icon.png\" alt=\"CMU\" height=\"50\" />-->\n");
      out.write("                            </div>\n");
      out.write("                            <h1><b>");
      out.print( session.getAttribute("user_name"));
      out.write("</b></h1>\n");
      out.write("                            <!--<h1><b>Username</b></h1>-->\n");
      out.write("                            <h3>");
      out.print( session.getAttribute("major"));
      out.write("</h3>\n");
      out.write("                            <!--<h3>MSIS</h3>-->\n");
      out.write("                            <h3>\n");
      out.write("                                ");
 String time1 = session.getAttribute("available_time").toString();
                                char[] time = time1.toCharArray();
                                String time2="";
                                for(int i=0;i<time.length;i++)
                                {
                                    if(time[i]=='|'){
                                        if(time2.equals("1")) {
      out.write("Mon.&nbsp;&nbsp;");
;}
                                        else if(time2.equals("2")) {
      out.write("Tue.&nbsp;&nbsp;");
;}
                                        else if(time2.equals("3")) {
      out.write("Wed.&nbsp;&nbsp;");
;}
                                        else if(time2.equals("4")) {
      out.write("Thu.&nbsp;&nbsp;");
;}
                                        else if(time2.equals("5")) {
      out.write("Fri.&nbsp;&nbsp;");
;}
                                        else if(time2.equals("6")) {
      out.write("Sat.&nbsp;&nbsp;");
;}
                                        else {
      out.write("Sun.&nbsp;&nbsp;");
;}
                                        time2="";
                                        continue;
                                    }else{time2=time2+time[i];}
                                }
                                
      out.write("</h3>\n");
      out.write("                            <!--<h3>Mon.&nbsp;&nbsp;Tue.</h3>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"PersonContent\">\n");
      out.write("                    \t<p>");
      out.print( session.getAttribute("motto"));
      out.write("</p>\n");
      out.write("                    \t<!--<p>Hello everyone! <br />My name is Username and I'm a test account. <br />lol~</p>-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"PersonSkills\">\n");
      out.write("                    \t<div class=\"Teach\">\n");
      out.write("                        \t<p>I can teach:<b>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                ");
 String tskill1 = session.getAttribute("teach_skills").toString();
                                char[] tskill = tskill1.toCharArray();
                                String tskill2="";
                                for(int i=0;i<tskill.length;i++)
                                {
                                    if(tskill[i]=='|'){
                                        if(tskill2.equals("1")) {
      out.write("C++&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("2")) {
      out.write("Excel&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("3")) {
      out.write("HTML&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("4")) {
      out.write("Java&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("5")) {
      out.write("Photoshop&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("6")) {
      out.write("SQL&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("7")) {
      out.write("Basketball&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("8")) {
      out.write("Badminton&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("9")) {
      out.write("Tennis&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("10")){
      out.write("Jogging&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("11")) {
      out.write("Skateboard&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("12")) {
      out.write("Swimming&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("13")) {
      out.write("Drum&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("14")) {
      out.write("Guitar&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("15")) {
      out.write("Piano&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("16")) {
      out.write("Saxphone&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("17")) {
      out.write("Violin&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("18")) {
      out.write("Vocal&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("19")) {
      out.write("Cantonese&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("20")) {
      out.write("Chinese&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("21")) {
      out.write("English&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("22")) {
      out.write("French&nbsp;&nbsp;");
;}
                                        else if(tskill2.equals("23")) {
      out.write("Japanese&nbsp;&nbsp;");
;}
                                        else {
      out.write("Korean&nbsp;&nbsp;");
;}
                                        tskill2="";
                                        continue;
                                    }else{
                                    tskill2=tskill2+tskill[i];}
                                }
                                
      out.write("</b></p>\n");
      out.write("                        \t<!--<p>I can teach:<b>&nbsp;&nbsp;&nbsp;&nbsp;C++&nbsp;&nbsp;Java</b></p>-->\n");
      out.write("                            <br />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"Learn\">\n");
      out.write("                        \t<p>I want to learn:<b>&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("                                        ");
 String lskill1 = session.getAttribute("learn_skills").toString();
                                char[] lskill = lskill1.toCharArray();
                                String lskill2="";
                                for(int i=0;i<lskill.length;i++)
                                {
                                    if(lskill[i]=='|'){
                                        if(lskill2.equals("1")) {
      out.write("C++&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("2")) {
      out.write("Excel&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("3")) {
      out.write("HTML&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("4")) {
      out.write("Java&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("5")) {
      out.write("Photoshop&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("6")) {
      out.write("SQL&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("7")) {
      out.write("Basketball&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("8")) {
      out.write("Badminton&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("9")) {
      out.write("Tennis&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("10")){
      out.write("Jogging&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("11")) {
      out.write("Skateboard&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("12")) {
      out.write("Swimming&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("13")) {
      out.write("Drum&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("14")) {
      out.write("Guitar&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("15")) {
      out.write("Piano&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("16")) {
      out.write("Saxphone&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("17")) {
      out.write("Violin&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("18")) {
      out.write("Vocal&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("19")) {
      out.write("Cantonese&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("20")) {
      out.write("Chinese&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("21")) {
      out.write("English&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("22")) {
      out.write("French&nbsp;&nbsp;");
;}
                                        else if(lskill2.equals("23")) {
      out.write("Japanese&nbsp;&nbsp;");
;}
                                        else {
      out.write("Korean&nbsp;&nbsp;");
;}
                                        lskill2="";
                                        continue;
                                    }else{
                                    lskill2=lskill2+lskill[i];}
                                }
                                
      out.write("</b></p>\n");
      out.write("                        \t<!--<p>I want to learn:<b>&nbsp;&nbsp;&nbsp;&nbsp;Basketball&nbsp;&nbsp;Drum</b></p>-->\n");
      out.write("                            <br />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"RightContent\" class=\"con-right\">\n");
      out.write("                \t<div class=\"cd-tabs\" style=\"margin-top: 10px;\">\n");
      out.write("                    \t<nav>\n");
      out.write("                        \t<ul class=\"cd-tabs-navigation\">\n");
      out.write("                            \t<li><a data-content=\"inbox\" class=\"selected\" href=\"#0\" style=\"padding-left: 35px; padding-right: 35px;\">Inbox</a></li>\n");
      out.write("                            \t<li><a data-content=\"partner\" href=\"#0\" style=\"padding-left: 35px; padding-right: 35px;\">Partner</a></li>\n");
      out.write("                        \t</ul> <!-- cd-tabs-navigation -->\n");
      out.write("                    \t</nav>\n");
      out.write("                        <ul class=\"cd-tabs-content\" style=\"width:260px;\">\n");
      out.write("\t\t\t\t\t\t\t<li data-content=\"inbox\" class=\"selected\" style=\"padding:20px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"Message\">\n");
      out.write("                                \t<img alt=\"NewMessage\" src=\"icon/message_u.png\" />\n");
      out.write("                                    <h5>Message Title</h5>\n");
      out.write("                                    <p>We are glad to inform you that {USER2} sent out a request in hope of learning ...</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"Message\">\n");
      out.write("                                \t<div class=\"Match_Mess\">\n");
      out.write("                                \t\t<img alt=\"NewMessage\" src=\"icon/message_u.png\" />\n");
      out.write("                                    \t<h5>Message Title</h5>\n");
      out.write("                                    \t<p>We are glad to inform you that {USER2} sent out a request in hope of learning ...</p>\n");
      out.write("                                \t</div>\n");
      out.write("                                    <div class=\"Match_Option\">\n");
      out.write("                                     <form action=\"match_option\" id=\"match_option\" method=\"post\">\n");
      out.write("                                            <input type=\"radio\" name=\"Options\" id=\"accept\" value=\"accept\" />\n");
      out.write("                                            <label for=\"accept\"><b>ACCEPT</b></label>\n");
      out.write("                                            <input type=\"radio\" name=\"Options\" id=\"reject\" value=\"reject\" />\n");
      out.write("                                            <label for=\"reject\"><b>REJECT</b></label>\n");
      out.write("                                    </form>\n");
      out.write("                                    </div>\n");
      out.write("                                 </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                            <li data-content=\"partner\" style=\"padding:20px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"NewPartner\">\n");
      out.write("                                \t<img alt=\"Partner\" src=\"icon/boy_icon.png\" height=\"25px\" width=\"25px\" />\n");
      out.write("                                    <h3>Username</h3>\n");
      out.write("                                    <p><b>C++</b></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"NewPartner\">\n");
      out.write("                                \t<img alt=\"Partner\" src=\"icon/boy_icon.png\" height=\"25px\" width=\"25px\" />\n");
      out.write("                                    <h3>Username</h3>\n");
      out.write("                                    <p><b>C++</b></p>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                         </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
