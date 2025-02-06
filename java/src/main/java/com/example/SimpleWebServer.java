package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleWebServer extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>A Simple Servlet Example</title></head>");
            out.println("<body>");
            out.println("<h2>Hello, World!</h2>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }
}
