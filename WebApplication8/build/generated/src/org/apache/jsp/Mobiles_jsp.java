package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mobiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link rel=\"stylesheet\" href=\"newcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px;padding:0px;background-color:  #9999ff\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        <img style=\"width:100%;\" src=\"mobile/k2-_6169eb14-2f4f-4d2f-a3d5-bf6349103642.v1.jpg\" height=\"400\">\n");
      out.write("          <div id=\"m1\">\n");
      out.write("          \n");
      out.write("              <div class=\"img\" style=\"float:left;margin-right:50px;\">\n");
      out.write("                <img id=\"hv\" src=\"mobile/s6.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Samsung galaxy S6\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs49000</del>Rs30000<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("               <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"27\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>  \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("    <div class=\"img\" style=\"float:left;margin-right:50px;\" >\n");
      out.write("        <img id=\"hv\" src=\"mobile/htc10.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  HTC 10\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs51000</del>Rs40000<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"28\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              <div class=\"img\" style=\"float:left;margin-right:50px;\">\n");
      out.write("                  <img id=\"hv\" src=\"mobile/MP000000000925572_252Wx374H_20170107052940.jpeg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  HTC Desire 10pro\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs26000</del>Rs20000 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"29\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"img\" style=\"float:left; margin-right:50px\">\n");
      out.write("                 <img id=\"hv\" src=\"mobile/j7max.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    J7MAX\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs20000</del> Rs17499<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"30\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("        <div id=\"m1\">\n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:50px\">\n");
      out.write("            <img id=\"hv\" src=\"mobile/k3.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    LG k3\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs13000</del> Rs10000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"31\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div></div>\n");
      out.write("            <div class=\"img\"style=\"float:left;margin-right:50px\">\n");
      out.write("                <img id=\"hv\" src=\"mobile/v20.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    LG V20\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs52000</del> Rs40000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"32\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             </div>\n");
      out.write("            <div class=\"img\" style=\"float:left;margin-right:50px\">\n");
      out.write("            <img id=\"hv\" src=\"mobile/lgx.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    LG X Power\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs20000</del> Rs15000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"33\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             </div>\n");
      out.write("             <div class=\"img\" style=\"float:left;margin-right:50px\">\n");
      out.write("                 <img id=\"hv\" src=\"mobile/iphone.jpeg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                   Iphone 7(32gb)\n");
      out.write("                </p>\n");
      out.write("                <p><del>Rs80000</del> Rs56000<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                 <form action=\"crt4\">\n");
      out.write("                    <button  name=\"mybutton\" value=\"34\" type=\"submit\">ADD to cart</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             </div>\n");
      out.write("        </div>\n");
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
