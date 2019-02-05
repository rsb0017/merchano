
            <%-- 
    Document   : index.jsp
    Created on : Jun 22, 2017, 3:25:46 PM
    Author     : Rohit
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
   .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li.dropdown {
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color:#ccccff;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}
.dropdown-content a:hover {background-color: #f1f1f1;
opacity:1.0;
}

.dropdown:hover .dropdown-content {
    display: block;
}
.dropdown:hover .dropbtn {
    background-color:green;
}

            #srch{
    width: 130px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    
    /*background-position: 10px 10px;*/
    background-repeat: no-repeat;
    padding: 12px 20px 12px 20px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}
#fix{
    
}

#srch:focus {
    width: 100%;
}
            table{ 
                width:100%;
                background-color:#ffffff;
                height:150px; }
            #logo {
                font-size:300%;
                font-family: serif;
                color:#999900;
                width:100% 
              
            }   
          ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: green;
}  
#blank{
    width:100%;
    
}
          
        </style>
    </head>
    <body>
       
        <div id="fix">
            
        <table>
            <tr>
                <td><%
                    String m="";
               if(request.getCookies().length>1)
               {
                   Cookie cook4[]=request.getCookies();
               
             if(cook4.length>1)
             {  
                 m=cook4[2].getValue();
                   
  }
               }%>
                    <sql:setDataSource var="db"  driver="com.mysql.jdbc.Driver" 
                           url="jdbc:mysql://localhost:3306/store" user="root" password=""/>
                    <sql:query var="rs" dataSource="${db}">
                        select `add` from info where `id`='<%=m%>'  
                    </sql:query>
                      <c:forEach var="tb" items="${rs.rows}">
                         <c:out value="${tb.add}"/>                                  
                      <img src="images/cart.png" width="60" height="60" style="float: left;" > 
                     </c:forEach> 
                </td>
            </tr> <tr>
                <th id="logo"><pre>MeRchano.com
                              <span style="color:#666600"> <i>Store for all solutions </i>  </th>    
            </tr>
        </table>
        <div id="blank">        <ul>
                <li> <a href="home.jsp">Home</a></li>
             <li class="dropdown">
    <a href="" class="dropbtn">Electronics</a>
    <div class="dropdown-content">
      <a href="Laptops.jsp">Laptops</a>
      <a href="Mobiles.jsp">Mobiles</a>
      <a href="Appliances.jsp">Appliances</a>
    </div>
  </li>
            
            <li class="dropdown">
    <a href="" class="dropbtn">Clothing</a>
    <div class="dropdown-content">
      <a href="Mens.jsp">Mens</a>
      <a href="Women.jsp">Womens</a>
      
    </div>
  </li>
             <li class="dropdown">
    <a href="" class="dropbtn">Grooming</a>
    <div class="dropdown-content">
      <a href="Trimmers.jsp">Trimmers</a>
      <a href="Hair.jsp">Hair Dryers</a>
      
    </div>
  </li>
            
  <li> <a href="signup.jsp">Profile</a></li>
           <li><input id="srch" type="text" name="search" placeholder="Search.."></li>
           <li class="dropdown"> <a href="" class="dropbtn"><%
               if(request.getCookies().length>1)
               {
                   Cookie cook1[]=request.getCookies();
               
             if(cook1.length>1)
             {  
                String c=cook1[1].getValue();
                out.println(c);   
  }
               }%></a>
            <div class="dropdown-content">
                   <a href="logout.jsp">Logout</a></div></li>
        </ul>
        </div>
    </div>        
    </body>
</html>

