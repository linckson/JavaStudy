package collection.collectionhomework;

import java.util.*;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-10 9:21
 */
public class Test1 {
    //1. 使用List和Map存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社;使用商品编号作为Map中的key。
    public static void main(String[] args) {
        Map<String, Object> row1 = new HashMap<>();
        row1.put("编号", "101");
        row1.put("名称", "Java核心技术卷一");
        row1.put("单价", "98");
        row1.put("出版社", "未知");


        Map<String, Object> row2 = new HashMap<>();
        row2.put("编号", "102");
        row2.put("名称", "Java核心技术卷一");
        row2.put("单价", "98");
        row2.put("出版社", "未知");
        Map<String, Object> row3 = new HashMap<>();
        row3.put("编号", "103");
        row3.put("名称", "Java核心技术卷一");
        row3.put("单价", "98");
        row3.put("出版社", "未知");

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);
        list.add(row3);


        for (Map<String, Object> row : list) {
            Set<String> keySet = row.keySet();
            for (String key : keySet) {
                System.out.print(key + "=" + row.get(key) + " ");
            }
            System.out.println();
        }
    }
}
