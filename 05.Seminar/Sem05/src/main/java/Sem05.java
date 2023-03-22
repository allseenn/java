import javax.naming.ldap.HasControls;
import java.awt.font.ShapeGraphicAttribute;
import java.util.*;

public class Sem05 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(); // У мапа нет индекса - в нем лежит hash, key, val, next
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, String.valueOf(i));
            hashMap.put(i, String.valueOf(i)+"!"); // если ключ есть то заменит значение
            hashMap.putIfAbsent(i, String.valueOf(i)+"!"); // если ключ есть то ничего не положит
        }
        System.out.println(hashMap);
        hashMap.forEach((k, v) -> System.out.println(k + v)); // поэтому в лямбде 2 значения
        // что бы менять элементы, то делаем:
        Set<Integer> keys = hashMap.keySet(); // ключи уникальные во множество
        // аналог индекса:
        for (Integer k: keys
             ) {
            System.out.println(hashMap.get(k));
        }
        Iterator<Integer> iterator = hashMap.keySet().iterator(); // итератор это объект
        while(iterator.hasNext()){
            String v = hashMap.get(iterator.next()); // итератор собирает ссылки на элементы и в случае некст перебирает их
            System.out.println(v + ", ");
            iterator.remove(); // удаляет все
        }
        hashMap.remove(5); // удалит элемент с ключом 5 - полностью объект hash key val next
        Collection<String> v = hashMap.values(); // все значения в коллекцию - можно использовать

        for (int i = 0; i < keys.size; i++) {
            System.out.println(hashMap.get(keys.toArray()[i])); // список ключей в массив - более сложный вариант перебора

        }

        Set<Map.Entry<Integer, String>> e = hashMap.entrySet(); // сохраняем и ключ и значение, например потом в файл
        hashMap.getOrDefault(21, "Key not found"); // Получить или написать ошибку
        hashMap.containsKey(31); // если ключ такой есть, то вернет тру
        hashMap.replace(1, "2"); // аналог пута
        //hashMap.putAll(); // копирование одного мапа в другой
        hashMap.compute(3, (k, va) -> va += "!"); // тут мы можем изменять значения хешмапа, проще форича
        hashMap.compute(3, (k, va) -> String.valueOf(k)); // Замена ключа
        hashMap.compute(3,  (k, va) -> va += "!" );
        hashMap.computeIfPresent(3, (k, va) -> va += "!" ); // если существует ключ то делает
        hashMap.computeIfAbsent(3, va -> "1" ); // делает только если нету
        hashMap.merge(5, "?", (k, vl) -> k+v);
        // hashMap.put("first", "1"); // не гарантирует порядок со строками, целые числа гарантирует
        LinkedHashMap<Integer, String[]> linkedHashMap = new LinkedHashMap<>(); // расширение HashMap, который сохраняет порядок введеных элементов
        linkedHashMap.put(1, new String[]{"Каждый", "Охотник"});
        TreeMap<String, String> treeMap = new TreeMap<>(); // Сортирует ключи - сам. Следите за регистром, т.к. Сначала большие потом маленькие
        treeMap.put("Первый", "1");
        treeMap.put("Второй", "2");
        treeMap.headMap("Второй", true); // типа,срезов
        treeMap.tailMap("Первый", false);
        // по дз5:
        ArrayList<String> age = new ArrayList<>();
        age.add("Первый");
        age.add("Второй");
        age.add("Третий");
        ArrayList<String> gen = new ArrayList<>();
        gen.add("m");
        gen.add("f");
        gen.add("m");
        LinkedList<Integer> id = new LinkedList<>();
        id.add(1);
        id.add(2);
        id.add(3);
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        Integer[] count = new Integer[]{0};
        age.forEach(n -> treeMap1.put(n, count[0]++));
        System.out.printf(treeMap1.toString());
        treeMap1.forEach((k, ve) -> id.add(ve)); // всто отсортированное добавляем в id
        treeMap1.clear(); // чистка
        id.forEach(n -> treeMap1.put(gen.get(n), n)); //  положил значения! из списка пол - т.е. будут значения имеющие двойную сортировку


    }
}
