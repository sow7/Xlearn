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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                try{
                    
          String gender=request.getParameter("gender");
          String school=request.getParameter("school");
          String eMail=request.getParameter("eMail");
          Matcher matcher;
          Pattern pattern = Pattern.compile("[;:,#&'\".!]");
          matcher = pattern.matcher(request.getParameter ("user_name"));
          String user_name = matcher.replaceAll("|");
          matcher = pattern.matcher(request.getParameter ("password"));
          String password = matcher.replaceAll("|");
          matcher = pattern.matcher(request.getParameter ("major"));
          String major = matcher.replaceAll("|");
          String[] values=request.getParameterValues("teach_skills");
          String teach_skills="";
          if(values!=null&&values.length>0){
          for (String value : values) {
                teach_skills = teach_skills + value+"|";
          }}
          String[] values1=request.getParameterValues("learn_skills");
          String learn_skills="";
          if(values1!=null&&values1.length>0){
            for (String values11 : values1) {
                learn_skills = learn_skills + values11+"|";
            }}
          String[] values2=request.getParameterValues("available_time");
          String available_time="";
          if(values2!=null&&values2.length>0){
            for (String values21 : values2) {
                available_time = available_time + values21+"|";
            }}
          matcher = pattern.matcher(request.getParameter ("motto"));
          String motto = matcher.replaceAll("|");
          Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn")) {
                Statement st = conn.createStatement();
                st.execute("insert into USER_INFO(USER_NAME,EMAIL,PASSWORD,LEARN_SKILLS,TEACH_SKILLS,SCHOOL,GENDER,MAJOR,MOTTO,AVAILABLE_TIME) VALUES ('"+user_name+"','"+eMail+"','"+password+"','"+learn_skills+"','"+teach_skills+"','"+school+"','"+gender+"','"+major+"','"+motto+"','"+available_time+"')");
            }
            PrintWriter out = response.getWriter();
          out.println("<html><head><title>Page2</title></head><body>");
          out.println("<h1 align=\"center\"> Your ID is register success.<h1>");
          out.println("</body></html>");
                      /*  request.getSession().setAttribute("username",user_name);
                        request.getSession().setAttribute("learnskill",learn_skills);
                        request.getSession().setAttribute("teachskill",teach_skills);
                        request.getSession().setAttribute("school",school);
                        request.getSession().setAttribute("gender",gender);
                        request.getSession().setAttribute("major",major);
                        request.getSession().setAttribute("availtime",available_time);
                        request.getSession().setAttribute("motto",motto);
                        request.getSession().setAttribute("login", eMail);*/
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/Signin.html");
          rd.forward(request, response);
  }
  catch(ClassNotFoundException | SQLException e){
   //e.printStackTrace();
   System.out.println("connect fail");
  }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
