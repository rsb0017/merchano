package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #pfl{\n");
      out.write("             border:2px solid black;\n");
      out.write("             margin-left:100px;\n");
      out.write("             margin-bottom:3px;\n");
      out.write("             padding:10px;\n");
      out.write("             opacity:0.8;\n");
      out.write("            }   \n");
      out.write("            #pfl1{\n");
      out.write("                border:2px solid black;\n");
      out.write("                color:black;\n");
      out.write("                font-family: serif;\n");
      out.write("            }  \n");
      out.write("            #pfl:hover{\n");
      out.write("              opacity:1.0; \n");
      out.write("              border:4px solid black;  \n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px; padding:0px\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("      ");
  
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
      
      
      out.write("\n");
      out.write("      <div id=\"pfl\" style=\"width:80%\">\n");
      out.write("              \n");
      out.write("          <img id=\"pfl1\" src =\"");
      out.print(q);
      out.write("\" height=\"100\" width=\"100\"><pre><span style=\"font-size:120%;\"><b>  ");
      out.print(q1);
      out.write("  Price= ");
      out.print(q2);
      out.write("</b></span></pre><br>\n");
      out.write("          \n");
      out.write("      </div>  \n");
      out.write("       \n");
      out.write("       ");

       }
       
        }
          
        
         
      }}
      catch(Exception ex){
      ex.printStackTrace();
      }
      
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
