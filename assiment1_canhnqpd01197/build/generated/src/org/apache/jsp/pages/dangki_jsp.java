package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangki_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/css.css\">\n");
      out.write("<script src=\"../js/js.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"../css/js-image-sliderhearder.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"../js/jsimghearder.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../js/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write(" \n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\n");
      out.write("<title>Đăng kí</title>\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<!-- TemplateBeginEditable name=\"head\" -->\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("<div class=\"trangtong\">\n");
      out.write("\n");
      out.write("<div class=\"phanDau\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"sliderFrame\">\n");
      out.write("    <div id=\"slider\">\n");
      out.write("    \t\t<img src=\"../imghearder/1.jpg\"  />\n");
      out.write("            <img src=\"../imghearder/2.jpg\" />\n");
      out.write("            <img src=\"../imghearder/3.jpg\" />\n");
      out.write("            <img src=\"../imghearder/4.jpg\" />\n");
      out.write("            <img src=\"../imghearder/5.jpg\" />\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("     <div class=\"menu\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li class=\"menuCon1\"><a href=\"#\">Danh mục</a>\n");
      out.write("    <ul class=\"menuCon\">\n");
      out.write("        <li><a href=\"kemtrimun.jsp\">Kem trị mụn</a></li>\n");
      out.write("    <li><a href=\"kemtrangda.jsp\">Kem trắng da</a></li>\n");
      out.write("    <li><a href=\"kemtrinam.jsp\">Kem trị nám</a></li>\n");
      out.write("    <li><a href=\"kemtritham.jsp\">Kem trị thâm</a></li>\n");
      out.write("    <li><a href=\"suatam.jsp\">Sữa tắm</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"../index.jsp\">Trang chủ</a></li>\n");
      out.write("    <li><a href=\"gioithieu.jsp\">Giới thiệu</a></li>\n");
      out.write("    <li><a href=\"sanpham.jsp\">Sản phẩm</a></li>\n");
      out.write("    <li><a href=\"lienhe.jsp\">Liên hệ</a></li>\n");
      out.write("    <li ");
      out.print(servlet.dangnhap.display);
      out.write(" class=\"DN\"><a href=\"dangnhap.jsp\" class=\"DK\">Đăng nhập</a><span class=\"gachngang\"> - </span><a class=\"DK\" href=\"dangki.jsp\">Đăng kí</a></li>\n");
      out.write("    <li class=\"lidn\" style=\"color: chartreuse;");
      out.print(servlet.dangnhap.displayDN);
      out.write('"');
      out.write('>');
      out.print(servlet.dangnhap.userN);
      out.write("\n");
      out.write("        <ul style=\"position: absolute;\">\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../giohang\">Giỏ hàng</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../thongtin\">Thông tin</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"doimatkhau.jsp\">Đổi mật khẩu</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../dangxuat\">Đăng xuất</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <div class=\"phanGiua\">\n");
      out.write("        <div >\n");
      out.write("<br>\n");
      out.write("<form action=\"../dangki\" method=\"post\" class=\"fdangki\">\n");
      out.write("<p align=\"center\" style=\"font-size:36px\">Đăng kí thành viên</p>\n");
      out.write("<table align=\"center\" >\n");
      out.write("<tr>\n");
      out.write("<td width=\"107\" height=\"45\" style=\"text-align:right;\">Tên đăng nhập:</td>\n");
      out.write("<td width=\"288\"><input type=\"text\" name=\"user\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Mật khẩu:</td>\n");
      out.write("<td><input type=\"password\" name=\"pass\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Họ và tên:</td>\n");
      out.write("<td><input type=\"text\" name=\"hoten\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Giới tính:</td>\n");
      out.write("<td><input type=\"radio\" value=\"Nam\" name=\"gt\"/>Nam <input type=\"radio\" value=\"Nu\" name=\"gt\"/>Nữ</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Ngày sinh:</td>\n");
      out.write("<td><input type=\"date\" name=\"ngaysinh\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Số điện thoại:</td>\n");
      out.write("<td><input type=\"number\" name=\"sodt\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Số CMND:</td>\n");
      out.write("<td><input type=\"number\" name=\"socmnd\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\" style=\"text-align:right;\">Email:</td>\n");
      out.write("<td><input type=\"text\" name=\"email\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"45\"></td>\n");
      out.write("<td><input type=\"submit\" value=\"Đăng kí\"> <input type=\"reset\" value=\"Hủy\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div class=\"phanDuoi\">\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<p align=\"center\">Nguyễn quốc cảnh</p>\n");
      out.write("<p align=\"center\">Số ĐT: 0911776579</p>\n");
      out.write("<p align=\"center\">Email: canhnqpd01197@fpt.edu.vn</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
