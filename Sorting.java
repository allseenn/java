import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        List<Integer> odd = new ArrayList<>(List.of(16));
        int size = odd.get(new Random().nextInt(odd.size()));
        //int size = 8 ;
        // List<Integer> list8 = new ArrayList<>(List.of(12, 10, 16, 11, 17, 11, 7, 10));
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(0, 20));
        }
        System.out.println("1. Unsorted list: " + list);
        List<Integer> sorted = sorting(list);
        System.out.println("     Sorted list: " + sorting(list));
        System.out.println("    Bubbled list: " + bubble(sorted));
    }
//start bubble algorithm
    static List<Integer> bubble(List<Integer> lst){
        for (int i = 0; i < lst.size() - 1; i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int temp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, temp);
                }
            }
        }
        return lst;
}
// end bubble algorithm
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
    for (int idx  = lst.size()/4; idx <= lst.size()*6/8; idx++) { // Заплатка, т.к. не нашел причину ошибки сортировки в последнем правом массиве
        for (int i = lst.size()*6/8; i < lst.size(); i++) { // Например выдает иногда типа [2, 4, 6, 7, 7, 9, 10, 13, 13, 15, 15, 14, 16, 17, 16, 18]
            if (lst.get(idx) > lst.get(i)) { // Думаю причина в том, что я не переношу в другой массив а перемещаю все в одном
                int tmp = lst.get(idx);     // Данная заплатка пробегает последнюю четверть листа на сравнение еще раз
                lst.set(idx, lst.get(i)); // Были мыли решить данную проблему с помощью добавления еще одного уровня, но на семинаре отменили данную сортировку :)
                lst.set(i, tmp);  // Получился не доделанный с ограничениями по кратности (работает на 2, 4, 8, 16 элементов) алгоритм. Но, рабочий и без использования другого листа или массива (in-place) и только методами списка.
            } 
        }
    }

    return lst;
}
}
