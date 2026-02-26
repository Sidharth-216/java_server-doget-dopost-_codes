package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet 
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        HttpSession session=request.getSession();
        if(session!=null)
        {
            session.invalidate();
        }
        response.sendRedirect("session_login.html");
     }
}
