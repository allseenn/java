//// ИЕРАРХИЯ КОЛЛЕКЦИИ (COLLECTION) //////////////
import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class Collections {
    public static void main(String[] args) {
/////////////////// LIST //////////////////////////
// Интерфейс List – (список) гибкая структура данных, позволяющая легко менять свой размер.
// Пользователь этого интерфейса имеет точный контроль над тем, 
// где в списке вставляется каждый элемент.Пользователь может обращаться к элементам по их целочисленному 
// индексу (позиции в списке) и искать элементы в списке.

    // Класс ArrayList - «Удобный массив». 
        ArrayList list0 = new ArrayList(); // Объявили сырой тип
        // list0.add(2809); // [2809] - make Warning about Raw type
        // list0.add("3333"); // [2809, 3333] - make Warning about Raw type
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // Обобщенный тип, способ инициализации списка № 1
        list1.add(3088); // [3088]
        list1.add(3333); // [3088, 3333]
        // Разные способы создания ArrayList:
        ArrayList<Integer> list2 = new ArrayList<>(); // Обобщенный тип, способ инициализации записи № 2
        ArrayList<Integer> list3 = new ArrayList<Integer>(10); // Обобщенный тип, способ инициализации записи № 3
        ArrayList<Integer> list4 = new ArrayList<Integer>(list1); // Обобщенный тип, способ записи инициализации № 4
        list2.add(223); // [223] - добавить 223
        list2.add(555); // [223, 555] - добавить 555
        list2.add(223); // [223, 555, 223] - добавить 223
        list2.get(0); // 223 - значение индекса 0
        list2.indexOf(555); // 1 - номер индекса имеющего значение 555
        list2.lastIndexOf(223); // 2 - номер последнего индекс
        list2.set(2, 777); // 223
        list2.remove(2); // 777
        list2.subList(0, 2); // [223, 555]
        list2.sort(null); // внутри функция компаратор, может быть лямбдой
        list2.sort((a, b) -> b-a); // [555, 223] - обратная сортировка
        list0 = list2; // ссылка на список, т.к. list0 будет меняться вместе с list2
        list0.clone(); // возвращает (для копирования) структуру листа
        list0 = new ArrayList<>(list1); // [3088, 3333] - Полное копирование структуры и значений из list1 в list0
        list1.clear(); // [] - очистка всего списка
        list4.add(111); // [3088, 3333, 111]
        list4.retainAll(list0); // [3088, 3333] - оставить только те элементы list4, которые есть в list0
        list3.add(3333); // [3333]
        list4.removeAll(list3); // [3088] - удаления в list4 всех значений list3 

    // Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место  Enumeration в Java Collections Framework. 
    // Итераторы отличаются от перечислений двумя способами:
    // Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.
    // hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
    // c помощью итератора можно удалять - номер индекса не указываем
        Iterator<Integer> iterator2 = list2.iterator();
        while(iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove(); 
        }
        // System.out.println(list2); // [] - empty list
        // При создании списка с помощью метода List.of - создается неизменяемый (immutable) объект
        // при итерации такого объекта удалять элементы .remove() не получится - будет ошибка

    // Интерфейс List
        List<Integer> list = List.of(1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]
        List.copyOf(list); // [1, 2, 3, 4, 5]
        Object[] ara = list.toArray(); // список в массив объектов
        Arrays.asList(ara); // массив в список
        list.toString(); // [1, 2, 3, 4, 5] - конвертация в строку
        list.contains(5); // true - возвращает true если есть значение 5 в списке
        // с помощью итератора можно перемещаться вперед и назад по списку
        ListIterator<Integer> iterator = list.listIterator(list.size()); // 5
                while (iterator.hasPrevious()){                          // 4
                    int n = iterator.previous();                         // 3   
                //  System.out.println(n);                               // 2
                }                                                        // 1

    // Класс LinkedList - Представляет собой двусвязный список. у него есть узел в котором хранится 4 значения: 
    //собственное значение, его хэш, хэш следующего узла и предыдущего узла
    // hash это внутреннии имена объектов - 4 байта, по этим причинам, он занимает в четыре раза больше места чем ArrayList
    // Мы не можем просто взять 3-й элемент, можно взять 1-й элемент а потом следующий и так далее, либо последний и предыдущий
    // LinkedList нужен для небольшого количества элементов, в которых операции добавления\удаления встречаются чаще операций чтения.
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4); // [4]
        ll.add(5); // [4, 5]
        ll.get(1); // 5
        ll.getFirst(); // 4
///////////// QUEUE ///////////////////////////////////
// Интерфейс Queue - FIFO
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1); // [1]
        queue.add(2); // [1, 2]
        queue.add(3); // [1, 2, 3]
        queue.add(4); // [1, 2, 3, 4]
        queue.offer(5); // [1, 2, 3, 4, 5] - добавляет элемент в конец очереди, в отличии от add не выдаст исключение, когда первоначальная очередь закончилась
        queue.remove(); // 1 - удаляет и возвращает первый элемент, вернет исключение если элементов не осталось
        queue.poll(); // 2 - удаляет и возвращает первый элемент, не возвращает исключение если элементов не осталось
        
    // Интерфейс Deque (дека) - double queue
    // Позволяет производить операция с обоих концов очереди
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2); // [1, 2]
        deque.removeLast(); deque.removeLast(); // 1 2 - ошибка если, элементов нет
        deque.offerFirst(1); deque.offerLast(2); // [1, 2]
        deque.pollFirst(); deque.pollLast(); // 1 2 - возвращает null если элементов нет
        deque.offerFirst(3); deque.offerLast(4); // [3, 4]
        deque.getFirst(); deque.getLast(); // 3 4 - возвращает, но не удаляет значения в деке, выдаст ошибку, если нет элементов
        deque.peekFirst(); deque.peekLast(); // 3 4 - возвращает, но не удаляет значения в деке, вернет null, если нет элементов
