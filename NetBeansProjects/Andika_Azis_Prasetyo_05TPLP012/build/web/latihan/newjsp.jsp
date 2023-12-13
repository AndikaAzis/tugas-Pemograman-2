<%-- 
    Document   : per13
    Created on : Nov 22, 2023, 10:54:04 AM
    Author     : Andika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='newcs.css' rel='stylesheet' type='text/css'
        <title>Informasi Nilai Mahasiswa</title>
    </head>
    <body bgcolor="#808080">
<%  
            String menu="<br><b>Master Data</b></br>"
                    + "<a href=.>Mahasiswa</a><br><br>"
                    + "<a href=.>Mata Kuliah</a><br><br>"
                    + "<b>Transaksi</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<b>Laporan</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<a href=LoginController>Login</a><br><br>";
            String topMenu="<nav><ul>"
                    + "<li><a href=.>Home</a></li>"
                    + "<li><a href=#>Master Data </a>"
                    + "<ul>"
                    + "<li><a href=.>Mahasiswa</a></li>"
                    + "<li><a href=.>Mata Kuliah</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Transaksi</a>"
                    + "<ul>"
                    + "<li><a href=.>Nilai</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Laporan</a>"
                    + "<ul>"
                    + "<li><a href=.>Nilai</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=LoginController>Login</a></li>"
                    + "</ul>"
                    + "</nav";
            
            String konten="<br><h1>Selamat Datang</h1>";
            String userName="";
            
            if(!session.isNew()){
                try {
                    userName = session.getAttribute("userName").toString();
                } catch (Exception  ex){}
                
                if(!((userName==null) || userName.equals(""))){
                    konten += "<h2>"+userName+"<h2>";
                    
                
                try {
                    menu = session.getAttribute("menu").toString();
                } catch (Exception ex){}
                
                try {
                    topMenu = session.getAttribute("topMenu").toString();
                } catch(Exception ex){}
                
                }
            }
            %>

<center>
    <table width="80%" bgcolor="#eeeeee">
        <tr>
            <td colspan="2" align="center">
                <br>
                <h2 Style="margin-bottom:0px; margin-top:0px;">
                    Informasi Nilai Mahasiswa
                </h2>
                <h1 Style="margin-bottom:0px; margin-top:0px;">
                    UNIVERSITAS PAMULANG
                </h1>
                <h4 Style="margin-bottom:0px; margin-top:0px;">
                    JL. Surya Kencana No. 1 Pamulanq, tangerang selatan, Banten
                </h4>
                   <br>
               </td>
        </tr>
        <tr height="400">
            <td width="200" align="center" valign="top" bgcolor="#eeffee">
                <br>
                    <div id='menu'>
                        <%=menu %>
                    </div>
                    </td>
                    <td align="center" valign="top" bgcolor="#ffffff">
                        <%=topMenu %>
                    <br>
                        <%=konten %>
                    </td>
               </tr>
                <tr>
                    <td colspan="2" align="center" bgcolor="#eeeeff">
                        <small>
                            Copyright &copy; 2016 Universitas Pamulang<br>
                            Jl. Surye Kencana No. 1 Pamulang, Tangerang Selatan, Banten<br>
                        </small>
                    </td>
                </tr>
            </table>
        </center>
    </body>
</html>