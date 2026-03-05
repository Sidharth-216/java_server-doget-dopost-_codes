package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException , ServletException
    {
        String name=request.getParameter("username");
        Cookie cookie=new Cookie("username",name);
        response.addCookie(cookie);
        response.sendRedirect("cookieWelcome");
        

    }
}
