/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-31 04:43:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/ezen_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("<title>Product Register Page</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/product/register.css\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/e927512ef5.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>제품 등록 페이지</h1>\r\n");
      out.write("	 <form action=\"/product/register\" method=\"post\" id=\"registerForm\" class=\"was-validated\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <div id=\"productDiv\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"product\" data-value=\"정수기\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"fa-solid fa-glass-water\" style=\"color: #000000;\"></i>\r\n");
      out.write("                        <div class=\"product-name\">정수기</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"product\" data-value=\"공기청정기\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"fa-solid fa-fan\" style=\"color: #000000;\"></i>\r\n");
      out.write("                        <div class=\"product-name\">공기청정기</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"product\" data-value=\"제습기\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"fa-solid fa-droplet-slash\" style=\"color: #000000;\"></i>\r\n");
      out.write("                        <div class=\"product-name\">제습기</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"product\" data-value=\"에어컨\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"fa-solid fa-wind\" style=\"color: #000000;\"></i>\r\n");
      out.write("                        <div class=\"product-name\">에어컨</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"product\" data-value=\"텔레비전\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"fa-solid fa-tv\" style=\"color: #000000;\"></i>\r\n");
      out.write("                        <div class=\"product-name\">텔레비전</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <input type=\"hidden\" name=\"type_a\" id=\"mySelection\">\r\n");
      out.write("        <p id=\"type_aError\" class=\"error\" style=\"color: red; display: none;\">제품 카테고리를 입력해주세요.</p>\r\n");
      out.write("       <br>\r\n");
      out.write("       <input name=\"pname\" placeholder=\"제품명을 입력해주세요\"> <br><br>\r\n");
      out.write("       <p id=\"pnameError\" class=\"error\" style=\"color: red; display: none;\">제품명을 입력해주세요.</p>\r\n");
      out.write("       <input id=\"priceInput\" name=\"price\" placeholder=\"가격을 입력해주세요\"> <br><br>\r\n");
      out.write("       <p id=\"priceError\" class=\"error\" style=\"color: red; display: none;\">숫자만 입력해주세요.</p>\r\n");
      out.write("       <textarea name=\"content\" cols=\"50\" rows=\"10\">  검색 가능한 단어들을 넣어 상세정보를 입력해주세요.&#10;  예시) 2023년 다이슨 V7 무선청소기 SVC-D50PWS \r\n");
      out.write("       </textarea> <br>\r\n");
      out.write("       <div id=\"allDiv\">\r\n");
      out.write("	       <div class=\"fileDiv\">   \r\n");
      out.write("	       	   <input type=\"file\" id=\"files\" name=\"files\" style=\"display: none\" class=\"form-control\" aria-label=\"file example\" required> <br>\r\n");
      out.write("		       <button type=\"button\" id=\"trigger\">상품 메인 사진을 넣어주세요.</button> <br>      \r\n");
      out.write("		       <div id=\"fileZone\">\r\n");
      out.write("		       \r\n");
      out.write("		       </div>\r\n");
      out.write("		   </div>\r\n");
      out.write("	   \r\n");
      out.write("		   <div class=\"fileDiv\">	   	   \r\n");
      out.write("		   	   <input type=\"file\" id=\"files1\" name=\"files\" style=\"display: none\" class=\"form-control\" aria-label=\"file example\" required> <br>\r\n");
      out.write("		       <button type=\"button\" id=\"trigger1\">상품 상세 정보 사진을 넣어주세요.</button> <br>\r\n");
      out.write("		   	   \r\n");
      out.write("		       <div id=\"fileZone1\">\r\n");
      out.write("		       \r\n");
      out.write("		       </div>\r\n");
      out.write("	       </div>\r\n");
      out.write("       \r\n");
      out.write("	       <div class=\"fileDiv\">\r\n");
      out.write("	       	   <input type=\"file\" id=\"files2\" name=\"files\" style=\"display: none\" class=\"form-control\" aria-label=\"file example\" required> <br>\r\n");
      out.write("		       <button type=\"button\" id=\"trigger2\">상품 스펙 사진을 넣어주세요.</button> <br>\r\n");
      out.write("	            \r\n");
      out.write("		       <div id=\"fileZone2\">\r\n");
      out.write("		       \r\n");
      out.write("		       </div>\r\n");
      out.write("	       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       <button onclick=\"validateButton(event)\" id=\"regBtn\" class=\"btn btn-primary\" type=\"submit\" disabled>Submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\" src=\"/resources/js/product/productRegister.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	    const thereis = `");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("`;\r\n");
      out.write("	    console.log(thereis);\r\n");
      out.write("	    if (thereis === \"1\") {\r\n");
      out.write("	        alert(\"같은 상품명이 존재합니다. 다시 입력해주세요.\");\r\n");
      out.write("	        document.getElementById(\"registerForm\").addEventListener(\"submit\", function(e) {    \r\n");
      out.write("	        });\r\n");
      out.write("	    }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/product/register.jsp(92,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${thereis}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}