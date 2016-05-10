package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminMagazine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Magazines</h1>\n");
      out.write("        <form action=\"DatabaseMagazines\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <h2>ADD MAGAZINES</h2>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magid\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine Price</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magprice\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"ADD\" /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"RESET\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <form action=\"DatabaseMagazines\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <h2>UPDATE MAGAZINES</h2>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magupid\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine Name</td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine price</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magupname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"UPDATE\" /></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"RESET\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("        <form action=\"DatabaseMagazines\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("           \n");
      out.write("                <h2>DELETE MAGAZINES</h2>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magdelid\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magdelname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Magazine Price</td>\n");
      out.write("                        <td><input type=\"text\" name=\"magdelprice\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"DELETE\" /></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"RESET\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
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
