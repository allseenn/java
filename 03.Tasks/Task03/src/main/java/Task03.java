import java.util.ArrayList;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        // 1. Реализовать алгоритм сортировки списков слиянием
        int size = new Random().nextInt(10, 15);
        ArrayList<Integer> list = new ArrayList<>(size);
        
        System.out.println(list);
    }
}
