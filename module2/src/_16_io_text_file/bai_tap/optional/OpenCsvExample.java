package _16_io_text_file.bai_tap.optional;

import java.io.*;
import java.util.Arrays;

public class OpenCsvExample {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(new File("src/_16_io_text_file/bai_tap/optional/country.csv")));
            String line;
            String[] strArr;
            while ((line = bufferedReader.readLine()) != null){
                strArr = line.split(",");
                System.out.println(Arrays.toString(strArr));
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
