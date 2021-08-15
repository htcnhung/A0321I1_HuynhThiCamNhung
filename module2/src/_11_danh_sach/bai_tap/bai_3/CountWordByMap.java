package _11_danh_sach.bai_tap.bai_3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordByMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ý tự của bạn");
        String yourString = scanner.nextLine().toLowerCase();
        String[] stringArray = yourString.split(" ");
        Map<String, Integer> treeMap = new TreeMap<>();
        int count = 1;
        for (String word : stringArray) {
            if (treeMap.containsKey(word)) {
                treeMap.replace(word, treeMap.get(word) + 1);
            } else {
                treeMap.put(word, count);
            }
        }
        treeMap.forEach((key, value) -> {
            System.out.print("\"" + key + "\" có " + value + " chữ; ");
        });
    }
}
