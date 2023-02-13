package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Map<Integer,String> hashMap = new HashMap<>() ;
//        hashMap.put(1,"Tấn3");
//        hashMap.put(2,"Tấn2");
//        hashMap.put(3,"Tấn1");
//        hashMap.put(4,"Tấn4");
//        for(Map.Entry entry : hashMap.entrySet()){
//            System.out.println(entry.getValue());
//        }
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Tan",65);
        treeMap.put("Nam",28);
        treeMap.put("Nu",5);
        treeMap.put("Ba",32);
        treeMap.put("Kieu",91);
        for(Map.Entry entry : treeMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
