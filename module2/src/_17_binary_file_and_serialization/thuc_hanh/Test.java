package _17_binary_file_and_serialization.thuc_hanh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        //try chỗ này có ý nghĩa gì? Vì sao ở trên đã né ngoại lệ bằng throws mà ở dưới vẫn dùng try?
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("country.csv"));
        ) {
            output.writeUTF("Tom");
            output.writeDouble(86.3);
            output.writeObject(new java.util.Date());
        }


    }
}
