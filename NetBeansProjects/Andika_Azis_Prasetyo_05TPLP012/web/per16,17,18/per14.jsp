<%-- 
    Document   : per14
    Created on : Nov 29, 2023, 11:41:58 AM
    Author     : Andika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Koneksi </title>
    </head>
    <body>
        <%@page import="java.sql.*"%>
       <% Connection connection = null;
       Statement statement = null;
       ResultSet rs=null;
       try {
            String connectionURL = "jdbc:mysql://localhost/unpamjavaweb";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            connection =DriverManager.getConnection(connectionURL, username, password);
            
            statement = connection.createStatement();
            String qurey = "SELECT * FROM mahasiswa";
            rs = statement.executeQuery(qurey);
            
            String menu="<br><b>Master Data</b><br>"
                    + "<a href=HitungNilai>Mahasiswa</a><br>"
                    + "<a href=MataKuliahController>Mata Kuliah</a><br><br>"
                    + "<b>Transaksi</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<b>Laporan</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<a href=LoginController>Login</a><br><br>";
            String userName="";
            
                if (!session.isNew())
                {
                    try {
                        userName = session.getAttribute("userName").toString();
                    } catch(Exception ex){}
                    
                    
                    try {
                        menu = session.getAttribute("menu").toString();
                    } catch(Exception ex){}
                    
                }
                
                
                    try {
                        menu = session.getAttribute("menu").toString();
                    } catch(Exception ex){}
                

       
        %>
    <center>
        <table width="80%" bgcolor="#eeeeee">
            <tr>
                <td colspan="4" align="center">
                    <br>
                    <h2 colspan="4" align="center">
                        Data Mahasiswa</h2>
                    <h1 colspan="4" align="center">
                        UNIVERSITAS PAMULANG</h1>
                    <h4 colspan="4" align="center">
                        Jl.Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten</h4>
                    <br>    
                </td>
            </tr>
            <br>
            <tr colspan="4" align="center">
                <th colspan="1" align="center">NIM</th>
                <th colspan="1" align="center">Nama</th>
                <th colspan="1" align="center">Alamat</th>
                <th colspan="2" align="center">Program Studi</th>
            </tr>
            <% while (rs.next()){ %>
            <tr colspan="4" align="center">
                <td colspan="1" align="center"><%out.println(rs.getInt("nim"));%></td>
                <td colspan="1" align="center"><%out.println(rs.getString("nama")); %></td>
                <td colspan="1" align="center"><%out.println(rs.getString("alamat"));%></td>
                <td colspan="1" align="center"><%out.println(rs.getString("prodi"));%></td>
            </tr>
            <% } %>
            
            <%
                rs.close();
                statement.close();
                connection.close();
                } catch (Exception e) {
                     System.err.println("GAGALKONEKSI" + e.getMessage());
                     out.println("GAGAL" + e.getMessage());
                }

            %>
            <tr>
                <td colspan="4" align="center" bgcolor="#eeeeff">
                    <small>
                        Copyright &copy; 2022 Universitas Pamulang<br>
                        Jl. Surya kencana No. 1 Pamulang, Tangerang Selatan, Banten<br>
                    </small>
                </td>
            </tr>
        </table>
    </center>
    </body>
</html>
