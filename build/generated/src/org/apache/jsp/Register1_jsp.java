package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Register.css\" />\n");
      out.write("<title>Register</title>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.idTabs.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.11.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function showPage(page){\n");
      out.write("      var div = document.getElementById(page);\n");
      out.write("      if(div != null){\n");
      out.write("       div.style.visibility = \"visible\";\n");
      out.write("       div.style.display = \"inline\";\n");
      out.write("      }\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     function hidePage(page){\n");
      out.write("      var div = document.getElementById(page);\n");
      out.write("      if(div != null){\n");
      out.write("       \n");
      out.write("       div.style.visibility = 'hidden';\n");
      out.write("       div.style.display = 'none';\n");
      out.write("      }\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     function switchPage(hiddenPage , shownPage){\n");
      out.write("      hidePage(hiddenPage);\n");
      out.write("      showPage(shownPage);\n");
      out.write("\t  return false;\n");
      out.write("     }    \n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t<a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em; margin-left:48%;\" /></a>\n");
      out.write("</div>\n");
      out.write("<main>\n");
      out.write("<form action=\"Register\" method=\"post\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\" target=\"_parent\">\n");
      out.write("<div id=\"page1\" style=\"visibility:true; display:inline\">\n");
      out.write("\t<nav class=\"navigate-bar\">\t\n");
      out.write("    \t<img alt=\"INFORMATION\" src=\"icon/info_o.png\" height=\"100%\"/>\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"SKILLS\" src=\"icon/ski_b.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"DECRIPTION\" src=\"icon/des_b.png\" height=\"100%\" />\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"contain\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\" id=\"left\">\n");
      out.write("            <p>GENDER</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("                <input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\" />\n");
      out.write("                <label for=\"male\"><img src=\"icon/boy_icon.png\" alt=\"Male\" width=\"40\" height=\"40\" /></label>\n");
      out.write("                <input type=\"radio\" name=\"gender\" id=\"male\" value=\"female\" />\n");
      out.write("                <label for=\"female\"><img src=\"icon/girl_icon.png\" alt=\"Female\" width=\"50\" height=\"40\" /></label>      \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\" id=\"left\">\n");
      out.write("            <p>COLLEGE</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("                <input type=\"radio\" name=\"school\" id=\"pitt\" value=\"pitt\" />\n");
      out.write("                <label for=\"pitt\"><img src=\"icon/pitt_icon.png\" alt=\"PITT\" width=\"36\" height=\"36\" /></label>&nbsp;\n");
      out.write("                <input type=\"radio\" name=\"school\" id=\"cmu\" value=\"cmu\" />\n");
      out.write("                <label for=\"pitt\"><img src=\"icon/cmu_icon.png\" alt=\"CMU\" width=\"36 height=\"36\" /></label>      \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \t<div class=\"row\">\n");
      out.write("    \t<div class=\"box\" id=\"left\">\n");
      out.write("        <p>EMAIL</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\" id=\"right\">\n");
      out.write("        \t<input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"    ****@EMAIL.COM\" size=\"35\"\n");
      out.write("            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("            <label for=\"eMail\"></label>     \n");
      out.write("        </div>\n");
      out.write("    \t</div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\" id=\"left\">\n");
      out.write("            <p>PASSWORD</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"    8 characters\" size=\"35\"\n");
      out.write("                maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("                <label for=\"password\"></label>     \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\" id=\"left\">\n");
      out.write("            <p>USERNAME</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("                <input type=\"text\" name=\"user_name\" id=\"user_name\" placeholder=\"    Username\" size=\"35\"\n");
      out.write("                maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("                <label for=\"user_name\"></label>     \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \t<div class=\"nextbutton\">\n");
      out.write("    \t\t<input type=\"image\" src=\"icon/button_next.png\" width=\"110\" alt=\"NEXT\" onclick=\"return switchPage('page1','page2');\" />\n");
      out.write("            <p class=\"small\">Already have an <b><a href=\"Signin.html\">Account</a></b>.</p>\n");
      out.write("    \t</div>\n");
      out.write("    </div>    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"page2\" style=\"visibility:hidden; display:none\">\n");
      out.write("\t<nav class=\"navigate-bar\">\t\n");
      out.write("    \t<img alt=\"INFORMATION\" src=\"icon/info_b.png\" height=\"100%\"/>\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"SKILLS\" src=\"icon/ski_o.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"DECRIPTION\" src=\"icon/des_b.png\" height=\"100%\" />\n");
      out.write("\t</nav>\n");
      out.write("    <div class=\"contain\">\n");
      out.write("    \t<div class=\"row\">\n");
      out.write("    \t\t<div class=\"box\" id=\"left\">\n");
      out.write("        \t\t<p>MAJOR</p>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"box\" id=\"right\">\n");
      out.write("        \t\t<input type=\"text\" name=\"major\" id=\"major\" placeholder=\"    MSIS\" size=\"35\"\n");
      out.write("            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("            <label for=\"major\"></label>     \n");
      out.write("        \t</div>\n");
      out.write("    \t</div>\n");
      out.write("        <div class=\"rowNew\">\n");
      out.write("        \t<div class=\"box\" id=\"left\">\n");
      out.write("        \t\t\t<p>SKILL</p>\n");
      out.write("        \t\t</div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("            \t\t<ul class=\"idTabs\">\n");
      out.write("                    \t<li><a class=\"selected\" href=\"#TabTech\"><img src=\"icon/icon-01.png\" alt=\"Tech\" height=\"30\"/></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabSport\"><img src=\"icon/icon-02.png\" alt=\"Sport\" height=\"30\" /></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabMusic\"><img src=\"icon/icon-03.png\" alt=\"Music\" height=\"30\" /></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabLanguage\"><img src=\"icon/icon-04.png\" alt=\"Language\" height=\"30\" /></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"Options\" id=\"TabTech\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"teach_skills\" id=\"C\" value=\"1\" />C\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Excel\" value=\"2\" />Excel\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"HTML\" value=\"3\" />HTML <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Java\" value=\"4\" />Java\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Photoshop\" value=\"5\" />Photoshop\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"SQL\" value=\"6\" />SQL\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabSport\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"teach_skills\" id=\"Basketball\" value=\"7\" />Basketball\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Badminton\" value=\"8\" />Bedminton\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Tennis\" value=\"9\" />Pingpang <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Jogging\" value=\"10\" />Rocklambing\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Skateboard\" value=\"11\" />Skateball\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Swimming\" value=\"12\" />Swimming\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabMusic\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"teach_skills\" id=\"Drum\" value=\"13\" />Drum\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Guitar\" value=\"14\" />Guitar\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Piano\" value=\"15\" />Piano <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Saxphone\" value=\"16\" />Saxphone\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Violin\" value=\"17\" />Viollin\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Vocal\" value=\"18\" />Vocal\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabLanguage\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"teach_skills\" id=\"Cantonese\" value=\"19\" />Cantonese\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Chinese\" value=\"20\" />Chinese\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"English\" value=\"21\" />English <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"French\" value=\"22\" />Franch\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Japanese\" value=\"23\" />Japanese\n");
      out.write("                        <input type=\"checkbox\" name=\"teach_skills\" id=\"Korean\" value=\"24\" />Korean\n");
      out.write("                    </div>\n");
      out.write("            \t</div>\n");
      out.write("         </div> \n");
      out.write("        <div class=\"rowNew\">\n");
      out.write("        \t<div class=\"box\" id=\"left\">\n");
      out.write("        \t\t\t<p>WANT TO LEARN</p>\n");
      out.write("        \t\t</div>\n");
      out.write("            <div class=\"box\" id=\"right\">\n");
      out.write("            \t\t<ul class=\"idTabs\">\n");
      out.write("                    \t<li><a class=\"selected\" href=\"#TabTechLearn\"><img src=\"icon/icon-01.png\" alt=\"Tech\" height=\"30\"/></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabSportLearn\"><img src=\"icon/icon-02.png\" alt=\"Sport\" height=\"30\" /></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabMusicLearn\"><img src=\"icon/icon-03.png\" alt=\"Music\" height=\"30\" /></a></li>\n");
      out.write("                        <li><a class=\"\" href=\"#TabLanguageLearn\"><img src=\"icon/icon-04.png\" alt=\"Language\" height=\"30\" /></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"Options\" id=\"TabTechLearn\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"learn_skills\" id=\"C\" value=\"1\" />C++\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Excel\" value=\"2\" />Excel\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"HTML\" value=\"3\" />HTML <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Java\" value=\"4\" />Java\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Photoshop\" value=\"5\" />Photoshop\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"SQL\" value=\"6\" />SQL\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabSportLearn\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"learn_skills\" id=\"Basketball\" value=\"7\" />Basketball\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Badminton\" value=\"8\" />Badminton\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Tennis\" value=\"9\" />Tennis <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Jogging\" value=\"10\" />Jogging\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Skateboard\" value=\"11\" />Skateboard\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Swimming\" value=\"12\" />Swimming\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabMusicLearn\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"learn_skills\" id=\"Drum\" value=\"13\" />Drum\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Guitar\" value=\"14\" />Guitar\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Piano\" value=\"15\" />Piano <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Saxphone\" value=\"16\" />Saxphone\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Violin\" value=\"17\" />Violin\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Vocal\" value=\"18\" />Vocal\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Options\" id=\"TabLanguageLearn\">\n");
      out.write("                    \t<input type=\"checkbox\" name=\"learn_skills\" id=\"Cantonese\" value=\"19\" />Cantonese\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Chinese\" value=\"20\" />Chinese\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"English\" value=\"21\" />English <br />\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"French\" value=\"22\" />French\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Japanese\" value=\"23\" />Japanese\n");
      out.write("                        <input type=\"checkbox\" name=\"learn_skills\" id=\"Korean\" value=\"24\" />Korean\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("         </div>        \n");
      out.write("        <div class=\"nextbutton\">\n");
      out.write("    \t\t<input type=\"image\" src=\"icon/button_back.png\" alt=\"BACK\" width=\"110\"onclick=\"return switchPage('page2','page1');\" />&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"image\" src=\"icon/button_next.png\" alt=\"NEXT\" width=\"110\"onclick=\"return switchPage('page2','page3');\" />\n");
      out.write("            <p class=\"small\">Already have an <b><a href=\"Signin.html\">Account</a></b>.</p>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"page3\" style=\"visibility:hidden; display:none\">\n");
      out.write("\t<nav class=\"navigate-bar\">\t\n");
      out.write("    \t<img alt=\"INFORMATION\" src=\"icon/info_b.png\" height=\"100%\"/>\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"SKILLS\" src=\"icon/ski_b.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"------\" src=\"icon/line.png\" height=\"100%\" />\n");
      out.write("        <img alt=\"DECRIPTION\" src=\"icon/des_o.png\" height=\"100%\" />\n");
      out.write("\t</nav>\n");
      out.write("    <div class=\"contain\">\n");
      out.write("    \t<div class=\"DesRow\">\n");
      out.write("        \t<p>CHOOSE YOUR AVALIBLE TIME:</p><br />\n");
      out.write("            <div class=\"TimeList\">\n");
      out.write("            \t<input type=\"checkbox\" name=\"available_time\" id=\"Monday\" value=\"1\" />MONDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Tuesday\" value=\"2\" />TUESDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Wednesday\" value=\"3\" />WEDNESDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Thursday\" value=\"4\" />THURSDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Friday\" value=\"5\" />FRIDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Saturday\" value=\"6\" />SATURDAY\n");
      out.write("                <input type=\"checkbox\" name=\"available_time\" id=\"Sunday\" value=\"7\" />SUNDAY\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"DesRow\">\n");
      out.write("        \t<p>WRITE SOMETHING TO DESCRIPTE YOURSELF:</p><br />\n");
      out.write("            <textarea name=\"motto\" rows=\"4\" cols=\"50\" placeholder=\"Hello everyone. My name is...\"  ></textarea>\n");
      out.write("        </div>\n");
      out.write("    \t<div class=\"nextbutton\">\n");
      out.write("    \t\t<input type=\"image\" src=\"icon/button_back.png\" width=\"110\" alt=\"BACK\" onclick=\"return switchPage('page3','page2');\" />&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"image\" src=\"icon/button_signup.png\" width=\"110\" alt=\"SignUp\"/>\n");
      out.write("            <p class=\"small\">Already have an <b><a href=\"Signin.html\">Account</a></b>.</p>\n");
      out.write("    \t</div>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("</form>\t\n");
      out.write("</main>\n");
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