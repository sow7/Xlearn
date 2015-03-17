/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
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
@WebServlet(name = "Signin", urlPatterns = {"/Signin"})
public class Signin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstantiationException, IllegalAccessException {
        response.setContentType("text/html;charset=UTF-8");
        String eMail=request.getParameter ("eMail");
        String password=request.getParameter("password"); 
        request.getSession().setAttribute("password", password);
        request.getSession().setAttribute("eMail",eMail);
        /*String returnUrl = null;  
        String rawQueryString = request.getQueryString();  
        if (rawQueryString != null)  
        {  
            System.out.println("带有参数" + rawQueryString);  
            try  
            {  
                String queryString = URLDecoder.decode(rawQueryString, "GBK");  
                String[] paramPairs = queryString.split("&");  
                String[] nameValue = paramPairs[0].split("=");  
                if (nameValue[0].equalsIgnoreCase("ReturnUrl"))  
                {  
                    returnUrl = nameValue[1];  
                }  
            } catch (Exception e)  
            {  
                e.printStackTrace();  
                returnUrl = null;  
            }  
        }  
        if (returnUrl != null)  
        {  
            request.getSession().setAttribute("returnUrl", returnUrl);  
        }*/
        try{ 
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn")) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT PASSWORD,USER_NAME,LEARN_SKILLS,TEACH_SKILLS,SCHOOL,GENDER,MAJOR,AVAILABLE_TIME,MOTTO FROM USER_INFO WHERE EMAIL='"+eMail+"'");
                if(rs.next()){
                    if(rs.getString(1).equals(password)){
                        request.getSession().setAttribute("user_name",rs.getString(2));
                        request.getSession().setAttribute("learn_skills",rs.getString(3));
                        request.getSession().setAttribute("teach_skills",rs.getString(4));
                        request.getSession().setAttribute("school",rs.getString(5));
                        request.getSession().setAttribute("gender",rs.getString(6));
                        request.getSession().setAttribute("gender1",rs.getString(6));
                        request.getSession().setAttribute("major",rs.getString(7));
                        request.getSession().setAttribute("available_time",rs.getString(8));
                        request.getSession().setAttribute("motto",rs.getString(9));
                        request.getSession().setAttribute("login", eMail);
                        /*
                        ResultSet rs1 = st.executeQuery("SELECT SKILL_ID,LEARNER_EMAIL,MATCH_ID FROM MATCH_REQUEST WHERE TEACHER_EMAIL='"+eMail+"' AND MATCH_STATUS='submitted'");
                        String match="";
                        while(rs1.next()){
                            match=match+rs1.getInt(3)+"*";
                            match=match+rs1.getString(2)+",";
                            if(rs1.getInt(1)==1)
                                match=match+"C++|";
                            else if(rs1.getInt(1)==2)
                                match=match+"Excel|";
                            else if(rs1.getInt(1)==3)
                                match=match+"HTML|";
                            else if(rs1.getInt(1)==4)
                                match=match+"Java|";
                            else if(rs1.getInt(1)==5)
                                match=match+"Photoshop|";
                            else if(rs1.getInt(1)==6)
                                match=match+"SQL|";
                            else if(rs1.getInt(1)==7)
                                match=match+"Basketball|";
                            else if(rs1.getInt(1)==8)
                                match=match+"Badminton|";
                            else if(rs1.getInt(1)==9)
                                match=match+"Tennis|";
                            else if(rs1.getInt(1)==10)
                                match=match+"Jogging|";
                            else if(rs1.getInt(1)==11)
                                match=match+"Skateboard|";
                            else if(rs1.getInt(1)==12)
                                match=match+"Swimming|";
                            else if(rs1.getInt(1)==13)
                                match=match+"Drum|";
                            else if(rs1.getInt(1)==14)
                                match=match+"Guitar|";
                            else if(rs1.getInt(1)==15)
                                match=match+"Piano|";
                            else if(rs1.getInt(1)==16)
                                match=match+"Saxphone|";
                            else if(rs1.getInt(1)==17)
                                match=match+"Violin|";
                            else if(rs1.getInt(1)==18)
                                match=match+"Vocal|";
                            else if(rs1.getInt(1)==19)
                                match=match+"Cantonese|";
                            else if(rs1.getInt(1)==20)
                                match=match+"Chinese|";
                            else if(rs1.getInt(1)==21)
                                match=match+"English|";
                            else if(rs1.getInt(1)==22)
                                match=match+"French|";
                            else if(rs1.getInt(1)==23)
                                match=match+"Japanese|";
                            else match=match+"Korean|";
                        }
                        request.getSession().setAttribute("match", match);
                       // match="";
                        ResultSet rs2 = st.executeQuery("SELECT SKILL_ID,LEARNER_EMAIL FROM MATCH_REQUEST WHERE TEACHER_EMAIL='"+eMail+"' AND MATCH_STATUS='accepted'");
                        String matched="";
                        while(rs2.next()){
                             matched=matched+rs2.getString(2)+",";
                            if(rs2.getInt(1)==1)
                                matched=matched+"C++|";
                            else if(rs2.getInt(1)==2)
                                matched=matched+"Excel|";
                            else if(rs2.getInt(1)==3)
                                matched=matched+"HTML|";
                            else if(rs2.getInt(1)==4)
                                matched=matched+"Java|";
                            else if(rs2.getInt(1)==5)
                                matched=matched+"Photoshop|";
                            else if(rs2.getInt(1)==6)
                                matched=matched+"SQL|";
                            else if(rs2.getInt(1)==7)
                                matched=matched+"Basketball|";
                            else if(rs2.getInt(1)==8)
                                matched=matched+"Badminton|";
                            else if(rs2.getInt(1)==9)
                                matched=matched+"Tennis|";
                            else if(rs2.getInt(1)==10)
                                matched=matched+"Jogging|";
                            else if(rs2.getInt(1)==11)
                                matched=matched+"Skateboard|";
                            else if(rs2.getInt(1)==12)
                                matched=matched+"Swimming|";
                            else if(rs2.getInt(1)==13)
                                matched=matched+"Drum|";
                            else if(rs2.getInt(1)==14)
                                matched=matched+"Guitar|";
                            else if(rs2.getInt(1)==15)
                                matched=matched+"Piano|";
                            else if(rs2.getInt(1)==16)
                                matched=matched+"Saxphone|";
                            else if(rs2.getInt(1)==17)
                                matched=matched+"Violin|";
                            else if(rs2.getInt(1)==18)
                                matched=matched+"Vocal|";
                            else if(rs2.getInt(1)==19)
                                matched=matched+"Cantonese|";
                            else if(rs2.getInt(1)==20)
                                matched=matched+"Chinese|";
                            else if(rs2.getInt(1)==21)
                                matched=matched+"English|";
                            else if(rs2.getInt(1)==22)
                                matched=matched+"French|";
                            else if(rs2.getInt(1)==23)
                                matched=matched+"Japanese|";
                            else matched=matched+"Korean|";
                        }
                        request.getSession().setAttribute("matched", matched);
                        matched="";*/
                        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                        
                    }else{
                        PrintWriter pw=response.getWriter();
                             pw.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
"<link href=\"CSS/Signin.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
"<title>Login</title>\n" +
"<script language=\"javascript\">\n" +
"function doCheck(){\n" +
"    if(document.form1.eMail.value===\"\"){\n" +
"        alert('Please input your e-Mail！');\n" +
"        return false;\n" +
"    }\n" +
"    if(document.form1.password.value===\"\"){\n" +
"        alert('Please input your password');\n" +
"        return false;\n" +
"    }\n" +
"    return falese;\n" +
"}\n" +
"</script>\n" +
"</head>\n" +
"\n" +
"<body><script language='javascript'>alert('Your password is wrong')</script>\n" +
"<div class=\"header\">\n" +
"	<div class=\"logo\">\n" +
"		<a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em;\" /></a>\n" +
"    </div>\n" +
"</div>\n" +
"<main>\n" +
"<div class=\"contain\">\n" +
"<form action=\"Signin\" method=\"post\" name=\"signin\" id=\"form1\" onSubmit=\"return doCheck();\">\n" +
"<div class=\"row\">\n" +
"    <div class=\"box\" id=\"left\">\n" +
"    <p>EMAIL</p>\n" +
"    </div>\n" +
"    <div class=\"box\" id=\"right\">\n" +
"        <input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"   ****@EMAIL.COM\" size=\"35\"\n" +
"            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n" +
"        <label for=\"eMail\"></label>       \n" +
"    </div>\n" +
"</div>\n" +
"<div class=\"row\">\n" +
"    <div class=\"box\" id=\"left\">\n" +
"    <p>PASSWORD</p>\n" +
"    </div>\n" +
"    <div class=\"box\" id=\"right\">\n" +
"    	<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"   8 characters\" size=\"35\"\n" +
"                maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n" +
"        <label for=\"password\"></label>     \n" +
"    </div>\n" +
"</div>\n" +
"<div class=\"submitbn\">\n" +
"    	<input name=\"singin\" type=\"image\" id=\"singin\" src=\"icon/button_signin.png\" width=\"110px\" onClick=\"return doCheck();\"/>\n" +
"        	\n" +
"</div>\n" +
"</form>\n" +
"<p class=\"small\">Haven't  <b><a href=\"Register.jsp\">Registered</a></b> ?</p>\n" +
"</div>\n" +
"</main>\n" +
"</body>\n" +
"</html>\n" +
"");
                             pw.close();
                        }
                    }else {
                     PrintWriter pw=response.getWriter();
                     pw.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                             "<head>\n" +
                             "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                             "<link href=\"CSS/Signin.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                             "<title>Login</title>\n" +
                             "<script language=\"javascript\">\n" +
                             "function doCheck(){\n" +
                             "    if(document.form1.eMail.value===\"\"){\n" +
                             "        alert('Please input your e-Mail！');\n" +
                             "        return false;\n" +
                             "    }\n" +
                             "    if(document.form1.password.value===\"\"){\n" +
                             "        alert('Please input your password');\n" +
                             "        return false;\n" +
                             "    }\n" +
                             "    return falese;\n" +
                             "}\n" +
                             "</script>\n" +
                             "</head>\n" +
                             "\n" +
                             "<body><script language='javascript'>alert('Your e-mail is not registered')</script>\n" +
                             "<div class=\"header\">\n" +
                             "	<div class=\"logo\">\n" +
                             "		<a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em;\" /></a>\n" +
                             "    </div>\n" +
                             "</div>\n" +
                             "<main>\n" +
                             "<div class=\"contain\">\n" +
                             "<form action=\"Signin\" method=\"post\" name=\"signin\" id=\"form1\" onSubmit=\"return doCheck();\">\n" +
                             "<div class=\"row\">\n" +
                             "    <div class=\"box\" id=\"left\">\n" +
                             "    <p>EMAIL</p>\n" +
                             "    </div>\n" +
                             "    <div class=\"box\" id=\"right\">\n" +
                             "        <input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"   ****@EMAIL.COM\" size=\"35\"\n" +
                             "            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n" +
                             "        <label for=\"eMail\"></label>       \n" +
                             "    </div>\n" +
                             "</div>\n" +
                             "<div class=\"row\">\n" +
                             "    <div class=\"box\" id=\"left\">\n" +
                             "    <p>PASSWORD</p>\n" +
                             "    </div>\n" +
                             "    <div class=\"box\" id=\"right\">\n" +
                             "    	<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"   8 characters\" size=\"35\"\n" +
                             "                maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n" +
                             "        <label for=\"password\"></label>     \n" +
                             "    </div>\n" +
                             "</div>\n" +
                             "<div class=\"submitbn\">\n" +
                             "    	<input name=\"singin\" type=\"image\" id=\"singin\" src=\"icon/button_signin.png\" width=\"110px\" onClick=\"return doCheck();\"/>\n" +
                             "        	\n" +
                             "</div>\n" +
                             "</form>\n" +
                             "<p class=\"small\">Haven't  <b><a href=\"Register.jsp\">Registered</a></b> ?</p>\n" +
                             "</div>\n" +
                             "</main>\n" +
                             "</body>\n" +
                             "</html>\n" +
                             "");
                     pw.close();
                    }
                }
            }
   catch(ClassNotFoundException | SQLException e){
   //e.printStackTrace();
   System.out.println("connect fail");
  }
  }
  /*  catch (InstantiationException | IllegalAccessException ex) {
  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }*/

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
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
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
