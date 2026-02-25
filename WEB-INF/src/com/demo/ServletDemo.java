//javac --release 17 -cp /home/sidhu/Desktop/JAVA_DEVELOPER/apache-tomcat-9.0.100/lib/servlet-api.jar -d WEB-INF/classes WEB-INF/src/com/demo/ServletDemo.java
package com.demo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ServletDemo extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome " + name + "</h2>");
        out.println("<p>Your email: " + email + "</p>");
    }
}
