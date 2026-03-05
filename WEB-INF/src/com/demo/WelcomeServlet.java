package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession(false);
        String user=(String)session.getAttribute("user");
        out.println("<h2>Hello"+user+"</h2>");
        out.println("<a href='logout>logout</a>");
    }
    
}
