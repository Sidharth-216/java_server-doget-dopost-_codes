package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet 
{

    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException 
    {

        String name = request.getParameter("name");
        String pass = request.getParameter("password");
        response.setContextType("text/html");
        if(name.equals("admin") && pass.equals("1234"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("user",name);
            response.sendRedirect("welcome");
        }
        else
        {
            response.getWriter().println("Invalid credintials");
        }
    }
}