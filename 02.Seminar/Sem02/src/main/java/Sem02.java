public class Sem02 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str);
        str += "!";
        System.out.println(str);
        StringBuilder string = new StringBuilder("Hello Vasia!");
        string.append(5);
        System.out.println(string);
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            str += Character.getName(i);
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - begin);
//
//        long begin2 = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            string.append(Character.getName(i));
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println(end2 - begin2);
        System.out.println(str.toLowerCase());
        System.out.println("_*".repeat(10));
        System.out.println(str.contains("N")); // содержит ли строка №
        System.out.println(str.equals("N")); //равна ли страка №
        System.out.println(str == "N"); // так делать не правильно, он сравнивает типы, а типа объектов всегда разные
        str = "Hello World!"
        System.out.println(str.replace("l", "p")); //все эти методы саму строку не меняют, строка на выводе потом удаляется из памяти
        System.out.println(str.replaceFirst("l", "p")); // первое вхождение l на p
        System.out.println(str.regionMatches()); // типа срезы
        System.out.println(str.charAt(0)); // возвращает по индексу буквы в строке
        String[] strings = str.split(""); //разбить строку по делителю и запихнем в массив в случае пробела " "
        string.replace(0, 1, "F") // указываем начало и конец и указываем что туда воткнуть, но в билдере он сложнее чем в сроке
        str.getChars(); // сложнее реплейся
        str.getBytes(); // тк. в строказ нет разворота, то можно его пользовать, но сложно
        string.reverse(); // развернет билдер и сразу изменения запишет
        string.insert(4, "inserted"); // вставить в билдере по 4 индексу строку inserted
        string.deleteCharAt(6); // удалить по индексу конкретную букву
        string.indexOf("W"); // передает индекс найденой строки, которая в параметре
        str = new StringBuilder(str).reverse().toString(); // развернуть строку через анонимный билдер, который удалится, а строка останется
        

        String a = "d";
        String f = "d";

        // System.nanoTime();
    }
}
