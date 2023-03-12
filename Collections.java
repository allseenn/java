import java.util.ArrayList;
import java.util.List;
public class Collections {
    public static void main(String[] args) {
        ArrayList list0 = new ArrayList(); // Объявили сырой тип
        list0.add(2809); // [2809]
        list0.add("3333"); // [2809, 3333]
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // Обобщенный тип, способ записи № 1
        list1.add(3088); // [3088]
        ArrayList<Integer> list2 = new ArrayList<>(); // Обобщенный тип, способ записи № 2
        ArrayList<Integer> list3 = new ArrayList<Integer>(10); // Обобщенный тип, способ записи № 3
        ArrayList<Integer> list4 = new ArrayList<Integer>(list3); // Обобщенный тип, способ записи № 4
        list2.add(223); // 223
        list2.add(555); // 555
        list2.add(223); // 223
        list2.get(0); // 223
        list2.indexOf(555); // 1
        list2.lastIndexOf(223); // 2
        list2.set(2, 777); // 223
        list2.remove(2); // 777
        list2.subList(0, 2); // [223, 555]
        list2.sort(null);
        List<Integer> list = List.of(1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]
        List.copyOf(list); // [1, 2, 3, 4, 5]
        list.toArray(); // [Ljava.lang.Object;@2cbb3d47
        list.toString(); // [1, 2, 3, 4, 5]
        list.contains(5); // true
        System.out.println( ); 
    }
}