package _17_binary_file_and_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBinaryFile {
    //Tạo phương thức để đọc dữ liệu sản phẩm vào file dat ngoài
    public static void writeBinaryFile(Product product) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/_17_binary_file_and_serialization/bai_tap/product list.dat"));
            List<Product> myProduct = new ArrayList<>();
            myProduct.add(product);
            outputStream.writeObject(myProduct);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Tạo phương thức để hiển thị(đọc) sản phẩm lên màn hình
    public static List<Product> readBinaryFile() {
        List<Product> productsOut = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(new File("src/_17_binary_file_and_serialization/bai_tap/product list.dat")));
            productsOut = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productsOut;
    }
}
