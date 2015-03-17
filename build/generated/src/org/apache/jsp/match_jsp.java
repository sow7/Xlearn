package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class match_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link href=\"CSS/MatchPage.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>MatchPage</title>\n");
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
      out.write("                        <a data-toggle=\"collapse\" data-parent=\"#miSider\" href=\"#subMenu-2\">PLAZA</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>             \n");
      out.write("            </div>\n");
      out.write("            <div class='col-remaining'>\n");
      out.write("                <div id=\"PersonalInfo\" class=\"con-left\">\n");
      out.write("                    <div class=\"PersonHeader\">\n");
      out.write("                    \t<div class=\"PersonalImage\">\n");
      out.write("                        \t<img src=\"icon/boy_icon.png\" alt=\"BOY\" height=\"80\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"PersonalDetail\">\n");
      out.write("                        \t<div class=\"CollegeIcon\">\n");
      out.write("                            \t<img src=\"icon/cmu_icon.png\" alt=\"CMU\" height=\"50\" />\n");
      out.write("                            </div>\n");
      out.write("                            <h1>");
      out.print( request.getAttribute("user_name"));
      out.write("</h1>\n");
      out.write("                            <h3>");
      out.print( request.getAttribute("major"));
      out.write("</h3>\n");
      out.write("                            <h3>");
      out.print( request.getAttribute("available_time"));
      out.write("</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"PersonContent\">\n");
      out.write("                    \t<p>");
      out.print( request.getAttribute("motto"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"PersonSkills\">\n");
      out.write("                    \t<div class=\"Teach\">\n");
      out.write("                        \tI can teach:<p>");
      out.print( request.getAttribute("teach_skills"));
      out.write("</p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"Learn\">\n");
      out.write("                        \tI want to learn:<p>");
      out.print( request.getAttribute("learn_skills"));
      out.write("</p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class = \"match\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img  src=\"icon/button_p.png\" width=\"60\" alt=\"\"/> \n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img  src=\"icon/button_match.png\"  height=\"60\" alt=\"\"/> \n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img  src=\"icon/button_n.png\" width=\"60\" alt=\"\"/> \n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("          </div>\n");
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
