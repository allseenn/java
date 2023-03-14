import java.util.*;
import java.util.stream.IntStream;

public class Task03 {
    public static void main(String[] args) {
        // 1. Реализовать алгоритм сортировки списков слиянием
        int size = new Random().nextInt(10, 15);
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(0, 20));
        }
        System.out.println("1. Unsorted list: " + list);
        // System.out.println("Sorted list  : "+sorting(list));
        // lst.subList(lst.size()/2, lst.size());

        // 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        list.removeIf(n -> n % 2 == 0);
        System.out.println("2. No  odd  list: " + list);
        // 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        list.sort(null);
        System.out.println("3. Min: " + list.get(0) + ", Max: " + list.get(list.size()-1) + ", Mean: " + mean(list));
        // 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        List<Integer> list1 = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list1.add(new Random().nextInt(0, 20));
        }
        List<Integer> union = new ArrayList<>();
        union.addAll(list1);
        System.out.println("4. First  list: " + list1);
        System.out.println("   Second list: " + list);
        list1.removeAll(list);
        list.removeAll(union);
        list1.addAll(list);
        System.out.println("   United list: " + list1);
        // 5. Создать ArrayList`<Integer>` и добавить нулевым эллементом ноль 10000 раз.
        ArrayList<Integer> zero1 = new ArrayList<>();
        zero1.add(0);
        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            zero1.set(0, 0);
        }
        long end1 = System.currentTimeMillis();
        long result1 = end1 - begin1;
        System.out.println("5. Result in ms: " + result1);
        // 6. Повторить пятый пункт но с LinkedList. 
        LinkedList<Integer> zero2 = new LinkedList<>();
        zero2.add(0);
        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            zero2.set(0, 0);
        }
        long end2 = System.currentTimeMillis();
        long result2 = end2 - begin2;
        System.out.println("6. Result in ms: " + result2);
        // 7. Сравнить время работы пятого и шестого пунктов.
        System.out.println("7. ArrayList faster than LinkedList at ms: " + (result2 - result1));
    }
    static List<Integer> sorting(List<Integer> lst){     
        // List<Integer> list = new List<>(lst.subList(0, lst.size()/2));
        if (lst.size() <= 2){
            return lst.subList(0, lst.size()/2);
        }
        else {
            return sorting(lst.subList(0, lst.size()/2));
        }
    }
    static float mean(List<Integer> lst){
        float summa = 0;
        for (Integer integer : lst) {
            summa += integer;
        }
        return summa / lst.size();
    }
}
