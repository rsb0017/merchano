<%-- 
    Document   : remove
    Created on : Aug 5, 2017, 10:49:33 AM
    Author     : Rohit
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/store" user="root" password=""/>
        <sql:update dataSource="${db}" var="up">
          delete from prdct where `bno`='${param.remove}'  
        </sql:update> 
        <% 
        try{
           String eid="";
          if(request.getCookies().length>1)
               {
                   Cookie cook3[]=request.getCookies();
               
             if(cook3.length>1)
             {  
                 eid=cook3[2].getValue();
                   
  }   
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
         Statement ob=con.createStatement();
         String qry="Select `add` from info where `id`='"+eid+"'";
         ResultSet rs=ob.executeQuery(qry);
         String abc="";
         while(rs.next())
          abc=rs.getString(1);
         int a=Integer.parseInt(abc);
         --a;
         qry="Update info set `add`="+a+"where `id`='"+eid+"'";
        ob.executeUpdate(qry);
        }}
        catch(Exception ex){}
        %>
        <c:redirect url="profile.jsp"></c:redirect>
        
    </body>
</html>
