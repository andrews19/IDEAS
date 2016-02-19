/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.session;
import java.util.Arrays;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String usu=   request.getParameter("username");
           String contra =request.getParameter("password");
          
             String[] datos = session.getFila("SELECT * FROM user WHERE email='" + usu + "' and password='" + contra + "'  ");
          

             System.out.println(Arrays.toString(datos));
             
        if (datos == null) {
        
           request.getRequestDispatcher("ErrorServer.jsp").forward(request, response);
      
            } else {

            
               String tipo = datos[4];
               String nombre = datos[1];
               String apellido= datos[2];
               String nombre_comple=nombre+" "+apellido;
                 HttpSession session = request.getSession();

                 if ("Administrador".equals(tipo)) {

                    session.setAttribute("nombre", nombre_comple);
                    session.setAttribute("tipo", tipo);
                    System.out.println(nombre_comple);
                    response.sendRedirect("MenuAdmin.jsp");

                }  if ("Valuador".equals(tipo)) {

                   session.setAttribute("nombre", nombre_comple);
                    session.setAttribute("tipo", tipo);
                    System.out.println(nombre_comple);
                    response.sendRedirect("MenuPrincipal.jsp");
                }
                if ("Usuario".equals(tipo)) {

                    session.setAttribute("nombre", nombre_comple);
                    session.setAttribute("tipo", tipo);
                    System.out.println(nombre_comple);
                    response.sendRedirect("MenuValuador.jsp");
                }
        }
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
