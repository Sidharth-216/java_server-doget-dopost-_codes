package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException, ServletException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<form action='hiddenWelcome' method='post'>");
        out.println("<input type='hidden' name='username' value='" + name + "'>");
        out.println("<input type='submit' value='Go to Welcome'>");
        out.println("</form>");
    }
}