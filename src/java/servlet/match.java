/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONGSONG
 */
@WebServlet(name = "match", urlPatterns = {"/match"})
public class match extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, NullPointerException {
        response.setContentType("text/html;charset=UTF-8");
        String skill_id=request.getParameter ("skillid");
        String eMail=request.getParameter ("eMail");
        int u=1;
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn")) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from USER_INFO where teach_skills like '%"+skill_id+"%'");
                PrintWriter pw=response.getWriter();
                String time1= request.getParameter ("time");
                                char[] time2 = time1.toCharArray();
                                char[] times2= new char[7];
                                int j=0;
                                int sharetime=0;
                                for(int i=0;i<time2.length;i++)
                                {   
                                    if(time2[i]=='|'){
                                    }else{
                                        times2[j]=time2[i];
                                    j++;}
                                }
                Statement st1 = conn.createStatement();
                ResultSet rs1 = st1.executeQuery("select GENDER from USER_INFO where EMAIL ='"+eMail+"'");
                if(rs1.next()){
                    if(rs1.getString(1).equals("male")){
                         pw.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
"        <link href=\"CSS/MatchPage.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
"        <script type=\"text/javascript\" src=\"MatchPage.js\"></script>\n" +
"        <title>MatchPage</title>\n" +
"    </head>\n" +
"<body>\n" +
"    <main>\n" +
"        <div class=\"header\">\n" +
"        	<div class=\"logo\">\n" +
"            	<a href=\"index.jsp\" alt=\"Home page\">\n" +
"                <img src=\"icon/xl-13.png\" alt=\"X-Learning\" height=\"80%\" class=\"logoimg\" /> </a>\n" +
"            </div>\n" +
"            <div class=\"welcome\">\n" +
"                <div id=\"personal\">\n<a href=\"PersonalPage.jsp\" alt=\"Personal page\">\n" +
"                <img src=\"icon/boy_icon.png\" width=\"50\" height=\"50\" alt=\"\"/> </a>\n" +
"                <div class=\"signout\">   \n" +
"                <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n" +
"                    <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n" +
"                </form></div></div>" );
                    }else{
                        pw.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
"        <link href=\"CSS/MatchPage.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
"        <script type=\"text/javascript\" src=\"MatchPage.js\"></script>\n" +
"        <title>MatchPage</title>\n" +
"    </head>\n" +
"<body>\n" +
"    <main>\n" +
"        <div class=\"header\">\n" +
"        	<div class=\"logo\">\n" +
"            	<a href=\"index.jsp\" alt=\"Home page\">\n" +
"                <img src=\"icon/xl-13.png\" alt=\"X-Learning\" height=\"80%\" class=\"logoimg\" /> </a>\n" +
"            </div>\n" +
"            <div class=\"welcome\">\n" +
"                <div id=\"personal\">\n<a href=\"PersonalPage.jsp\" alt=\"Personal page\">\n" +
"                <img src=\"icon/girl_icon.png\" width=\"60\" height=\"50\" alt=\"\"/> </a>\n" +
"                <div class=\"signout\">   \n" +
"                <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n" +
"                    <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n" +
"                </form></div></div>");
                    }       
                }
                        pw.println(
"            </div>\n" +
"        </div>\n" +
"        <div class=\"contain\">\n" +
"            <div class='col-left'>\n" +
"                <ul id=\"miSider\">\n" +
"                    <li class=\"panel\">\n" +
"                        <a data-toggle=\"collapse\" data-parent=\"#miSider\">SKILL</a>\n" +
"                        <ul id=\"subMenu-1\" class=\"collapse in\">\n" +
"                            <li><a href=\"music.jsp\">&nbsp;&nbsp;MUSIC</a>\n" +
"                            </li>\n" +
"                            <li><a href=\"lang.jsp\">&nbsp;&nbsp;LANGUAGE</a>\n" +
"                            </li>\n" +
"                            <li><a href=\"tech.jsp\">&nbsp;&nbsp;TECHNOLOGY</a>\n" +
"                            </li>\n" +
"                            <li><a href=\"sport.jsp\">&nbsp;&nbsp;SPROT</a>\n" +
"                            </li>\n" +
"                        </ul>\n" +
"                    </li>\n" +
"                    <li class=\"panel\">	\n" +
"                        <a data-toggle=\"collapse\" data-parent=\"#miSider\" href=\"Plaza.html\">PLAZA</a>\n" +
"                    </li>\n" +
"                </ul>             \n" +
"            </div><div class='col-remaining'>");
                while(rs.next()){
                    String time = rs.getString(11);
                                char[] times = time.toCharArray();
                                char[] times1 = new char[7];                                  
                                j=0;
                                for(int i=0;i<times.length;i++)
                                {
                                    if(times[i]=='|'){continue;}
                                    else{times1[j]=times[i];j++;}
                                }
                                for(int a=0;a<times1.length;a++){
                                for(int b=0;b<times2.length;b++){
                                if(times1[a]==times2[b]) sharetime++;}
                                }     
                    if(sharetime>0){
                        pw.println("<div id=\"matchuser"+u+"\" class=\"show\">\n" +
"                    <div id=\"PersonalInfo\" class=\"con-left\">\n" +
"                        <div class=\"PersonHeader\">\n" +
"                            <div class=\"PersonalImage\">");
                        if(rs.getString(8).equals("male")){
                            pw.println("<img src=\"icon/boy_icon.png\" alt=\"BOY\" height=\"80\" />\n" +
"                            </div>\n" +
"                            <div class=\"PersonalDetail\">\n" +
"                                <div class=\"CollegeIcon\">");
                        }else{
                            pw.println("<img src=\"icon/girl_icon.png\" alt=\"GIRL\" height=\"80\" />\n" +
"                            </div>\n" +
"                            <div class=\"PersonalDetail\">\n" +
"                                <div class=\"CollegeIcon\">");
                        }
                        if(rs.getString(7).equals("cmu")){
                            pw.println("<img src=\"icon/cmu_icon.png\" alt=\"CMU\" height=\"50\" />\n" +
"                                </div>\n" +
"                                <h1>\n" +
"                                  <p>"+rs.getString(2)+"</p></h1>\n" +
"                                <h3><p>"+rs.getString(9)+"</p></h3><h3><p>");
                        }else{
                            pw.println("<img src=\"icon/pitt_icon.png\" alt=\"PITT\" height=\"50\" />\n" +
"                                </div>\n" +
"                                <h1>\n" +
"                                  <p>"+rs.getString(2)+"</p></h1>\n" +
"                                <h3><p>"+rs.getString(9)+"</p></h3><h3><p>");
                        }
                                char[] tim = time.toCharArray();
                                String avtim="";
                                for(int i=0;i<tim.length;i++)
                                {
                                    if(tim[i]=='|'){
                                        switch (avtim) {
                                            case "1":
                                                pw.println("Mon.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "2":
                                                pw.println("Tue.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "3":
                                                pw.println("Wed.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "4":
                                                pw.println("Thu.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "5":
                                                pw.println("Fri.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "6":
                                                pw.println("Sat.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            case "7":
                                                pw.println("Sun.&nbsp;&nbsp;");
                                                avtim="";
                                                continue;
                                            default:
                                                pw.println("");
                                                avtim="";
                                                continue;
                                        }
                                    }
                                    avtim=avtim+tim[i];
                                }
                        pw.println("</p></h3>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"PersonContent\">\n" +
"                            <p>"+rs.getString(10)+"<br />lol~</p>\n" +
"                        </div>\n" +
"                        <div class=\"PersonSkills\">\n" +
"                            <div class=\"Teach\">I can teach:<p>&nbsp;&nbsp;&nbsp;&nbsp;");
                         String tskill = rs.getString(6);
                         char[] skills = tskill.toCharArray();
                                String skil="";
                                for(int i=0;i<skills.length;i++)
                                {
                                    if(skills[i]=='|'){
                                        switch (skil) {
                                            case "1":
                                                pw.println("C++&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "2":
                                                pw.println("Excel&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "3":
                                                pw.println("HTML&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "4":
                                                pw.println("Java&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "5":
                                                pw.println("Photoshop&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "6":
                                                pw.println("SQL&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "7":
                                                pw.println("Basketball&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "8":
                                                pw.println("Badminton&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "9":
                                                pw.println("Tennis&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "10":
                                                pw.println("Jogging&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "11":
                                                pw.println("Skateboard&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "12":
                                                pw.println("Swimming&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "13":
                                                pw.println("Drum&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "14":
                                                pw.println("Guitar&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "15":
                                                pw.println("Piano&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "16":
                                                pw.println("Saxphone&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "17":
                                                pw.println("Violin&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "18":
                                                pw.println("Vocal&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "19":
                                                pw.println("Cantonese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "20":
                                                pw.println("Chinese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "21":
                                                pw.println("English&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "22":
                                                pw.println("French&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "23":
                                                pw.println("Japanese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "24":
                                                pw.println("Korean&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            default:
                                                pw.println("");
                                                skil="";
                                                continue;
                                        }
                                    }
                                    skil=skil+skills[i];
                                }
                        pw.println("</p>\n" +
"                                \n" +
"                            </div>\n" +
"                            <div class=\"Learn\">\n" +
"                                I want to learn:<p>&nbsp;&nbsp;&nbsp;&nbsp;");
                         String lskill = rs.getString(5);
                         char[] skills1 = lskill.toCharArray();
                         skil="";
                                for(int i=0;i<skills1.length;i++)
                                {
                                    if(skills1[i]=='|'){
                                        switch (skil) {
                                            case "1":
                                                pw.println("C++&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "2":
                                                pw.println("Excel&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "3":
                                                pw.println("HTML&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "4":
                                                pw.println("Java&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "5":
                                                pw.println("Photoshop&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "6":
                                                pw.println("SQL&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "7":
                                                pw.println("Basketball&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "8":
                                                pw.println("Badminton&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "9":
                                                pw.println("Tennis&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "10":
                                                pw.println("Jogging&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "11":
                                                pw.println("Skateboard&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "12":
                                                pw.println("Swimming&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "13":
                                                pw.println("Drum&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "14":
                                                pw.println("Guitar&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "15":
                                                pw.println("Piano&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "16":
                                                pw.println("Saxphone&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "17":
                                                pw.println("Violin&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "18":
                                                pw.println("Vocal&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "19":
                                                pw.println("Cantonese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "20":
                                                pw.println("Chinese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "21":
                                                pw.println("English&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "22":
                                                pw.println("French&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "23":
                                                pw.println("Japanese&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            case "24":
                                                pw.println("Korean&nbsp;&nbsp;");
                                                skil="";
                                                continue;
                                            default:
                                                pw.println("");
                                                skil="";
                                                continue;
                                        }
                                    }
                                    skil=skil+skills1[i];
                                }
                                int pre=u-1;
                                int next=u+1;
                                if(pre==0){
                        pw.println("</p>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class = \"match\">\n" +
"                            <a href=\"#\">\n" +

"                                <form action=\"Submatch\" method=\"post\">\n" +
"                                <input type=\"hidden\" name=\"skill_id\" value=\""+skill_id+"\"/> \n" +
"                                <input type=\"hidden\" name=\"L_email\" value=\""+eMail+"\"/> \n" +
"                                <input type=\"hidden\" name=\"T_email\" value=\""+rs.getString(3)+"\"/> \n" +
"                                <input type=\"image\" src=\"icon/button_match.png\" height=\"60\" alt=\"Submit Match\"/>\n" +
"                            <img  src=\"icon/button_n.png\" width=\"60\" alt=\"\"/ onclick=\"swapNextUser(matchuser"+u+",matchuser"+next+")\"> \n" +
"                                </form>" +

"                            </a>\n" +

"                        </div>\n" +
"                    </div>\n" +
"	        </div>");}else{
                        pw.println("</p>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class = \"match\">\n" +

"                            <a href=\"#\">\n" +

                                
"                            <form action=\"Submatch\" method=\"post\">\n" +
"                            <img  src=\"icon/button_p.png\" width=\"60\" alt=\"\"/ onclick=\"swapPreUser(matchuser"+u+",matchuser"+pre+")\";> \n" +
"                                <input type=\"hidden\" name=\"skill_id\" value=\""+skill_id+"\"/> \n" +
"                                <input type=\"hidden\" name=\"L_email\" value=\""+eMail+"\"/> \n" +
"                                <input type=\"hidden\" name=\"T_email\" value=\""+rs.getString(3)+"\"/> \n" +
"                                <input type=\"image\" src=\"icon/button_match.png\" height=\"60\" alt=\"Submit Match\"/>\n" +
"                            <img  src=\"icon/button_n.png\" width=\"60\" alt=\"\"/ onclick=\"swapNextUser(matchuser"+u+",matchuser"+next+")\"> \n" +
"                                </form>" +

"                            </a>\n" +

"                        </div>\n" +
"                    </div>\n" +
"	        </div>");
                                }
                                u++;
                    }}
                int pr=u-1;
        pw.println("<div id=\"matchuser"+u+"\">\n" +
"        <div id=\"PersonalInfo\" class=\"con-left\">\n" +
"           <div class=\"PersonHeader\">\n" +
"               <div class=\"PersonalImage\">\n" +
"               </div>\n" +
"               <div class=\"PersonalDetail\">\n" +
"                   <div class=\"CollegeIcon\">\n" +
"                       &nbsp;\n" +
"                   </div>\n" +
"                   <h1>\n" +
"                       <p id=\"username\">&nbsp;</p></h1>\n" +
"                   <h3><p id=\"major\">&nbsp;</p></h3>\n" +
"                   <h3><p id=\"time\">&nbsp;</p></h3></div> </div>\n" +
"            <div class=\"PersonContent\">\n" +
"                       <p id=\"info\"><br />There are no more recommended partners,<br />\n" +
"                           Please go back to previous recommendation.<br /></p></div>\n" +
"            <div class=\"PersonSkills\">\n" +
"                <div class=\"Teach\">&nbsp;<p>&nbsp;</p>\n" +
"                </div>\n" +
"                <div class=\"Learn\">&nbsp;<p>&nbsp;</p>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class = \"match\">\n" +
"                <img  src=\"icon/button_p.png\" width=\"60\" alt=\"\" onclick=\"swapPreUser(matchuser"+u+",matchuser"+pr+")\"/> \n" +
"            </div></div>\n" +
"    </div>\n" +
"");
        pw.println(" </div> </div>\n" +
"</main>\n" +
"</body>\n" +
"</html>\n" +
"");
                }}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(match.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
