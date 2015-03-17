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
@WebServlet(name = "Plaza", urlPatterns = {"/Plaza"})
public class Plaza extends HttpServlet {

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
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        response.setContentType("text/html;charset=UTF-8");
        Pattern pattern = Pattern.compile("[;:,#&'\".!]");
        String requestc=request.getParameter ("InputBox");
        Matcher  matcher = pattern.matcher(requestc);
        String prequest = matcher.replaceAll("|");
        //String prequest =request.getParameter ("InputBox");
        matcher = pattern.matcher(request.getParameter ("skill_content"));
        String skill_content = matcher.replaceAll("|");
        String purpose = request.getParameter ("purpose");
        String eMail = request.getParameter ("eMail");
       /* PrintWriter out = response.getWriter();
          out.println("<html><head><title>Page2</title></head><body>");
          out.println("<h1 align=\"center\"> Your ID "+prequest+skill_content+purpose+eMail+"is register success.<h1>");
          out.println("</body></html>");*/
           try{ Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn");
                Statement st = conn.createStatement();
                st.execute("INSERT INTO PUBLISH_REQUEST(PUBLISH_STATUS,REQUEST_DESCREPTION,USER_EMAIL,SKILL_CONTENT,PURPOSE) VALUES ('submitted','"+prequest+"','"+eMail+"','"+skill_content+"','"+purpose+"')");
            
  }
  catch(SQLException e){
   //e.printStackTrace();
   System.out.println("connect fail");
  }
 /* catch (InstantiationException | IllegalAccessException ex){
        Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
    }*/
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/Plaza.jsp");
          rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Plaza.class.getName()).log(Level.SEVERE, null, ex);
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
