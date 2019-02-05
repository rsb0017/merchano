package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Women_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            #women{\n");
      out.write("                margin:5px;\n");
      out.write("                padding:10px; \n");
      out.write("                }\n");
      out.write("                .img{\n");
      out.write("                    margin-right:10px;\n");
      out.write("                    margin-top: 5px\n");
      out.write("                }\n");
      out.write("                .txt1{\n");
      out.write("                  text-align:center;\n");
      out.write("                border:1px solid black;\n");
      out.write("                background-color:#cccccc;\n");
      out.write("                margin:0px;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("               #hv{\n");
      out.write("                opacity:0.9;\n");
      out.write("                border:1px solid black;\n");
      out.write("            }\n");
      out.write("            #hv:hover{\n");
      out.write("                opacity:1.0;\n");
      out.write("            }     \n");
      out.write("                  \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px;padding:0px;background-color:#ccccff;\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        <img style=\"width:100%;\" src=\"images/WomenHero.jpg\">\n");
      out.write("         <div id=\"women\">\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;\">\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(8).jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                     Nineteen Women white and black Sheath Dress\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs2300</del>Rs1200<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"9\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("    <div class=\"img\"  style=\"float:left;\">\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium(9).jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Olive green fit shirt \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs2300</del>Rs900<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"10\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              <div class=\"img\" style=\"float:left;\">\n");
      out.write("                  <img id=\"hv\" src=\"images/Front_Medium(10).jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Women black lace fit  \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs749</del>Rs449 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"11\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"img\" style=\"float:left;\">\n");
      out.write("                  <img id=\"hv\" src=\"images/Front_Medium(11).jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Brown Regular Fit Dress\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs3000 </del> Rs2111<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"12\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("       \n");
      out.write("        <div id=\"women\">\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;\">\n");
      out.write("                <img id=\"hv\" src=\"images/Front_Medium_1038.jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                     Nineteen Women white and black Sheath Dress\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs2300</del>Rs1200<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"13\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("    <div class=\"img\" style=\"float:left;\">\n");
      out.write("        <img id=\"hv\" src=\"images/Front_Medium_142.jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Olive green fit shirt \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs2300</del>Rs900<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"14\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              <div class=\"img\" style=\"float:left;\">\n");
      out.write("                  <img id=\"hv\" src=\"images/Front_Medium_145.jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Women black lace fit  \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs749</del>Rs449 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"15\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"img\"  style=\"float:left;\">\n");
      out.write("                 <img id=\"hv\" src=\"images/Front_Medium_1541.jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Brown Regular Fit Dress\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs3000 </del> Rs2111<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                <form action=\"crt1\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"16\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("        \n");
      out.write("        \n");
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
