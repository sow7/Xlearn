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
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class submatch1 extends HttpServlet {

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
        String skill_id=request.getParameter ("skillid");
        int skill=Integer.parseInt(skill_id);
        String L_email=request.getParameter ("L_email");
        String T_email=request.getParameter ("T_email");
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(submatch1.class.getName()).log(Level.SEVERE, null, ex);
        }
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Xlearn","xlearn","xlearn")) {
                Statement st = conn.createStatement();
//                st.execute("insert into MATCH_REQUEST(MATCH_STATUS,SKILL_ID,LEARNER_EMAIL,TEACHER_EMAIL) VALUES ('"+M_status+"',"+skill_id+",'"+L_email+"','"+T_email+"')");
                st.execute("insert into MATCH_REQUEST(MATCH_STATUS,SKILL_ID,LEARNER_EMAIL,TEACHER_EMAIL) VALUES ('submitted',"+skill+",'"+L_email+"','"+T_email+"')");
            } catch (SQLException ex) {
            Logger.getLogger(submatch1.class.getName()).log(Level.SEVERE, null, ex);
        }
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/PersonalPage.jsp");
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
