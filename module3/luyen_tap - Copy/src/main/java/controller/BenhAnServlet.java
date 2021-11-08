package controller;

import bean.BenhAn;
import bean.BenhNhan;
import repository.BenhNhanRepository;
import service.BenhAnServiceImpl;
import service.BenhNhanServiceImpl;
import service.impl.BenhAnService;
import service.impl.BenhNhanService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhAnServlet", urlPatterns = "/benhans")
public class BenhAnServlet extends HttpServlet {
    private BenhNhanService benhNhanService;
    private BenhAnService benhAnService;
    private BenhNhanRepository benhNhanRepository;

    public void init() {
        benhAnService = new BenhAnServiceImpl();
        benhNhanService = new BenhNhanServiceImpl();
        benhNhanRepository = new BenhNhanRepository();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            case "edit":
                editBenhAn(request, response);
                break;
        }
    }

    private void editBenhAn(HttpServletRequest request, HttpServletResponse response) {
        String idBenhAn = request.getParameter("idBenhAn");
        BenhNhan idBenhNhan = benhNhanService.selectBenhNhanById(request.getParameter("idBenhNhan"));

        BenhNhan tenBenhNhan = benhNhanService.selectBenhNhanById(request.getParameter("idBenhNhan"));

        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");

        BenhAn benhAn = new BenhAn(idBenhAn, idBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);

        try {
            benhAnService.updateBenhAn(benhAn);
            benhNhanRepository.updateBenhNhan(tenBenhNhan);
            response.sendRedirect("/benhans");


        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                delete(request, response);
            default:
                listBenhAn(request, response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        try {
            if (!benhAnService.deleteBenhAn(id)) {
                List<BenhAn> benhAns = benhAnService.selectAllBenhAn();
                request.setAttribute("benhAns", benhAns);
                RequestDispatcher dispatcher = request.getRequestDispatcher("admin/benhan/list.jsp");
                dispatcher.forward(request, response);
            } else {
                response.sendRedirect("/benhans");
            }

        } catch (ServletException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        String id = (request.getParameter("id"));
        BenhAn benhAn = benhAnService.selectBenhAn1(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/benhan/edit.jsp");
        request.setAttribute("benhAn", benhAn);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listBenhAn(HttpServletRequest request, HttpServletResponse response) {
        List<BenhAn> benhAns = benhAnService.selectAllBenhAn();
        request.setAttribute("benhAns", benhAns);
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/benhan/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
