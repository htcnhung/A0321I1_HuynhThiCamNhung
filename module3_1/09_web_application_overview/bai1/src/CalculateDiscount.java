import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscount", urlPatterns = "/calculate")
public class CalculateDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        double  listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double  discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        double  discountAmount = listPrice * discountPercent/100;
        double  discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + productDescription + "</h1>");
        writer.println("<h1>List Price: " + listPrice + "VND" + "</h1>");
        writer.println("<h1>Discount Percent: " + discountPercent + "%" + "</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount + "VND" + "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice + "VND" + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
