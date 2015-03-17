package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link href=\"CSS/Index_bn.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Index\n");
      out.write("        \n");
      out.write("        </title>\n");
      out.write("    \t<script type=\"text/javascript\" src=\"index.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\t<body onload=\"MM_preloadImages('icon/cat_o_mus.png')\">\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("        \t<div class=\"logo\">\n");
      out.write("            \t<a href=\"index.jsp\" alt=\"Home page\">\n");
      out.write("                <img src=\"icon/xl-13.png\" alt=\"X-Learning\" height=\"80%\" class=\"logoimg\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"welcome\">\n");
      out.write("            \t<div id=\"personal\">\n");
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
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contain\">\n");
      out.write("            <div class='col-left'>              \n");
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
      out.write("                        <a data-toggle=\"collapse\" data-parent=\"#miSider\" href=\"Plaza.jsp\">PLAZA</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class='col-remaining'>\n");
      out.write("                <div class=\"category\" onmouseout=\"restoreM()\"  onmouseover=\"swapM()\">\n");
      out.write("    \t\t\t\t<map name=\"MapMusic\" id=\"MapMusic\" onmouseover=\"MM_swapImage('music','','icon/cat_mus.png',1)\">\n");
      out.write("                        <area shape=\"rect\" coords=\"5,210,298,256\" href=\"music.jsp\" alt=\"find out more\" />\n");
      out.write("                    </map>\t\n");
      out.write("                    <img src=\"icon/cat_mus.png\" alt=\"\" width=\"300\" id=\"music\"   usemap=\"#MapMusic\"/>\n");
      out.write("                    <table id=\"musictb\" class=\"hide\">\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                       ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_drum.png\" width=\"100\" height=\"37\" alt=\"Drum\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"get\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"13\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_drum.png\" width=\"100\" height=\"37\" alt=\"Drum\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_guitar.png\" width=\"100\" height=\"37\" alt=\"Guitar\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"get\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"14\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_guitar.png\" width=\"100\" height=\"37\" alt=\"Guitar\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_piano.png\" width=\"100\" height=\"37\" alt=\"Piano\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"15\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_piano.png\" width=\"100\" height=\"37\" alt=\"Piano\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_saxphone.png\" width=\"100\" height=\"37\" alt=\"Saxphone\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"16\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_saxphone.png\" width=\"100\" height=\"37\" alt=\"Saxphone\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_violin.png\" width=\"100\" height=\"37\" alt=\"Violin\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"17\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_violin.png\" width=\"100\" height=\"37\" alt=\"Violin\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_vocal.png\" width=\"100\" height=\"37\" alt=\"Vocal\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"18\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_vocal.png\" width=\"100\" height=\"37\" alt=\"Vocal\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                    </table>\n");
      out.write("             \t</div>\n");
      out.write("                <div class=\"category\" onmouseout=\"restoreL()\"  onmouseover=\"swapL()\">\n");
      out.write("    \t\t\t\t<map name=\"MapLang\" id=\"MapLang\" onmouseover=\"MM_swapImage('lang','','icon/cat_lang.png',1)\">\n");
      out.write("                        <area shape=\"rect\" coords=\"5,210,298,256\" href=\"lang.jsp\" alt=\"find out more\" />\n");
      out.write("                    </map>\t\n");
      out.write("                    <img src=\"icon/cat_lang.png\" alt=\"\" width=\"300\" id=\"lang\"   usemap=\"#MapLang\"/>\n");
      out.write("                    <table id=\"langtb\" class=\"hide\">\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_cantonese.png\" width=\"100\" height=\"37\" alt=\"Cantonese\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"19\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_cantonese.png\" width=\"100\" height=\"37\" alt=\"Cantonese\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_chinese.png\" width=\"100\" height=\"37\" alt=\"Chinese\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"20\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_chinese.png\" width=\"100\" height=\"37\" alt=\"Chinese\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img  src=\"icon/skillbutton_english.png\" width=\"100\" height=\"37\" alt=\"English\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"21\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_english.png\" width=\"100\" height=\"37\" alt=\"English\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_french.png\" width=\"100\" height=\"37\" alt=\"French\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"22\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_french.png\" width=\"100\" height=\"37\" alt=\"French\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_japanses.png\" width=\"100\" height=\"37\" alt=\"Japanese\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"23\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_japanses.png\" width=\"100\" height=\"37\" alt=\"Japanese\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                                                ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_korean.png\" width=\"100\" height=\"37\" alt=\"Korean\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                          <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                            <input type=\"hidden\" name=\"skillid\" value=\"24\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                            <input type=\"image\" src=\"icon/skillbutton_korean.png\" width=\"100\" height=\"37\" alt=\"Korean\"/>\n");
      out.write("                          </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                    </table>\n");
      out.write("             \t</div>\n");
      out.write("                <div class=\"category\" onmouseout=\"restoreT()\"  onmouseover=\"swapT()\">\n");
      out.write("    \t\t\t\t<map name=\"MapTech\" id=\"MapTech\" onmouseover=\"MM_swapImage('tech','','icon/cat_tech.png',1)\">\n");
      out.write("                        <area shape=\"rect\" coords=\"5,210,298,256\" href=\"tech.jsp\" alt=\"find out more\" />\n");
      out.write("                    </map>\t\n");
      out.write("                    <img src=\"icon/cat_tech.png\" alt=\"\" width=\"300\" id=\"tech\"   usemap=\"#MapTech\"/>\n");
      out.write("                        <table id=\"techtb\" class=\"hide\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_c++.png\" width=\"100\" height=\"37\" alt=\"C++\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                \t<form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"1\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_c++.png\" width=\"100\" height=\"37\" alt=\"C++\"/>\n");
      out.write("                                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_photoshop.png\" width=\"100\" height=\"37\" alt=\"photoshop\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                \t<form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"5\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_photoshop.png\" width=\"100\" height=\"37\" alt=\"photoshop\"/>\n");
      out.write("                                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_java.png\" width=\"100\" height=\"37\" alt=\"java\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                \t<form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"4\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_java.png\" width=\"100\" height=\"37\" alt=\"java\"/>\n");
      out.write("                                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_excel.png\" width=\"100\" height=\"37\" alt=\"excel\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                    <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"2\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_excel.png\" width=\"100\" height=\"37\" alt=\"excel\"/>\n");
      out.write("                                  \t</form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_sql.png\" width=\"100\" height=\"37\" alt=\"SQL\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                    <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"6\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_sql.png\" width=\"100\" height=\"37\" alt=\"SQL\"/>\n");
      out.write("                                  \t</form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_html.png\" width=\"100\" height=\"37\" alt=\"html\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                                    <form name=\"matchskill\" method=\"post\" action=\"match\">\n");
      out.write("                                        <input type=\"hidden\" name=\"skillid\" value=\"3\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                        <input type=\"image\" src=\"icon/skillbutton_html.png\" width=\"100\" height=\"37\" alt=\"html\"/>\n");
      out.write("                                  \t</form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("             \t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"category\" onmouseout=\"restoreS()\"  onmouseover=\"swapS()\">\n");
      out.write("    \t\t\t\t<map name=\"MapSport\" id=\"MapSport\" onmouseover=\"MM_swapImage('sport','','icon/cat_spo.png',1)\">\n");
      out.write("                        <area shape=\"rect\" coords=\"5,210,298,256\" href=\"sport.jsp\" alt=\"find out more\" />\n");
      out.write("                    </map>\t\n");
      out.write("                    <img src=\"icon/cat_spo.png\" alt=\"\" width=\"300\" id=\"sport\"   usemap=\"#MapSport\"/>\n");
      out.write("                    <form method=\"post\" name=\"matchform\" action=\"match\">\n");
      out.write("                        <table id=\"sporttb\" class=\"hide\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_basketball.png\" width=\"100\" height=\"37\" alt=\"Basketball\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"7\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                    <input type=\"image\" src=\"icon/skillbutton_basketball.png\" width=\"100\" height=\"37\" alt=\"Basketball\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_badminton.png\" width=\"100\" height=\"37\" alt=\"Badminton\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"8\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                     <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                    <input type=\"image\" src=\"icon/skillbutton_badminton.png\" width=\"100\" height=\"37\" alt=\"Badminton\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_tennis.png\" width=\"100\" height=\"37\" alt=\"Tennis\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"9\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                   <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                  <input type=\"image\" src=\"icon/skillbutton_tennis.png\" width=\"100\" height=\"37\" alt=\"Tennis\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("                                    \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_jogging.png\" width=\"100\" height=\"37\" alt=\"Jogging\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"10\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                   <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                  <input type=\"image\" src=\"icon/skillbutton_jogging.png\" width=\"100\" height=\"37\" alt=\"Jogging\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_skateboard.png\" width=\"100\" height=\"37\" alt=\"Skateboard\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"11\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                   <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                  <input type=\"image\" src=\"icon/skillbutton_skateboard.png\" width=\"100\" height=\"37\" alt=\"Skateboard\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                                        ");
 
                    if (session.getAttribute("login") == null){
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/skillbutton_swimming.png\"width=\"100\" height=\"37\" alt=\"Swimming\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"skillid\" value=\"12\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"eMail\" value=\"");
      out.print(session.getAttribute("eMail"));
      out.write("\"/>\n");
      out.write("                                   <input type=\"hidden\" name=\"time\" value=\"");
      out.print(session.getAttribute("available_time"));
      out.write("\"/>\n");
      out.write("                                  <input type=\"image\" src=\"icon/skillbutton_swimming.png\" width=\"100\" height=\"37\" alt=\"Swimming\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                     <form>\n");
      out.write("   \t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
