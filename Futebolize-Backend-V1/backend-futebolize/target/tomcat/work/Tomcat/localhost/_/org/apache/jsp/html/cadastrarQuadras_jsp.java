/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-16 06:09:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.futebolize.model.User;

public final class cadastrarQuadras_jsp extends org.apache.jasper.runtime.HttpJspBase
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
// @Desenvolvido por: Matheus Campos & Gabriel Alves 
      out.write("\r\n");
      out.write("\r\n");

  // Verifica se o atributo na sessão é null
  if(request.getSession().getAttribute("usuarioLogado") == null)
    response.sendRedirect("quadras.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <!-- @Desenvolvido por: Matheus Campos & Rafael Abrantes & Gabriel Alves -->\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1\">\r\n");
      out.write("  <title>Futebolize</title>\r\n");
      out.write("  <link rel=\"icon\" href=\"../assets/images/ball.ico\">\r\n");
      out.write("  <link href=\"../css/cadastroQuadras.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("  <nav>\r\n");
      out.write("    <a href=\"../index.jsp\">\r\n");
      out.write("      <img class=\"logo\" src=\"/assets/images/logo.png\"> </a>\r\n");
      out.write("    <div class=\"mobile-menu\">\r\n");
      out.write("      <div class=\"line1\"></div>\r\n");
      out.write("      <div class=\"line2\"></div>\r\n");
      out.write("      <div class=\"line3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav-list\">\r\n");
      out.write("      <li><a href=\"quadras.jsp\">QUADRAS</a></li>\r\n");
      out.write("      <li><a href=\"perfil.jsp\">MEU PERFIL</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- Conteúdo -->\r\n");
      out.write("<main>\r\n");
      out.write("  <section class=\"area-login\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login\">\r\n");
      out.write("      <div>\r\n");
      out.write("        <a href=\"../index.jsp\">\r\n");
      out.write("          <img class=\"logo\" src=\"../assets/images/logo.png\" alt=\"Logo\"></a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Elemento de conexão com o banco e backend-->\r\n");
      out.write("      <form action=\"/cadastrarQuadra\" method=\"post\" enctype=\"multipart/form-data\" onsubmit=\"return criarQuadra(this)\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Elementos do form-->\r\n");
      out.write("        <p>Nome da Quadra:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"text\"\r\n");
      out.write("                name=\"fieldName\"\r\n");
      out.write("                placeholder=\"Digite o nome da quadra\" autofocus\r\n");
      out.write("                required\r\n");
      out.write("                minlength=\"1\" />\r\n");
      out.write("\r\n");
      out.write("        <p>Imagem:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"file\"\r\n");
      out.write("                name=\"image\"\r\n");
      out.write("                placeholder=\"Logradouro da quadra\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p>Logradouro:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"text\"\r\n");
      out.write("                name=\"fieldAddress\"\r\n");
      out.write("                placeholder=\"Logradouro da quadra\"\r\n");
      out.write("                required\r\n");
      out.write("                minlength=\"1\" />\r\n");
      out.write("\r\n");
      out.write("        <p>Estado:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"text\"\r\n");
      out.write("                name=\"fieldState\"\r\n");
      out.write("                placeholder=\"Informe o estado\"\r\n");
      out.write("                required />\r\n");
      out.write("\r\n");
      out.write("        <p>Maximo de jogadores:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"number\"\r\n");
      out.write("                name=\"maxPlayers\"\r\n");
      out.write("                placeholder=\"Informe a qtd. maxima de jogadores\"\r\n");
      out.write("                required />\r\n");
      out.write("\r\n");
      out.write("        <p>Valor do aluguel:</p>\r\n");
      out.write("        <input\r\n");
      out.write("                type=\"text\"\r\n");
      out.write("                name=\"fieldRentValue\"\r\n");
      out.write("                placeholder=\"Valor por jogador\"\r\n");
      out.write("                required />\r\n");
      out.write("        <input type=\"submit\" value=\"CADASTRAR QUADRA!\">\r\n");
      out.write("\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../javascript/script.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.11.0/dist/sweetalert2.all.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  function criarQuadra(form){\r\n");
      out.write("    Swal.fire({\r\n");
      out.write("      title: \"Sucesso!\",\r\n");
      out.write("      text: \"Quadra cadastrada com sucesso!\",\r\n");
      out.write("      icon: \"success\"\r\n");
      out.write("    }).then((result) => {\r\n");
      out.write("      if (result.isConfirmed) {\r\n");
      out.write("        form.submit();\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("    return false;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
