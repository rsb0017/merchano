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
        <style>
            #pfl{
             border:2px solid black;
             margin-left:100px;
             margin-bottom:3px;
             padding:10px;
             opacity:0.8;
            }   
            #pfl1{
                border:2px solid black;
                color:black;
                font-family: serif;
            }  
            #pfl:hover{
              opacity:1.0; 
              border:4px solid black;  
            }
        </style> 
    </head>
    <body style="margin:0px; padding:0px">
        <jsp:include page="index.jsp"></jsp:include>
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
           String qry="select `bno` from prdct where `id`='"+eid+"'";
           ResultSet rs=ob.executeQuery(qry);
           ArrayList<String> al=new ArrayList<String>() ;
            ArrayList<String> al1=new ArrayList<String>() ;
           int i=1;
          
           while(rs.next())
           {
               
             al.add(rs.getString(1));
         
           }
       
      
        
        Iterator itr=al.iterator();
        String s="",s1;
        while(itr.hasNext())
        {
        s=(String)itr.next();
       String qr="select `image`,`imgname`,`price`,`bno` from pinfo where `bno`='"+s+"'";
       ResultSet rb=ob.executeQuery(qr);
       while(rb.next()){
       String q=rb.getString(1);
       String q1=rb.getString(2);
       String q2=rb.getString(3);
      
      %>
      <div id="pfl" style="width:80%">
              
          <img id="pfl1" src ="<%=q%>" height="100" width="100"><pre><span style="font-size:120%;"><b>  <%=q1%>  Price= <%=q2%></b></span></pre><br>
         <form action="remove.jsp">
          <button type="submit" name="remove" value="<%=s%>">
            REMOVE  
          </button></form> 
      </div>  
       
       <%
       }
       
        }
          
        
         
      }}
      catch(Exception ex){
      ex.printStackTrace();
      }
      %>
    </body>
</html>
