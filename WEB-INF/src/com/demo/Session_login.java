package com.demo;

import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Session_login extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        HttpSession session=request.getSession();
        session.setAttribute("username",username);
        response.sendRedirect("welcome.html");
    }
    
}
