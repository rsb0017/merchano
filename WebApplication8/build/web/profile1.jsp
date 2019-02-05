
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/store" user="root" password="" /> 
        
        <sql:update var="ob" dataSource="${db}">
            INSERT into img values(6,'${param.file1}');
        </sql:update>
        <sql:query dataSource="${db}" var="ob">
            select file1 from img where id=3;
        </sql:query>
             <c:forEach var="table" items="${ob.rows}">
                 <c:set var="name" value="<%=getServletContext().getRealPath("/images/")%>"></c:set>
                 ${name}/${table.file1}
                     <img src='${name}/${table.file1}' />
            <!--<img src="images/img_avatar2.png"-->
             </c:forEach>
    </body>
</html>
