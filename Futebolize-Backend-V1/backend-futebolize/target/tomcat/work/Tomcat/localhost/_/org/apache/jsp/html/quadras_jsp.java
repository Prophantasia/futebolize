/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-16 02:08:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.futebolize.model.User;

public final class quadras_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
// @Desenvolvido por: Matheus Campos 
      out.write("\r\n");
      out.write("\r\n");

    // Verifica se o atributo na sessão é diferente de null
    if(request.getSession().getAttribute("usuarioLogado") != null)
        response.sendRedirect("quadrasLogado.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/quadras.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../assets/images/ball.ico\">\r\n");
      out.write("    <title>Quadras</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"../index.jsp\">\r\n");
      out.write("            <img class=\"logo\" src=\"/assets/images/logo.png\" alt=\"Logo\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"mobile-menu\">\r\n");
      out.write("            <div class=\"line1\"></div>\r\n");
      out.write("            <div class=\"line2\"></div>\r\n");
      out.write("            <div class=\"line3\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav-list\">\r\n");
      out.write("            <li><a href=\"quadras.jsp\">QUADRAS</a></li>\r\n");
      out.write("            <li><a href=\"sobre.jsp\">SOBRE</a></li>\r\n");
      out.write("            <li><a href=\"login.html\">LOGIN</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<section class=\"quadras\">\r\n");
      out.write("    <div id=\"quadras_1\">\r\n");
      out.write("        <div class=\"quadra_1\">\r\n");
      out.write("            <img src=\"/assets/images/quadra1-futebol.jpg\" alt=\"Quadra 1\">\r\n");
      out.write("            <p>Quadra São José do Rio Branco</p>\r\n");
      out.write("            <p>Rua Henrico Neves, 302</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"quadra_2\">\r\n");
      out.write("            <img src=\"/assets/images/quadra2-futebol.jpg\" alt=\"Quadra 2\">\r\n");
      out.write("            <p>Quadra José Carlos Albino</p>\r\n");
      out.write("            <p>Rua Carlos Lacerda, 524</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"quadra_3\">\r\n");
      out.write("            <img src=\"/assets/images/quadra3-futebol.jpg\" alt=\"Quadra 3\">\r\n");
      out.write("            <p>Quadra Jairo Almeida</p>\r\n");
      out.write("            <p>Rua Bonefácio Alves, 923</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"quadra_4\">\r\n");
      out.write("            <img src=\"/assets/images/quadra4-futebol.jpg\" alt=\"Quadra 1\">\r\n");
      out.write("            <p>Quadra São José do Rio Branco</p>\r\n");
      out.write("            <p>Rua Henrico Neves, 302</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"quadra_5\">\r\n");
      out.write("            <img src=\"/assets/images/quadra5-futebol.jpg\" alt=\"Quadra 2\">\r\n");
      out.write("            <p>Quadra José Carlos Albino</p>\r\n");
      out.write("            <p>Rua Carlos Lacerda, 524</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"quadra_6\">\r\n");
      out.write("            <img src=\"/assets/images/quadra1-futebol.jpg\" alt=\"Quadra 3\">\r\n");
      out.write("            <p>Quadra Jairo Almeida</p>\r\n");
      out.write("            <p>Rua Bonefácio Alves, 923</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <p>&copy; 2024 - Todos os direitos reservados</p>\r\n");
      out.write("    <p>Entre em contato pelo e-mail: futebolize@contato.com</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../javascript/script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
