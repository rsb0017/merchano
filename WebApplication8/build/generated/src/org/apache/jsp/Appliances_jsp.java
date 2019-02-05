package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Appliances_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px;padding:0px;background-color:#9999ff;\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"m1\">\n");
      out.write("          \n");
      out.write("            <div style=\"float:left;margin-right:50px;\">\n");
      out.write("                <img id=\"hv\" src=\"tv/tv.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                   LG (42inch FullHD)\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs49000</del>Rs30000<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("    <div style=\"float:left;margin-right:50px;\" >\n");
      out.write("        <img id=\"hv\" src=\"tv/tv2.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  LG(56inch FullHD)\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs51000</del>Rs40000<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              <div style=\"float:left;margin-right:50px;\">\n");
      out.write("                  <img id=\"hv\" src=\"tv/tv3.jpeg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  SAMSUNG (32inch FullHD) \n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs26000</del>Rs20000 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("             <div style=\"float:left; margin-right:50px\">\n");
      out.write("                 <img id=\"hv\" src=\"tv/tv4.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                   SONY Bravia\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs20000</del> Rs17499<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("          <div id=\"m1\">\n");
      out.write("          \n");
      out.write("            <div style=\"float:left;margin-right:50px;\">\n");
      out.write("                <img id=\"hv\" src=\"tv/fridge.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    LG Side by SIDE\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs49000</del>Rs30000<span style=\"color:red\">50% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("    <div style=\"float:left;margin-right:50px;\" >\n");
      out.write("        <img id=\"hv\" src=\"tv/fridge1.jpeg\"  >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Lg double door\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs51000</del>Rs40000<span style=\"color:red\">70% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              <div style=\"float:left;margin-right:50px;\">\n");
      out.write("                  <img id=\"hv\" src=\"tv/fridge2.jpeg\">\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                  Samsung\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs26000</del>Rs20000 <span style=\"color:red\">40% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("             <div style=\"float:left; margin-right:50px\">\n");
      out.write("                 <img id=\"hv\" src=\"tv/fridge3.jpeg\" >\n");
      out.write("            <div class=\"txt1\" style=\"width:100%\">\n");
      out.write("                <p>\n");
      out.write("                    Whirlpool\n");
      out.write("                </p> \n");
      out.write("                <p><del>Rs20000</del> Rs17499<span style=\"color:red\">30% OFF</span></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("             </div></div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
