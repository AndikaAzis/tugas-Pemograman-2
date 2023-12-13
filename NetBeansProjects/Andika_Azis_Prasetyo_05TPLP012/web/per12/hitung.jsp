<%-- 
    Document   : index14
    Created on : Nov 15, 2023, 11:04:26 AM
    Author     : Andika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menghitung Harga</title>
    </head>
    <body>
        <h2>Form Memasukkan Nilai</h2>
<form action="HitungHarga" method="post">
<table>
    <tr>
        <td>Nama Barang</td>
        <td><input type="text" name="namaBarang"></td>
    </tr>
    <tr>
        <td>Harga Satuan</td>
        <td><input type="text" name="hargaSatuan"</td>
    </tr>
    <tr>
        <td>Jumlah</td>
        <td><input type="text" name="jumlah"></td>
    </tr>
    <tr>
        <td colepan="2">Diakon diberikan sebesar 5% jika jumlah >= 100</td>
    </tr>
    <tr>
        <td colapan="2">dan total harga sebelum diakon >= 1000000</td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value = "Hitung" </td>
    </tr>
</table>
</form>
</body>
</html>
