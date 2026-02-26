package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome_servlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession(false);
        if(session!=null)
        {
            String name=(String)session.getAttribute("username");
            out.println("<h2>"+name+"</h2>");
            out.println("<a href='logout'>logout</a>");
        }
        else
        {
            out.println("session expired");
        }
    }   
}
