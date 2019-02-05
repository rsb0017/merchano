
            <%-- 
    Document   : index.jsp
    Created on : Jun 22, 2017, 3:25:46 PM
    Author     : Rohit
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="javax.swing.*"%>
<%@page import="java.awt.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/store" user="root" password=""/>
        <sql:query dataSource="${db}" var="rs">
          SELECT *from info;   
        </sql:query>
           <%int c=0;%>
        <c:forEach var="table" items="${rs.rows}">
           
            <c:if test="${param.uname ==table.id && param.pssw ==table.pass}">
                <% try{
                 c++;
                 String x=request.getParameter("uname");
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
                 Statement ob=con.createStatement();
                 String qr="select `name` from info where `id`='"+x+"'";   
                 ResultSet rs=ob.executeQuery(qr);
                 String r1="";       
                 while(rs.next())
                 {
                 r1=rs.getString(1);
                 }
                  
                 Cookie cook=new Cookie("user",r1);
                 response.addCookie(cook);
                  Cookie cook2=new Cookie("mail",x);
                 response.addCookie(cook2);
                }
                catch(Exception er){
                er.printStackTrace();
                }
                %>
                <c:redirect url="home.jsp"/> 
            </c:if>
            </c:forEach>
            <% try{
            if(c == 0)
            {
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            request.setAttribute("details","Invalid password or email");
            rd.forward(request, response);
            }}
            catch(Exception ex){}
            %>
            
        
    </body>
</html>
