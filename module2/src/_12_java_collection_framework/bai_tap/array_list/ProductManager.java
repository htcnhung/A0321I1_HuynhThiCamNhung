package _12_java_collection_framework.bai_tap.array_list;

import java.util.*;

public class ProductManager {
    List<Product> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

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
        arrayList.add(product);
        System.out.println("Bạn đã thêm sản phẩm thành công");
        displayProduct();
    }

    //Sửa thông tin sản phẩm
    public void editProduct() {
        if (arrayList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống, vui lòng thêm một sản phẩm");
            displayMenu();
        } else {
            displayProduct();
            boolean check = false;
            System.out.println("Nhập ID sản phẩm muốn chỉnh sửa: ");
            int idEdit = scanner.nextInt();
            scanner.nextLine();
            for (Product array : arrayList) {
                if (array.getId() == idEdit) {
                    System.out.println("Sản phẩm bạn muốn sửa có Tên là: '" + array.getName() + ", giá là: " + array.getPrice());
                    System.out.println("Nhập tên bạn muốn sửa: ");
                    array.setName(scanner.nextLine());
                    check = true;
                    break;
                }
                if (!check) {
                    System.out.println("ID sản phẩm bạn vừa nhập không tồn tại, vui lòng nhập lại! ");
                    editProduct();
                } else {
                    System.out.println("Bạn đã sửa thành công!");
                }
            }
            displayProduct();
        }

    }

    //Xóa sản phẩm
    public void deleteProduct() {
        boolean check = false;
        if (arrayList.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {
            displayListId();
            System.out.println("Nhập ID sản phẩm bạn muốn xóa");
            int idDelete = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getId() == idDelete) {
                    arrayList.remove(i);
                    check = true;
                    break;
                }
                check = false;
            }
            if (!check) {

                deleteProduct();
            } else {
                System.out.println("Bạn đã xóa thành công");
            }
        }
        displayMenu();
    }

    //Tìm kiểm sản phẩm
    public void searchProduct() {
        if (arrayList.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            System.out.println("Nhập tên sản phẩm muốn tìm");
            String searchName = scanner.nextLine();
            for (Product name : arrayList) {
                if (name.getName().equals(searchName)) {
                    System.out.println(name);
                    break;
                } else {
                    System.out.println("Sản phẩm không tồn tại");
                    searchProduct();
                }
            }
        }
        displayMenu();
    }

    //Hiển thị sản phẩm
    public void displayProduct() {
        if (arrayList.isEmpty()) {
            System.out.println("Danh sánh rỗng, hãy thêm một sản phẩm mới!");
        } else {
            displayListId();
            System.out.println("Nhập ID sản phẩm bạn muốn xem thông tin: ");
            int idProduct = scanner.nextInt();
            boolean check = false;
            for (Product product : arrayList) {
                if (product.getId() == idProduct) {
                    System.out.println(product);
                    check = true;
                    break;
                }
                check = false;
            }
            if (!check) {
                System.out.println("ID bạn vừa nhập không có trong danh sách, vui lòng thử lại!");
                displayProduct();
            }
        }
        displayMenu();
    }

    //Sắp xếp từ giá cao đến thấp
    public void sortHightToLow() {
        arrayList.sort(new PriceComparator());
        System.out.println(arrayList);
        displayMenu();
    }

    //Sắp xếp từ giá thấp đến giá cao
    public void sortLowToHight() {
        arrayList.sort(new PriceComparator());
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        displayMenu();
    }

    //Hiển thị list ID
    public void displayListId() {
        System.out.println("Danh sách ID sản phẩm");
        for (Product id : arrayList) {
            System.out.println(id.getId());
        }
    }

    //Hiển thị Menu các tùy chọn
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
            case 2:
                addProduct();
            case 3:
                editProduct();
            case 4:
                deleteProduct();
            case 5:
                searchProduct();
            case 6:
                break;
            case 7:
                sortHightToLow();
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
