<%-- 
    Document   : newjspz
    Created on : Jul 8, 2017, 12:13:37 PM
    Author     : Rohit
--%>

<%-- 
    Document   : profile
    Created on : Jun 23, 2017, 11:28:08 PM
    Author     : Rohit
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.awt.*"%>
<%@page import="javax.swing.*"%>
<%@page import="java.awt.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%  
          try{
          
          String eid="";
          if(request.getCookies().length>1)
               {
                   Cookie cook3[]=request.getCookies();
               
             if(cook3.length>1)
             {  
                 eid=cook3[2].getValue();
                   
  }}
             
  Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
           Statement ob=con.createStatement(); 
           String qry="select `bno` from prdct where `id`='"+eid+"'";
           ResultSet rs=ob.executeQuery(qry);
           ArrayList<String> al=new ArrayList<String>() ;
           int i=1;
           String s="",s2="",s3="",s4="";
           while(rs.next())
           {
          s=rs.getString(1);
          s2=rs.getString(2);
          s3=rs.getString(3);
          s4=rs.getString(4);
           }
        out.println("hello");
         out.println(s);
         out.println(s2);
         out.println(s3);
         out.println(s4);
         
         
      }
      catch(Exception ex){
      ex.printStackTrace();
      }
      %>
    </body>
</html>
