// Ромашин Ростислав группа 4992
import java.util.*;
import java.util.stream.IntStream;

public class Task03 {
    public static void main(String[] args) {
        // 1. Реализовать алгоритм сортировки списков слиянием
        int size = 8;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(0, 30));
        }
        System.out.println("1. Unsorted list: " + list);
        System.out.println("   Sorted list  : " + sorting(list));
        // 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        list.removeIf(n -> n % 2 == 0);
        System.out.println("2. No  odd  list: " + list);
        // 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        list.sort(null);
        System.out.println("3. Min: " + list.get(0) + ", Max: " + list.get(list.size()-1) + ", Mean: " + mean(list));
        // 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        List<Integer> list1 = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list1.add(new Random().nextInt(0, 40));
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
    static float mean(List<Integer> lst){
        float summa = 0;
        for (Integer integer : lst) {
            summa += integer;
        }
        return summa / lst.size();
    }
    // Решил написать собственный алгоритм, сортировки слиянием, но на 4 семинаре поменяли задание на компоратор,
    // Поэтому выкладываю (отправляю) как есть, с ограничениями и недоработками
    // Идея была создать алгоритм слияния и только методами Листа, не используя второстепенных листов и массивов
    // Лист абстрактно разбивается на части до 2 элементов, на этом уровне (№1) происходит сравнивание и перестановка элементов
    // На более высоких уровнях происходит сравнивание частей большей величины 4, 8 и т.д.
    // Столкнулся со сложностями, не успел до конца понять:
    // 1. Можно создавать только списки длинной степени 2 - (2, 8, 16, 32 и т.д.)
    // 2. На последнем уровне (этапе) сортировки когда все части гарантированно отсортированны,
    // происходит сортировка двух последних частей (половинок) списка, так вот правая половина, сортируется не всегда!?!
    // Думаю это связано с тем, что я не переношу в другой массив элементы, а перемещаю их ин-плейсе.
    static List<Integer> sorting(List<Integer> lst){
        int levels = (int)(Math.log(lst.size())/Math.log(2)); // количество уровней
        for (int level = 1; level <= levels; level++) {  // на основе уровня будет длина шаг (массивов)
            int steps = (int)(Math.pow(2, level)); // step равен log2(N)
            for (int step = 0; step < lst.size(); step += steps) {  // ход в один шаг
                for (int idx  = step; idx <= step+steps/2; idx++) { // пробег в пол шага
                    for (int i = step+steps/2; i < step+steps; i++) { // сравнение со второй половиной шага
                        if (lst.get(idx) > lst.get(i)) {
                            int tmp = lst.get(idx);
                            lst.set(idx, lst.get(i));
                            lst.set(i, tmp);
                        }
                    }
                }
            }
        }
        return lst;
    }
}
