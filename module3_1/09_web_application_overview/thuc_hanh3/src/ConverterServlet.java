import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "</h1>");
        writer.println("<h1>USD: " + usd + "</h1>");
        writer.println("<h1>VND: " + vnd + "</h1>");
        writer.println("</html>");

//        Giải thích mã lệnh trên:
//
//        request.getParameter("rate"): lấy về giá trị của tham số "rate" trong trường input text. Chuyển giá trị này sang số thực và gán vào biển rate
//
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        request.getParameter("usd"): lấy về giá trị của tham số "usd" trong trường input text. Chuyển giá trị này sang số thực và gán vào biển usd
//
//        float usd = Float.parseFloat(request.getParameter("usd"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
