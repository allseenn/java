import java.util.*;

public class S5 {

    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//
//        hashMap.put("Первый", "1");
//        hashMap.put("Второй", "1");
//        hashMap.put("Третий", "1");
//        hashMap.put("Пятый", "1");
//
//        System.out.println(hashMap);
//        hashMap.forEach( (key, v) -> System.out.print(key +"="+ v+", "));
//
//        Set<String> keys = hashMap.keySet();
//        for (String k: keys) {
//            System.out.print(hashMap.get(k)+", ");
//        }
//
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()){
//            String v = hashMap.get(iterator.next());
//            System.out.println(v + ", ");
//            iterator.remove();
//        }
//        System.out.println(hashMap.remove(21));
//
//        for (int i = 0; i < keys.size(); i++) {
//            System.out.print(hashMap.get(keys.toArray()[i])+", ");
//        }
//
//        System.out.println(hashMap);
//        Collection<String> vl = hashMap.values();
//        Set<Map.Entry<String, String>> e = hashMap.entrySet();
//
//        hashMap.getOrDefault(21, "Key is not found");
//        hashMap.containsKey(31);
//        hashMap.replace("Первый", "2");
//        hashMap.compute("3", (k, v)-> v = "1");
//        hashMap.computeIfPresent("3", (k, v)-> v += "1");
//        hashMap.computeIfAbsent("3", v-> "1");
//        hashMap.replaceAll((k, v) -> v += "1");
//
//        System.out.println(hashMap);
//
//        HashMap<String, Text> map = new HashMap<>();
//        map.put("1", new Text("Каждый", "охотник", "vant"));
//        map.put("2", new Text("q", "w", "e"));
//
//        map.get("1").p2 = "";
//
//        System.out.println(map.get("1").p1);
//        System.out.println(map.get("1").p2);
//        map.compute("1", (k, v) -> new Text(v.p1, v.p2+"!", v.p3));
//        System.out.println(map.get("1").p2);
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
//
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put("Первый", "1");
//        treeMap.put("Второй", "1");
//        treeMap.put("Третий", "1");
//        treeMap.put("пятый", "1");
//
//        treeMap.headMap("Второй", true);
//        treeMap.tailMap("Второй", false);
//        System.out.println(treeMap);
//
//        ArrayList<String> age = new ArrayList<>();
//        ArrayList<String> gender = new ArrayList<>();
//        gender.add("a");
//        gender.add("b");
//        gender.add("c");
//        gender.add("d");
//
//        age.add("Первый");
//        age.add("Второй");
//        age.add("Третий");
//        age.add("Пятый");
//        LinkedList<Integer> iD = new LinkedList<>();

        Character c1 = 'ф';
        Integer c2 = 'ф';
        System.out.println(c1.equals(c2));

//        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
//        Integer[] cnt= new Integer[]{0};
//        age.forEach(n -> treeMap1.put(n, cnt[0]++));
//        System.out.println(treeMap1);
//        treeMap1.forEach((k, v) -> iD.add(v));
//        treeMap1.clear();
//        iD.forEach(n -> treeMap1.put(gender.get(n), n));
//        System.out.println(treeMap1);

    }

}

class Text{
    String p1, p2, p3;
    public Text(String p1, String p2, String p3){
        this.p2 = p2;
        this.p1 = p1;
        this.p3 = p3;
    }

}