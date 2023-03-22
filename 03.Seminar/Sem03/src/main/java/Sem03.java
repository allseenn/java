import java.util.*;

public class Sem03 {
    public static void main(String[] args) {
        Object[] i; // массив объектов
        ArrayList list  = new ArrayList(); // по умолчанию нет ограничения по типам
        // В списке массивов лежат ссылки на объекты которые лежат в куче
        // по умолчанию создается список массивов равный 10 элементов
        list.add(4);
        list.add(8);
        list.add(12);
        list.add("Hello"); // link to object with Hello
        list.add(false);
        list.add(.5f);
        list.add('d');
        list.remove(0); // del by index - 4
        if(list.get(1) instanceof String) ((String) list.get(1)).toUpperCase();
        // если елем 1 является экземплямром класса стник, тогда (привожу к классу Стринг)
        /// поэтому придумали <> брилиантик или дженерик, ниже аналагичная штука как сверху
        ArrayList<String> lists = new ArrayList<>(20); // мы себя ограничиваем только стрингами, размером 10 элементов
        // ArrayList<int> - не можем
        // ArrayList<Integer> - можем
        list.size(); // показывает занятый размер массива, т.к. по умолчанию 10 элементов, как показать 6?
        list.add(list.size()/2, "Table"); // воткнуть "Стол" в центр списка
        list.add(6, "Стол"); // так подвинет, но не затрет 66, добавить с индексом можно только в пределах размера массива
        list.set(5, "Стул"); // Так затрет 5 элемент
        ArrayList<String> copy = new ArrayList<>(list); // новый список скопирован в copy
        copy.addAll(list); // аналагично верхнему
        // copylink = list; // ссылка на список
        copy.clear(); // пробегает по списку и записывает null
        list.forEach(n -> System.out.println(n+",")); //  заменяет цикл. что сделать с элементом -> (лямбда)
        list.toArray(); // в массив - из массива в список через цикл
        Collections.sort(list);
        ArrayList<Integer> numbers  = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(3);
        numbers.add(2);
        numbers.sort(new Comparator<Integer>() { // сортировка требует компоратор, который сортирует по функции ниже
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; // если наоборот, поставить o2 - o1, то будет сортировка в обратном порядке
            }
        });
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            num1.add(new Random().nextInt(5));
            num2.add(new Random().nextInt(5));
        }
        System.out.printf(num1);
        System.out.printf(num2);
        num1.retainAll(num2); // пересечение множеств
        num1.removeAll(num2); // удалить все эелементы из второго массива
        System.out.println(num1);
        System.out.println(num2);

        list.forEach(n -> System.out.println(n)); // нельзя изменить элементы

        // c пмощью итератора можно удалять - номер индекса не указываем
        Iterator<Integer> iterator = num1.iterator();
                while(iterator.hasNext()) {
                    iterator.remove();
                }
        // с помощью этого можно перемещаться вперед и назад по массиву
        ListIterator<Integer> iterator1 = list.listIterator(list.size());
                while (iterator1.hasPrevious()){
                    int n = iterator1.previous();
                    System.out.println(n);
                }

        // LinkedList: у него есть узел в котором хранится 4 значения: собственное значение, его хэш, хэш следующего узла и предыдущего узла
        // hash это внутреннии имена объектов - 4 байта
        // Так же он называется двухсвязный список
        //Но он занимает в четыре раза больше чем ArrayList
        // Мы не можем просто взять 3, можно взять 1 элемент а потом следующий и так далее, либо последний и предыдущий
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.get(2);
        list1.getFirst();
        // Эго плюс когда вставляете новый элемент он сам указывает на следующий и предыдущий элементы, он быстрее когда удалять или вставлять элементы
        // ArrayList список на основе массива . LinkedList это связный список отдельных объектов

        // перечеслитель - перебор элементов с помощью for
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }


    }
}