/////////// VECTOR ////////////////////////    
    // Класс Stack, расширение класса Vector. Stack представляет собой обработку данных по принципу LIFO.
    // Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        stack.pop(); // 123
        stack.pop(); // 12
        stack.pop(); // 1
////////////////// MAP /////////////////////
// Интерфейс Map
// Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>. У мапа нет индекса - в нем лежит hash, key, val, next.
// В Map элементы располагаются как угодно и могут менять свое положение.
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается
// ● допускаются только уникальные ключи, значения могут повторяться;
// ● помните про null значения*;
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается.
// Способы объявления Map:
        Map<Integer,String> map1 = new HashMap<>(); // По умолчанию создается 16 ячеек, при заполнении 50% добавляется еще 16 ячеек 
        Map<Integer,String> map2 = new HashMap<>(9); // Форсированно создаем мап с 9 ячейками и добавляем 9 при заполнении 50%
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f); // вторая переменная указывает 1.0, т.к. 100% заполнить прежде чем добавить новые ячейки.
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); // {1=один}
        db.put(2, "два"); // {1=один, 2=два}
        db.put(3, "три"); // 1=один, 2=два, 3=три}
        db.put(31, "три один"); // {1=один, 2=два, 3=три, 31=три один}
        db.put(13, "один три"); // {1=один, 2=два, 3=три, 13=один три, 31=три один}
        db.put(null, "!null"); // {null=!null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
        db.put(null, null); // {null=null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
    // Класс HasTable
    // «Устаревший брат» коллекции HashMap, который не знает про null
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один"); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException

    //  Класс HashMap 
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one"); // {1=one}
        hashMap.putIfAbsent(2, "two"); // {1=one, 2=two}
        hashMap.put(3, "three"); // {1=one, 2=two, 3=three}
        hashMap.put(4, "four"); // {1=one, 2=two, 3=three, 4=four}
        hashMap.get(2); // two
        hashMap.remove(2); // {1=one} - returns 2 and remove it key and value
        hashMap.containsValue(2); // false
        hashMap.containsKey(1); // true
        hashMap.keySet(); // [1, 3, 4]
        hashMap.values(); // [one, three, four] – возвращает набор значений
        hashMap.entrySet(); // [1=one, 3=three, 4=four] - returns all keys and their values
        hashMap.getOrDefault(21, "Key not found"); // Получить или написать "Key not found"
        hashMap.replace(1, "2"); // аналог пута
        hashMap.putAll(db);
        // hashMap.forEach((k, v) -> System.out.println(k + v)); // принт all key+value
        hashMap.compute(3, (k, va) -> va += "!"); // тут мы можем изменять значения хешмапа, проще форича
        hashMap.compute(3, (k, va) -> String.valueOf(k)); // Замена ключа
        hashMap.compute(3,  (k, va) -> va += "!" );
        hashMap.computeIfPresent(3, (k, va) -> va += "!" ); // если существует ключ то делает
        hashMap.computeIfAbsent(3, va -> "1" ); // делает только если нету
        // hashMap.merge(5, "?", (k, vl) -> k+v);
        Set<Integer> keys = hashMap.keySet(); // передать номера уникальных ключей  во множество
        Iterator<Integer> iterator3 = hashMap.keySet().iterator(); // итератор это объект
        while(iterator3.hasNext()){
            String v = hashMap.get(iterator3.next()); // итератор собирает ссылки на элементы и в случае некст перебирает их
           // System.out.printf("%s, ", v ); // null, один, два, 3!!, four, один три, три один, 
            iterator3.remove(); // удаляет все
        }
    // Класс TreeMap
    // В основе данной коллекции лежат красно-чёрные деревья. Позволяют быстрее искать, 
    // но могут возникнуть «заминки» при добавлении.
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); // {1=один}
        tMap.put(6,"шесть"); // {1=один, 6=шесть}
        tMap.put(4,"четыре"); // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        tMap.descendingKeySet(); // [6, 4, 3, 2, 1]
        tMap.descendingMap(); // {6=шесть, 4=четыре, 3=три, 2=два, 1=один}
        tMap.headMap(2); // {1=один}
        tMap.tailMap(5); // {6=шесть}
        tMap.firstEntry(); // 1=один
        tMap.lastEntry(); // 6=шесть
        tMap.headMap(2, true); // {1=один, 2=два} типа,срезов
        tMap.tailMap(3, false); // {4=четыре, 6=шесть}
        System.out.println(); //

    // Класс LinkedHashMap
    // «Старший брат» коллекции HashMap, который все помнит…
    // Помнит порядок добавления элементов ➜ более медлительный
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один"); //
        linkmap.put(1, "два"); // 
        linkmap.put(2, "один"); //  {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один"); //
        map.put(2, "два"); //
        map.put(1, "один"); //  {1=один, 2=два, 11=один один}
    
    }
}