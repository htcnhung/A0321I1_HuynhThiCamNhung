package _12_java_collection_framework.thuc_hanh.bai_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Nhung", 25);
        hashmap.put("Tom", 30);
        hashmap.put("Bun", 26);
        hashmap.put("Smith", 27);
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap + "\n");

        //Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        //Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        //Tham số truyền vào có ý nghĩa gì?
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Cook is " + linkedHashMap.get("Cook"));
    }
}
