<%-- 
    Document   : logout
    Created on : Jul 5, 2017, 4:29:30 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
     if(request.getCookies().length>1)
     {
         try { 
                       Cookie delCookies[]=request.getCookies();        
             if(delCookies.length>1)
             {
    delCookies[1].setMaxAge(0); 
   response.addCookie(delCookies[1]); 
   delCookies[2].setMaxAge(0); 
   response.addCookie(delCookies[2]); 
     response.sendRedirect("login.jsp");
             }
}catch(Exception e) { 
System.out.println("del:::cookieValue::exception:::"+e); 
}
     
     }
     %>
        
    </body>
</html>
