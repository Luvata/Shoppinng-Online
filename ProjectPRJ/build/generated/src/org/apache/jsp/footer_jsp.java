package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <section id=\"footer-bar\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"span3\">\n");
      out.write("                    <h4>Navigation</h4>\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li><a href=\"./index.html\">Homepage</a></li>  \n");
      out.write("                        <li><a href=\"./about.html\">About Us</a></li>\n");
      out.write("                        <li><a href=\"./contact.html\">Contac Us</a></li>\n");
      out.write("                        <li><a href=\"./cart.html\">Your Cart</a></li>\n");
      out.write("                        <li><a href=\"./register.html\">Login</a></li>\t\t\t\t\t\t\t\n");
      out.write("                    </ul>\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span4\">\n");
      out.write("                    <h4>My Account</h4>\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li><a href=\"#\">My Account</a></li>\n");
      out.write("                        <li><a href=\"#\">Order History</a></li>\n");
      out.write("                        <li><a href=\"#\">Wish List</a></li>\n");
      out.write("                        <li><a href=\"#\">Newsletter</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span5\">\n");
      out.write("                    <p class=\"logo\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></p>\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>\n");
      out.write("                    <br/>\n");
      out.write("                    <span class=\"social_icons\">\n");
      out.write("                        <a class=\"facebook\" href=\"#\">Facebook</a>\n");
      out.write("                        <a class=\"twitter\" href=\"#\">Twitter</a>\n");
      out.write("                        <a class=\"skype\" href=\"#\">Skype</a>\n");
      out.write("                        <a class=\"vimeo\" href=\"#\">Vimeo</a>\n");
      out.write("                    </span>\n");
      out.write("                </div>\t\t\t\t\t\n");
      out.write("            </div>\t\n");
      out.write("        </section>\n");
      out.write("        <section id=\"copyright\">\n");
      out.write("            <span>Copyright 2013 bootstrappage template  All right reserved.</span>\n");
      out.write("        </section>\n");
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
