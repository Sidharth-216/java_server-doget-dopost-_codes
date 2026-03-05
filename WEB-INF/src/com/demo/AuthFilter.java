package com.demo;
import java.io.*;
import java.util.logging.Filter;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter
{
    protected void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain)throws IOException,ServletException
    {
        HttpServletRequest req=(HttpServletRequest)request;
        HttpSession session=response.getSession(false);
        if(session==null || session.getAttribute("user")==null)
        {
            response.setContextType("text/html");
            response.getWriter().println("Please LOgin again");

        }
        else
        {
            chain.doFilter(request,response);
        }
    }    
}
