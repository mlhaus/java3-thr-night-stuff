<%-- 
    Document   : index
    Created on : Feb 18, 2021, 6:57:13 PM
    Author     : k0519415
--%>
<%--Hello There--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    private final String DEFAULT_USER = "Guest";

%>
<%
    String user = request.getParameter("user");
    if(user == null)
        user = DEFAULT_USER;
    String[] fruits = request.getParameterValues("fruit");
%>
<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link href="styles/main.css" rel="stylesheet">
        
    </head>
    <body>
        <%
            if(fruits == null) {
                out.println("<h1>Hello, " + user + "!</h1>");
                out.println("<form action=\"newjsp.jsp\" method=\"POST\">");
                if(user.equals(DEFAULT_USER)) {
                    out.println("<label for=\"yourname\">Enter your name:</label><br>");
                    out.println("<input type=\"text\" name=\"user\" id=\"yourname\"><br><br>");
                } else {
                    out.println("<input type=\"hidden\" name=\"user\" value=\"" + user + "\">");
                }
        %>
            
            <p>Select the fruits you like to eat:</p>
            <input type="checkbox" name="fruit" id="banana" value="Banana">
            <label for="banana">Banana</label><br>
            <input type="checkbox" name="fruit" id="apple" value="Apple">
            <label for="apple">Apple</label><br>
            <input type="checkbox" name="fruit" id="orange" value="Orange">
            <label for="orange">Orange</label><br>
            <input type="checkbox" name="fruit" id="guava" value="Guava">
            <label for="guava">Guava</label><br>
            <input type="checkbox" name="fruit" id="kiwi" value="Kiwi">
            <label for="kiwi">Kiwi</label><br><br>
            
            <input type="submit" value="Submit">
        </form>
        
        <%
            } else {
                out.println("<h1>" + user + "'s Selections!</h1>");
                if(fruits == null)
                    out.println("<p>You did not select any fruits.</p>");
                else {
                    out.println("<ul>");
                    for(String fruit : fruits) {
                        out.println("<li>" + fruit + "</li>");
                    }
                    out.println("</ul>");
                }
                out.println("<a href=\"newjsp.jsp?user=" + user + "\">Fill out the form again</a>");
            }
        %>
        <!--<script src="scripts/app.js"></script>-->
    </body>
</html>
