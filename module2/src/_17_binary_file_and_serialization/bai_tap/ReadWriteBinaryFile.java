package _17_binary_file_and_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBinaryFile {
    //Tạo phương thức để đọc dữ liệu sản phẩm vào file dat ngoài
    public static void writeBinaryFile(Product product) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream( new File("src/_17_binary_file_and_serialization/bai_tap/product_list.dat"), true )) ;
            List<Product> myProducts = new ArrayList<>();
            myProducts.add(product);
            outputStream.writeObject(myProducts);
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
                    new FileInputStream(new File("src/_17_binary_file_and_serialization/bai_tap/product_list.dat")));
            productsOut = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productsOut;
    }
}
