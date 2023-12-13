package org.apache.jsp.per14;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.swing.*;

public final class tambah_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"cssper14\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                ");

                   String topmenu="<nav><ul>"
                           + "<li><a href=modifikasiper14.jsp>Home</a></li>"
                           + "<li><a href=tambah.jsp>Tambah Data Mahasiswa</a></li>"
                           + "</li>"
                           + "</ul>"
                           + "</nav>";
                   String nim=request.getParameter("nim");
                   String nama=request.getParameter("nama");
                   String alamat=request.getParameter("alamat");
                   String prodi=request.getParameter("prodi");
                   String URL = "jdbc:mysql://localhost/unpamjavaweb";
                   Connection conn = null;
                   PreparedStatement ps= null;
                   Class.forName("com.mtsql.jdbc.Driver").newInstance();
                   int updateQuery=0;
                   if (nim!=null && nama !=null && alamat!=null && prodi!=null){
                       try{
                           conn=DriverManager.getConnection (URL, "root", "");
                           String query = "INSERT INTO mahasiswa (nim, nama, alamat, prodi) VALUES (?,?,?,?)"; ps = conn.prepareStatement (query);
                           ps.setString(1, nim);
                           ps.setString(2, nama);
                           ps.setString(3, alamat);
                           ps.setString(4, prodi);
                           updateQuery=ps.executeUpdate();
                           if (updateQuery!=0) {
                               JOptionPane.showMessageDialog(null, "Berhasil Tambah Data Mahasiswa");
                               response.sendRedirect("modifikasiper14.jsp");
                           } 
                       } catch (Exception e) {
                           response.sendRedirect("modifikasiper14.jsp");
                       } finally {
                           ps.close();
                           conn.close();
                       }
                       }
                       
      out.write("\n");
      out.write("      <center>\n");
      out.write("        <table width=\"80%\" bgcolor=\"#eeeeee\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" align=\"center\">\n");
      out.write("                    <br>\n");
      out.write("                    <h2 clspan=\"4\" align=\"center\">\n");
      out.write("                        Data Mahasiswa</h2>\n");
      out.write("                    <h1 colspan=\"4\" align=\"center\">\n");
      out.write("                        UNIVERSITAS PAMULANG</h1>\n");
      out.write("                    <h4 clospan=\"4\" align=\"center\">\n");
      out.write("                        Jl.Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten</h4>\n");
      out.write("                    ");
      out.print(topmenu);
      out.write("\n");
      out.write("                    </center>\n");
      out.write("                    <br>\n");
      out.write("                    <from colspan=\"4\" align=\"center\" action=\"\" method=\"POST\">\n");
      out.write("                        <label>NIM :</label> <input type=\"text\" name=\"nim\" /> <br/>\n");
      out.write("                        <label>Nama Mahasiswa :</label> <input type=\"text\" name=\"nama\" /> <br/>\n");
      out.write("                        <label>Alamat:</label> <input type=\"text\" name=\"alamat\"/> <br/>\n");
      out.write("                        <label>Program Studi:</label>\n");
      out.write("                        <select id=\"prodi\" name=\"prodi\">\n");
      out.write("                            <option value=\"Teknik Informatika\">Teknik Informatika </option><option value=\"Sistem Informasi\">Sistem Informasi</option>\n");
      out.write("                            <option value=\"Akuntansi\">Akuntansi</option><option value=\"Manajemen\">Manajemen</option>\n");
      out.write("                        </select><br/>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"submit\" value=\"Simpan\"/>\n");
      out.write("                        <button href=\"modifikasiper14.jsp\">Kembali</button><br><br>\n");
      out.write("                    </from>\n");
      out.write("                    <center>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"4\" align=\"center\" bgcolor=\"#eeeeff\">\n");
      out.write("                                <small>\n");
      out.write("                                     Copyright &copy; 2022 Universitas Pamulang<br>\n");
      out.write("                                     Jl. Surya kencana No. 1 Pamulang, Tangerang Selatan, Banten<br>\n");
      out.write("                                </small>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </center>            \n");
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
