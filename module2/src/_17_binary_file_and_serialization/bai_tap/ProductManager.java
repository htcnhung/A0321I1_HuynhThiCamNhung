package _17_binary_file_and_serialization.bai_tap;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

    //Tạo menu hệ thống chung
    public void productManager() {
        System.out.println("System menu: \n" +
                "1. Add new product\n" +
                "2. Display Product list \n" +
                "3. Search Product");
        switch (scanner.nextInt()) {
            case 1:
                addNewProduct();
                productManager();
                break;
            case 2:
                displayProductList();
                productManager();
                break;
            case 3:
                searchProduct();
                productManager();
                break;
            default:
                System.out.println("Số bạn nhập không hợp lệ, vui lòng nhập lại!");
                productManager();
                break;
        }
    }

    //Phương thức thêm sản phẩm vào file dat
    public void addNewProduct() {
        Product product = new Product();
        System.out.println("Nhập ID của sản phẩm: ");
        product.setIdProduct(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        product.setNameProduct(scanner.nextLine());
        System.out.println("Nhập tên nhà sản xuất: ");
        product.setMaker(scanner.nextLine());
        System.out.println("Nhập giá của sản phẩm: ");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập mô tả của sản phẩm: \n" +
                "Màu sắc, kích thước, phiên bản 1,2,...");
        product.setProductDescription(scanner.nextLine());
        ReadWriteBinaryFile.writeBinaryFile(product);
        System.out.println("Đã thêm sản phẩm thành công");

    }

    //Phương thức hiển thị list sản phẩm lên màn hình
    public void displayProductList() {
        List<Product> productList = ReadWriteBinaryFile.readBinaryFile();
        System.out.println("fsfsfsfs" + productList.size());
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    //Phương thức tìm kiếm sản phẩm
    public void searchProduct() {
        List<Product> myProductList = ReadWriteBinaryFile.readBinaryFile();
        boolean check = false;
        displayProductList();
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        if (myProductList.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng, vui lòng thêm một sản phẩm");
            addNewProduct();
        } else {
            for (Product products : myProductList) {
                if (scanner.nextLine().equals(products.getNameProduct())) {
                    System.out.println(products.toString());
                }
                check = true;
                break;
            }
            if (check) {
                productManager();
            } else {
                System.out.println("Không tìm thấy tên sản phẩm, vui lòng thử lại!");
                searchProduct();
            }
        }
    }
}
