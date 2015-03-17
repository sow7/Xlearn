package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link href=\"CSS/Index.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"CSS/skill.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Language</title>\n");
      out.write("    </head>\n");
      out.write("\t<body>\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("        \t<div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\" alt=\"Home page\">\n");
      out.write("                <img src=\"icon/xl-13.png\" alt=\"X-Learning\" height=\"80%\" class=\"logoimg\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"welcome\">\n");
      out.write("            \t<div id=\"personal\">\n");
      out.write("            ");
 
        if (session.getAttribute("login") == null) {
            
      out.write("<a href=\"Signin.html\" alt=\"Personal page\">\n");
      out.write("                <img src=\"icon/person_image.png\" width=\"50\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("        ");
 }else{
      out.write("\n");
      out.write("                <a href=\"PersonalPage.jsp\" alt=\"Personal page\">\n");
      out.write("                <img src=\"icon/person_image.png\" width=\"50\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("              ");
}
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
      out.write("                            <li><a href=\"sport.jsp\">&nbsp;&nbsp;SPROT</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"panel\">\t\n");
      out.write("                        <a data-toggle=\"collapse\" data-parent=\"#miSider\" href=\"#subMenu-2\">PLAZA</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("          <div class='col-remaining'>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_kor.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"24\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_jap.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"23\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_fre.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"22\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_eng.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"21\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_chi.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"20\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"skill\">\n");
      out.write("                \t<img src=\"icon/skill_can.png\" width=\"300\" height=\"224\" alt=\"\"/> \n");
      out.write("                    <div class=\"find\">\n");
      out.write("                    ");
 
                    if (session.getAttribute("login") == null) {
                    
      out.write("<a href=\"Signin.html\">\n");
      out.write("                    <img src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"\"/></a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                    <form action=\"match\" name=\"matchskill\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"skillid\" value=\"19\" />\n");
      out.write("                        <input type=\"image\" src=\"icon/button_find.png\" width=\"201\" height=\"34\" alt=\"find a partner\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
