/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-08-02 04:52:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/ezen_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1685681139796L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign Up Page</title>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/e927512ef5.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/user/signup.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"a\">\r\n");
      out.write("        <a href=\"/home.html\">\r\n");
      out.write("            <img src=\"/img/rental.png\" alt=\"\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("     <form action=\"/user/signup\" method=\"post\">\r\n");
      out.write("      <input type=\"text\" id=\"cid\" name=\"cid\" placeholder=\"아이디\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("              <p id=\"cidError\" style=\"color: red; display: none;\">아이디를 입력해주세요.</p>\r\n");
      out.write("        <input type=\"text\" id=\"cname\" name=\"cname\" placeholder=\"이름\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("              <p id=\"cnameError\" style=\"color: red; display: none;\">이름을 입력해주세요.</p>\r\n");
      out.write("        <input type=\"password\" id=\"cpw\" name=\"cpw\" placeholder=\"비밀번호\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cpw }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("                <p id=\"cpwError\" style=\"color: red; display: none;\">비밀번호를 입력해주세요.</p>\r\n");
      out.write("        <input type=\"text\" id=\"cage\" name=\"cage\" placeholder=\"나이\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("            <p id=\"cageError\" style=\"color: red; display: none;\">나이를 입력해주세요.</p>\r\n");
      out.write("        <div class=\"gender-selection\">\r\n");
      out.write("            <label>\r\n");
      out.write("                <i id=\"maleIcon\" class=\"fa-solid fa-mars fa-2xl gender-icon\"></i>\r\n");
      out.write("                <input type=\"radio\" name=\"cgender\" value=\"man\" id=\"manRadio\" style=\"display: none;\">\r\n");
      out.write("                <span id=\"maleText\" class=\"gender-text\">남자</span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>\r\n");
      out.write("                <i id=\"femaleIcon\" class=\"fa-solid fa-venus fa-2xl gender-icon\"></i>\r\n");
      out.write("                <input type=\"radio\" name=\"cgender\" value=\"woman\" id=\"womanRadio\" style=\"display: none;\">\r\n");
      out.write("                <span id=\"femaleText\" class=\"gender-text\">여자</span>\r\n");
      out.write("            </label>\r\n");
      out.write("                <p id=\"cgenderError\" style=\"color: red; display: none;\">성별 입력해주세요.</p>\r\n");
      out.write("        </div><br>\r\n");
      out.write("        <input type=\"text\" id=\"cnick_name\" name=\"cnick_name\" placeholder=\"닉네임\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cnick_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("              <p id=\"cnick_nameError\" style=\"color: red; display: none;\">닉네임을 입력해주세요.</p>\r\n");
      out.write("        <input type=\"email\" id=\"cemail\" name=\"cemail\" placeholder=\"RENTAL@okRental.com\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cemail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("                 <p id=\"cemailError\" style=\"color: red; display: none;\">이메일을 입력해주세요.</p>\r\n");
      out.write("        <input type=\"text\" id=\"ctel\" name=\"ctel\" placeholder=\"010-1234-5678\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.ctel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("              <p id=\"ctelError\" style=\"color: red; display: none;\">전화번호를 입력해주세요.</p>\r\n");
      out.write("        <input type=\"text\" id=\"cadd\" name=\"cadd\" placeholder=\"주소 입력\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.cadd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("              <p id=\"caddError\" style=\"color: red; display: none;\">주소를 입력해주세요.</p>\r\n");
      out.write("        <button onclick=\"validateButton(event)\" type=\"submit\">회원 가입</button>\r\n");
      out.write("   </form>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"ft-logo\">\r\n");
      out.write("                <img src=\"/img/images.png\" alt=\"\" width=\"50px\" height=\"50px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footinfo\">\r\n");
      out.write("                <span><h6>©2023 Ok RENTAL. All Rights Reserved.</h6></span>\r\n");
      out.write("                <span><h6>RETURN POLICY</h6></span>\r\n");
      out.write("                <span><h6>TERMS & LEGAL</h6></span>\r\n");
      out.write("                <span><h6>PRIVACY NOTICE</h6></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footsns\">\r\n");
      out.write("           <a href=\"https://www.facebook.com/login/?locale=ko_KR\"><i class=\"fa-brands fa-facebook\" style=\"color: #000000;\"></i></a>\r\n");
      out.write("           <a href=\"https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoia28ifQ%3D%3D%22%7D\"><i class=\"fa-brands fa-twitter\" style=\"color: #000000;\"></i></a>\r\n");
      out.write("            <a href=\"https://www.instagram.com/\"><i class=\"fa-brands fa-instagram\" style=\"color: #000000;\"></i></a>\r\n");
      out.write("            <a href=\"https://github.com/login\"><i class=\"fa-brands fa-github\" style=\"color: #000000;\"></i></a>\r\n");
      out.write("            <a href=\"https://discord.com/login\"><i class=\"fa-brands fa-discord\" style=\"color: #000000;\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("         const signupFail = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${signupFail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("         console.log(\"dddddd \"+signupFail); \r\n");
      out.write("         \r\n");
      out.write("            if(signupFail == 1){\r\n");
      out.write("                alert('중복된 아이디입니다.');\r\n");
      out.write("            }/* else if(signupFail == 2){\r\n");
      out.write("                alert('회원가입완료');\r\n");
      out.write("            } */\r\n");
      out.write("         \r\n");
      out.write("   </script> \r\n");
      out.write("    <script src=\"/resources/js/user/signup.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}