package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class Simple extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        double principal=Double.parseDouble(request.getParameter("principal"));
        double rate=Double.parseDouble(request.getParameter("rate"));
        int time=Integer.parseInt(request.getParameter("time"));
        response.setContentType("text/html");
        double si=(principal*rate*time)/100;
        PrintWriter out=response.getWriter();
        out.println("<h2>Simple Intrest:"+si+"</h2>");

    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        double principal=Double.parseDouble(request.getParameter("principal"));
        double rate=Double.parseDouble(request.getParameter("rate"));
        int time=Integer.parseInt(request.getParameter("time"));
        response.setContentType("text/html");
        double si=(principal*rate*time)/100;
        PrintWriter out=response.getWriter();
        out.println("<h2>Simple Intrest:"+si+"</h2>");
    }
}
