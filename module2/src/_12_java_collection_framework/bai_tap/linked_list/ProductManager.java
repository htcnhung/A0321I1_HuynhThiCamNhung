package _12_java_collection_framework.bai_tap.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> linkedList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
    }

    //Thêm sản phẩm
    public void addProduct() {
        Product product = new Product();
        System.out.println("Nhập ID sản phẩm: ");
        product.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        product.setName(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        product.setPrice(scanner.nextInt());
        linkedList.add(product);
        System.out.println("Bạn đã thêm sản phẩm thành công");
        displayProduct();
    }

    //Sửa sản phẩm
    public void editProduct() {
        if (linkedList.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {
            displayListID();
            boolean check = false;
            System.out.println("Nhập ID muốn sửa");
            int idEdit = scanner.nextInt();
            scanner.nextLine();
            for (Product id : linkedList) {
                if (id.getId() == idEdit) {
                    System.out.println("Tên sản phẩm muốn sửa: " + id.getName());
                    System.out.println("Nhập tên muốn sửa: ");
                    id.setName(scanner.nextLine());
                    check = true;
                    break;
                }
                check = false;
            }
            if (!check) {
                System.out.println("ID sản phẩm bạn muốn tìm không tồn tại, vui lòng nhập lại! ");
                editProduct();
            } else {
                System.out.println("Đã sửa thành công");
            }
        }
        displayMenu();
    }

    //Xóa sản phẩm
    public void deleteProduct() {
        boolean check = false;
        if (linkedList.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            displayListID();
            System.out.println("Nhập ID sản phẩm mà bạn muốn xóa!");
            int idDelete = scanner.nextInt();
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).getId() == idDelete) {
                    linkedList.remove(i);
                    check = true;
                    break;
                }
                check = false;
            }
            if (!check) {
                System.out.println("ID bạn muốn xóa không tồn tại, vui lòng nhập lại!");
                deleteProduct();
            } else {
                System.out.println("Đã xóa thành công!");
            }
        }
        displayMenu();
    }

    //Hiển thị sản phẩm
    public void displayProduct() {
        if (linkedList.isEmpty()) {
            System.out.println("Danh sách trống, vui lòng thêm một sản phẩm");
            addProduct();
        } else {
            displayListID();
            System.out.println("Nhập ID sản phẩm bạn muốn kiểm tra!");
            int idProduct = scanner.nextInt();
            boolean check = false;
            for (Product product : linkedList) {
                if (product.getId() == idProduct) {
                    System.out.println(product);
                    check = true;
                    break;
                }
                check = false;
            }
            if (!check) {
                System.out.println("ID bạn nhập không đúng, vui lòng thử lại");
                displayProduct();
            }
        }
        displayMenu();
    }

    //Tìm kiếm sản phẩm
    public void searchProduct() {
        if (linkedList.isEmpty()) {
            System.out.println("Danh sách trống, hãy thêm một sản phẩm!");
            addProduct();
        } else {
            System.out.println("Nhập tên sản phẩm bạn muốn tìm!");
            String searchProduct = scanner.nextLine();
            for (Product productName : linkedList) {
                if (productName.getName().equals(searchProduct)) {
                    System.out.println(productName);
                    break;
                } else {
                    System.out.println("Không tìm thấy sản phẩm");
                }
            }
        }
        displayMenu();
    }

    //Hiển thị list ID sản phẩm
    public void displayListID() {
        System.out.println("Danh sách các ID sản phẩm:");
        for (Product id : linkedList) {
            System.out.println(id.getId());
        }
    }

    //Sắp xếp theo thứ tự từ giá cao đến thấp
    public void sortHightToLow() {
        linkedList.sort(new PriceComparator());
        System.out.println(linkedList);
        displayMenu();
    }

    //Sắp xếp theo thứ tự từ giá thấp đến giá cao
    public void sortLowToHight() {
        linkedList.sort(new PriceComparator());
        Collections.reverse(linkedList);
        System.out.println(linkedList);
        displayMenu();
    }

    //Hiển thị menu tùy chọn
    public void displayMenu() {
        System.out.println("1. Display Product");
        System.out.println("2. Add new Product");
        System.out.println("3. Edit Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Search Product");
        System.out.println("6. Exit");
        System.out.println("7. Sort price of product from hight to low");
        System.out.println("8. Sort price of product from low to hight");
        System.out.println("Nhập 1 số: ");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1:
                displayProduct();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                editProduct();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:
                searchProduct();
                break;
            case 6:
                break;
            case 7:
                sortHightToLow();
                break;
            case 8:
                sortLowToHight();
                break;
            default:
                System.out.println("Vui lòng nhập đúng số");
                displayMenu();
                break;
        }
    }
}
