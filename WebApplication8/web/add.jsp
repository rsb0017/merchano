<%-- 
    Document   : add
    Created on : Jul 3, 2017, 11:46:27 AM
    Author     : Rohit
--%>




<%@page import="java.sql.*"%>
<%@page  import ="javax.swing.*%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            
            try{Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","");
           Statement ob=con.createStatement();
           String abc="select *from info";
           ResultSet rs=ob.executeQuery(abc);
           String a1="",a2="";
           if(rs.next())
            {
             a1=rs.getString(1);
             a2=rs.getString(2);
            
            
            }}
catch(Exception ex){}%>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/cart" user="root" password=""/>
        <sql:query var="rs" dataSource="${db}">
            select add from val;
        </sql:query>        
            <c:forEach var="table" items="${rs.rows}">
                
            </c:forEach>
                  
    </body>
</html>
