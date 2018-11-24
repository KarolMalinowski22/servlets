package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ParameterController", value = "/param")
public class ParameterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String[] bmw = {"M1", "E30", "M5", "3.0"};
        String[] audi = {"A3", "A6", "A8L", "Q3"};
        String company = httpServletRequest.getParameter("company");
        if("bmw".equalsIgnoreCase(company)){
            for (int i = 0; i < bmw.length; i++) {
                httpServletResponse.getWriter().println(bmw[i]);
            }
        }else if("audi".equalsIgnoreCase(company)){
            for (int i = 0; i < bmw.length; i++) {
                httpServletResponse.getWriter().println(audi[i]);
            }
        }
    }
}
