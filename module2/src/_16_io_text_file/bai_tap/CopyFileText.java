package _16_io_text_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            //Đọc file từ source file là testfile.txt
            File inFile = new File("src/_16_io_text_file/bai_tap/testfile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            //Ghi (copy) file từ tệp nguồn sang tệp đích là testcopyfile.txt
            FileWriter fileWriter = new FileWriter("src/_16_io_text_file/bai_tap/testcopyfile.txt");
            while ((line = reader.readLine()) != null) {
                fileWriter.write(line);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Thông báo đã copy file thành công
        System.out.println("Đã copy tệp nguồn về tệp đích thành công!");
    }
}
