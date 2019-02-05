package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mens_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("                      \n");
      out.write("            body {  padding: 0; margin: 0; }\n");
      out.write("            #men{\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            #men1{\n");
      out.write("              \n");
      out.write("                margin:5px;\n");
      out.write("                padding:10px;\n");
      out.write("                margin-bottom:5px; \n");
      out.write("                }\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("           \n");
      out.write("            #hv{\n");
      out.write("                opacity:0.9;\n");
      out.write("                border:1px solid black;\n");
      out.write("            }\n");
      out.write("            #hv:hover{\n");
      out.write("                opacity:1.0;\n");
      out.write("            }\n");
      out.write("            .txt{\n");
      out.write("                text-align:center;\n");
      out.write("                border:1px solid black;\n");
      out.write("                background-color:#cccccc;\n");
      out.write("                margin:0px;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("            #cart{\n");
      out.write("                border:1px solid black;\n");
      out.write("                padding:2px 2px;\n");
      out.write("                color:white; \n");
      out.write("                 background-color:#333;   \n");
      out.write("            }\n");
      out.write("            .img{\n");
      out.write("                    margin-right:10px;\n");
      out.write("                    margin-top: 5px\n");
      out.write("                }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#ccccff;\">\n");
      out.write("        <div>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"men\"><img id=\"men\" src=\"images/MenHero.jpg\"></div>\n");
      out.write("         \n");
      out.write("        <div id=\"men1\">\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("            <img id=\"hv\" src=\"images/Front_Medium.jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Peter England Slim Fit\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs500</del>Rs449</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"1\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("            <div>\n");
      out.write("            <img id=\"hv\" src=\"images/Front_Medium(1).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Skult\n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                    <del>Rs749 </del> Rs649</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                <button  name=\"mybutton\" value=\"2\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("            <div>\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(2).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Indigo regular Fit\n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                    <del>Rs749 </del> Rs649</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                     <button  name=\"mybutton\" value=\"3\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            <div  class=\"img\"style=\"float:left;\">\n");
      out.write("            <div>\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(3).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Roadster Pro  \n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                    <del>Rs899 </del> Rs749</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                 <button  name=\"mybutton\" value=\"4\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </div>   \n");
      out.write("             <div id=\"men1\">\n");
      out.write("          \n");
      out.write("            <div  class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(4).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Peter England Slim Fit\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs900</del>Rs746</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"5\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("          \n");
      out.write("        <div class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("            <div>\n");
      out.write("            <img id=\"hv\" src=\"images/Front_Medium(5).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Skult Green Check Shirt\n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                    <del>Rs1300 </del> Rs900</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                     <button  name=\"mybutton\" value=\"6\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"img\" style=\"float:left;margin-right:15px;\">\n");
      out.write("            <div>\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(6).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Indigo regular Fit\n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                    <del>Rs2300</del> Rs1600</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                     <button  name=\"mybutton\" value=\"7\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("             <div class=\"img\" style=\"float:left;\">\n");
      out.write("            <div>\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(7).jpg\">\n");
      out.write("            <div class=\"txt\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Roadster Pro  \n");
      out.write("                </p> \n");
      out.write("                <p>\n");
      out.write("                <del>Rs821</del> Rs550</p>\n");
      out.write("                <form action=\"crt\">\n");
      out.write("                     <button  name=\"mybutton\" value=\"8\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </div>    \n");
      out.write("            \n");
      out.write("            </body>\n");
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
