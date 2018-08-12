/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.juros;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "JurosSServlet", urlPatterns = {"/jurossimples.php"})
public class JurosSServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Projeto 01</title>");            
            out.println("<meta charset='UTF-8'>");            
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");            
            out.println("<link href=\"estilo.css\" rel=\"stylesheet\">");            
            out.println("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">");            
            out.println("</head>");
            out.println("<body style=\"background:#1b6d85;text-align:center;color:white;\">");
            out.println("<div class=\"form\">");
            out.println("<form>\n" +
                    "<div class=\"col-md-6\">\n" +
                    "<h3>Insira seus dados</h3>\n" +        
                    "<div class=\"col-md-4\">\n" +                    
                    "<div class=\"form-group\">\n" +
                    "<label for=\"nomeL\">Taxa:</label>\n" +
                    "<input type=\"number\" name=\"taxa\" class=\"form-control\">\n"+
                    "</div></div>\n"+
                    "<div class=\"col-md-4\">\n" +
                    "<div class=\"form-group\">\n" +
                    "<label for=\"capital\">Capital:</label>\n" +
                    "<input type=\"number\" name=\"capital\" class=\"form-control\">\n"+
                    "</div></div>\n"+
                    "<div class=\"col-md-4\">\n" +
                    "<div class=\"form-group\">\n" +
                    "<label for=\"tempo\">Tempo:</label>\n" +
                    "<input type=\"number\" name=\"tempo\" class=\"form-control\">\n"+
                    "</div></div>\n"+
                    "<input type=\"submit\" class=\"btn botao-form\" value=\"Calcular\">"
                    
            );
            out.println("<a href=\"home.php\" name=\"btnVoltar\" class=\"btn botao-form\">Voltar</a>");
            double capital = Double.parseDouble(request.getParameter("capital"));
            double taxa = Double.parseDouble(request.getParameter("taxa"));
            double tempo = Double.parseDouble(request.getParameter("tempo"));
            
            double juros = capital*taxa*tempo;
            
            
              
            
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<h2>Juros Simples: "+juros+"</h2>");
                      
            
                     
            
            
            
            out.println("</body>");
            out.println("</html>");
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
