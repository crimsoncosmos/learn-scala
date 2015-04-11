package com.dac.sia.chapter1.restservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 *
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
class TestRestService {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Get method called");
        out.println("parameters: " + parameters(request));
        out.println("headers: " + headers(request));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Post method called");
        out.println("parameters: " + parameters(request));
        out.println("headers: " + headers(request));
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Delete method called");
    }

    private String headers(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();
        for (Enumeration e = request.getHeaderNames(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            builder.append("|").append(name).append("->").append(request.getHeader(name));
        }
        return builder.toString();
    }

    private String parameters(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();
        for (Enumeration e = request.getParameterNames(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            builder.append("|").append(name).append("->").append(request.getParameter(name));
        }
        return builder.toString();
    }
}
