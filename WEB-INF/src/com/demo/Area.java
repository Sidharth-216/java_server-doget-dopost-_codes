package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Area extends HttpServlet 
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        double length=Double.parseDouble(request.getParameter("length"));
        double breath=Double.parseDouble(request.getParameter("breath"));
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        double area=length*breath;
        out.println("<h2>Area:"+area+"</h2");


    }
}
