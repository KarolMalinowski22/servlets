<%@page language="java" contentType="text/html" %>
    <html>
    <head>
        <title>
            HOME PAGE
        </title>
    </head>
    <body>
    nasz pierwszy jsp
    <h1>
        <% for (int i = 1; i < 101; i++) {
            out.print(i + " ");
            if(i % 10 == 0){
                out.print("<br>");
            }
        } %>
    </h1>
    </body>
    </html>