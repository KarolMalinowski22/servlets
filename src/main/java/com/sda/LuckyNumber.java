package com.sda;

import com.sun.xml.internal.ws.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="LuckyNumber", value="/luck")
public class LuckyNumber extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String num = httpServletRequest.getParameter("num");
        try
        {
            int i = Integer.parseInt(num);
            if(i < 1 || i > 10){
                //httpServletResponse.getWriter().println("wrong parameter");
                throw new NumberFormatException();
            }
            if(i == (int)(Math.random() * 10 + 1)){
                httpServletResponse.getWriter().println("You won 1000k gold");
            }else {
                httpServletResponse.getWriter().println("Try another time");
            }
        }catch(NumberFormatException e){
            httpServletResponse.getWriter().println("wrong parameter");
        }
    }
}
