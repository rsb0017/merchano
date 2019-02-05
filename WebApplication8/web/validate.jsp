<%-- 
    Document   : validate
    Created on : Jun 23, 2017, 11:41:50 AM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/store" user="root" password=""/>
        <sql:query var="rs" dataSource="${db}">
            Select *from info;
            </sql:query>
            <c:forEach var="table" items="${rs.rows}">
                <c:if test="${param.id ==table.id}">
                    <% try{
                        RequestDispatcher rd =request.getRequestDispatcher("signup.jsp");
                        request.setAttribute("err","Email  already registered");
                        rd.forward(request, response);}
                    catch (Exception ex){}
                    %>  
                    
                </c:if>
            </c:forEach>
                
        
        <sql:update var="up" dataSource="${db}">
         INSERT into info values('${param.user}','${param.psw}','${param.id}','${param.phn}','${param.city}');   
        </sql:update>
    </body>
</html>
