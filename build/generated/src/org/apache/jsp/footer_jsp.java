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
      out.write("        <footer class=\"page-footer font-small blue pt-4\">\n");
      out.write("\n");
      out.write("          <!-- Footer Links -->\n");
      out.write("          <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("\n");
      out.write("            <!-- Grid row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("              <!-- Grid column -->\n");
      out.write("              <div class=\"col-md-6 mt-md-0 mt-3\">\n");
      out.write("\n");
      out.write("                <!-- Content -->\n");
      out.write("                <h5 class=\"text-uppercase\">Vrunda Mobile Store</h5>\n");
      out.write("                <p>Vrunda's Mobiles Pvt. Ltd. is India's leading multi-brand retail chain dealing in international and Indian brands of mobile handsets and mobiles accessories.</p>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <!-- Grid column -->\n");
      out.write("\n");
      out.write("              <hr class=\"clearfix w-100 d-md-none pb-3\">\n");
      out.write("\n");
      out.write("              <!-- Grid column -->\n");
      out.write("              <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h5 class=\"text-uppercase\">Support</h5>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Customer Care</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Price Drop Protection</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Damage Protection</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Contact Us</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Site Map</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Blog</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <!-- Grid column -->\n");
      out.write("\n");
      out.write("              <!-- Grid column -->\n");
      out.write("              <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h5 class=\"text-uppercase\">Care@vrunda</h5>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"#!\">For Online Queries<br>\n");
      out.write("                      Email: online@vrundamobiles.com</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"#!\">For Store Queries<br>\n");
      out.write("Email: support@vrundamobiles.com</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#!\">Call: 080-49397000</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"#!\">Timings:<br>\n");
      out.write("                          Weekdays: 8:30 am to 8:30 pm<br>\n");
      out.write("Sunday: 9:30 am to 5:00 pm</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <!-- Grid column -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid row -->\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Footer Links -->\n");
      out.write("\n");
      out.write("          <!-- Copyright -->\n");
      out.write("          <div class=\"footer-copyright text-center py-3\">© 2019 Copyright: Vrunda Mhatre\n");
      out.write("          </div>\n");
      out.write("          <!-- Copyright -->\n");
      out.write("\n");
      out.write("        </footer>\n");
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
