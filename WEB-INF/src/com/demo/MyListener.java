package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent e)
    {
        System.out.println("Application started");
    }
    public void contextInitialized(ServletContextEvent e)
    {
        System.out.println("Application STopped");
    }
    
}
