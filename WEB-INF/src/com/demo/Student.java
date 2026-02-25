package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String name=request.getParameter("name");
        String roll=request.getParameter("roll");
        String course=request.getParameter("course");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h2>Student Detail</h2>");
        out.println("<p>Name:"+name+"</p>");
        out.println("<p>Rollno:"+roll+"</p>");
        out.println("<p>course:"+course+"</P>");
    }
}
