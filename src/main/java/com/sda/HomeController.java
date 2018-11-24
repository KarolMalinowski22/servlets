package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="HomeController", value="/home", initParams = {@WebInitParam(name="city", value="Londyn"), @WebInitParam(name="times", value="5")})
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
            httpServletResponse.getWriter().println(getServletContext().getInitParameter("email"));
    }
}
