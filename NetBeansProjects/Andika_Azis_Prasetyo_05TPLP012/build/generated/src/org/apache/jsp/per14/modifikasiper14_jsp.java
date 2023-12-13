package org.apache.jsp.per14;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class modifikasiper14_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"cssper14.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Data Mahasiswa Unpam</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 Connection connection = null;
        Statement statement = null;
        ResultSet rs=null;
        try {
            String connectionURL = "jdbc:mysql://localhost/unpamjavaweb";
            String username ="root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, username, password);
            statement =connection.createStatement();
            String query = "SELECT * FROM mahasiswa";
            rs = statement.executeQuery(query);
                String topMenu="<nav><ul>"
                        + "<li><a href=modifikasiper14.jsp>Home</a></li>"
                        + "<li><a href=tambah.jsp>Tambah Data Mahasiswa</a>"
                        + "</li>"
                        + "</ul>"
                        + "</nav>"; 

         
      out.write("       \n");
      out.write("    <center>\n");
      out.write("        <table width=\"80%\" bgcolor=\"#eeeeee\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" align=\"center\">\n");
      out.write("                    <br>\n");
      out.write("                    <h2 colspan=\"4\" align=\"center\">\n");
      out.write("                        Data Mahasiswa </h2>\n");
      out.write("                     <h1 colspan=\"4\" align=\"center\">\n");
      out.write("                        UNIVERSITAS PAMULANG</h1>\n");
      out.write("                    <h4 clospan=\"4\" align=\"center\">\n");
      out.write("                        Jl.Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten</h4>\n");
      out.write("                    ");
      out.print(topMenu);
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                                <tr colspan=\"5\" align=\"center\">\n");
      out.write("                <th colspan=\"1\" align=\"center\">NIM</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Nama</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Alamat</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Program Studi</th>\n");
      out.write("                <th colspan=\"1\" algin=\"center\">Aksi</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while (rs.next()){ 
      out.write("\n");
      out.write("            <tr colspan=\"5\" align=\"center\">\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getInt("nim"));
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getString("nama")); 
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getString("alamat"));
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getString("prodi"));
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\"><a href=\"edit.jsp?nim=");
out.println(rs.getInt("nim"));
      out.write("\">Edit</a></td>\n");
      out.write("                 <td colspan=\"1\" align=\"center\"><a href=\"delete.jsp?nim=");
out.println(rs.getInt("nim"));
      out.write("\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                rs.close();
                statement.close();
                connection.close();
                } catch (Exception e) {
                     System.err.println("GAGALKONEKSI" + e.getMessage());
                     out.println("GAGAL" + e.getMessage());
                }

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" align=\"center\" bgcolor=\"#eeeeff\">\n");
      out.write("                    <small>\n");
      out.write("                        Copyright &copy; 2022 Universitas Pamulang<br>\n");
      out.write("                        Jl. Surya kencana No. 1 Pamulang, Tangerang Selatan, Banten<br>\n");
      out.write("                    </small>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
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
