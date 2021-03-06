<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/11/2021
  Time: 12:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Management Application</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
    <style>
        body {
            background-image: url("../assert/images/background.jpg");
            background-size: cover;
        }
        td {
            color: white;
        }
        #tableCustomer_info {
            color: white;
        }
    </style>
</head>
<body onload="myFunction('${message}')">

<div class="container" style="text-align: center">
    <h1>Benh An Management</h1>
</div>
<div class="container">
    <div style="float: left; margin-left: 10px">
        <a class="btn btn-primary" href="/admin">Back To Home</a><br/>
    </div>
    <table id="tableCustomer" class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>Ma benh an</th>
            <th>Ma benh nhan</th>
            <th>Ten benh nhan</th>
            <th>Ngay nhap vien</th>
            <th>Ngay ra vien</th>
            <th>Ly do nhap vien</th>
            <th>Tac vu</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="benhAn" items="${benhAns}">
            <tr>
                <td><c:out value="${benhAn.getIdBenhAn()}"/></td>
                <td><c:out value="${benhAn.getIdbenhNhan().getIdBenhNhan()}"/></td>
                <td><c:out value="${benhAn.getTenBenhNhan().getTenBenhNhan()}"/></td>
                <td><c:out value="${benhAn.getNgayNhapVien()}"/></td>
                <td><c:out value="${benhAn.getNgayRaVien()}"/></td>
                <td><c:out value="${benhAn.getLyDoNhapVien()}"/></td>
                <td style="text-align: center">
                    <a style="color: white" class="btn btn-warning"
                       href="/benhans?action=edit&id=${benhAn.getIdBenhAn()}">Edit</a>
                    <a style="color: white" class="btn btn-danger"
                       href="#" onclick="benhAnSetId('${benhAn.getIdBenhAn()}')"
                       data-toggle="modal" data-target="#deleteModal">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="deleteEmployee" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="deleteEmployee">Xoa benh an?</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="text" id="modelId" size="50" disabled style="border: none;background: white">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-danger" onclick="submitDelete()">Delete</button>
            </div>
        </div>
    </div>
</div>

<form action="/benhans" id="delCustomer">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" id="idCustomer">
</form>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip', // hidden ?? search
            "lengthChange": false, //show entries
            "pageLength": 5 //S???? row ???? m????i trang
        })
    })
</script>
<script type="text/javascript">
    function myFunction(message) {
        if(message) {
            $('#addNew').modal('show');
        }
    }
</script>
<script>
    function submitDelete() {
        document.getElementById("delCustomer").submit();
    }
    function benhAnSetId(id) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("modelId").value = "Ban co muon xoa benh an nay: " + id;
    }
</script>
</body>
</html>
