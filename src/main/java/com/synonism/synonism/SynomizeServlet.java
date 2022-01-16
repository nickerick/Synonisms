package com.synonism.synonism;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SynomizeServlet", urlPatterns = {""})
public class SynomizeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Received GET request.");

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Received POST request.");

        //Processing user input
        String userInput = request.getParameter("userInput");
        String returnString = Synomize.synomizeString(userInput);
        request.setAttribute("userInput", userInput);
        request.setAttribute("returnString", returnString);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
