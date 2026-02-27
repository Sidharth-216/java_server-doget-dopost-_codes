package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CookieWelcome extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Cookie[] cookies =request.getCookies();
        if (cookies!=null)
        {
            for (Cookie c :cookies)
            {
                if(c.getName().equals("username"))
                {
                    out.println("<h2>Welcome "+c.getValue()+"</h2>");
                }
                else
                {
                    out.println("NO cookies found");
                }
            }
        }
    }
}
