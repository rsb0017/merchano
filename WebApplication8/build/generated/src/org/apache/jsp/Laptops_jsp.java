package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Laptops_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             .img{\n");
      out.write("                    margin-right:10px;\n");
      out.write("                    margin-top: 5px\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px;padding:0px;background-color:#ccccff;\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        <img  src=\"lap/GS32.jpg\" width=\"1350\" height=\"400\" >\n");
      out.write("        <div id=\"m1\">\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\">\n");
      out.write("                <img id=\"hv\" src=\"lap/s-l225 (1).jpg\" height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Dell ultra book 570\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs230000</del>Rs120000<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"17\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\">\n");
      out.write("        <img id=\"hv\" src=\"lap/s-l225 (2).jpg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Dell xps15\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs230000</del>Rs90000<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"18\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\">\n");
      out.write("                  <img id=\"hv\" src=\"lap/s-l225 (3).jpg\" height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Dell Inspiron 31x\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs74900</del>Rs44900 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"19\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"img\" style=\"float:left; margin-right:30px\">\n");
      out.write("                 <img id=\"hv\" src=\"lap/s-l225 (4).jpg\"  height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Dell Vostro lite\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs30000</del> Rs21110<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"20\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("           \n");
      out.write("        <div class=\"img\" style=\"float:left;\">\n");
      out.write("                 <img id=\"hv\" src=\"lap/s-l225 (5).jpg\"  height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Asus ultra book\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs80000</del> Rs56000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"21\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("       \n");
      out.write("        <div id=\"m1\">\n");
      out.write("          \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\">\n");
      out.write("                <img id=\"hv\" src=\"lap/s-l225 (6).jpg\" height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Dell ultra book 570\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs230000</del>Rs120000<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"22\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\" >\n");
      out.write("        <img id=\"hv\" src=\"lap/s-l225 (7).jpg\" height=\"225\" width=\"225\"></img>\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Acer aspire E5-573\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs40000</del>Rs32000<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"23\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:30px;\">\n");
      out.write("                  <img id=\"hv\" src=\"lap/s-l225 (8).jpg\" height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                 Acer aspire E5-573 \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs74900</del>Rs44900 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"24\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"img\" style=\"float:left; margin-right:30px\">\n");
      out.write("                 <img id=\"hv\" src=\"lap/s-l225 (9).jpg\"  height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Asus Rog\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs30000</del> Rs21110<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"25\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("           \n");
      out.write("            <div class=\"img\" style=\"float:left;\">\n");
      out.write("                 <img id=\"hv\" src=\"lap/s-l225.jpg\"  height=\"225\" width=\"225\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Acer Swift S\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs80000</del> Rs56000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt2\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"26\" type=\"submit\">ADD to cart</button>\n");
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
