package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class FromServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Set response content type
        response.setContentType("text/html");

        // Generate confirmation message
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Confirmation</h2>");
        response.getWriter().println("<p>Thank you, " + name + "!</p>");
        response.getWriter().println("<p>Your email address: " + email + "</p>");
        response.getWriter().println("</body></html>");
    }
}
