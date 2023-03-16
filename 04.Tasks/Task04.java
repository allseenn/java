import java.util.*;
public class Task04 {
    public static void main(String[] args) {
        LinkedList<Integer> id = new LinkedList<>();
        LinkedList<String> lname = new LinkedList<>();
        LinkedList<String> fname = new LinkedList<>();
        LinkedList<String> mname = new LinkedList<>();
        LinkedList<Integer> age = new LinkedList<>();
        LinkedList<Boolean> sex = new LinkedList<>();
        System.out.println("Образец  заполнения: Фамилия Имя Отчество 38 муж");
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        do
        { 
                System.out.printf("Закончить - 2 enter: ");
                String[] user = input.nextLine().split(" ");
                if (user.length == 5) {
                id.add(id.size());
                lname.add(user[0]);
                fname.add(user[1]);
                mname.add(user[2]);
                age.add(Integer.valueOf(user[3]));
                Boolean gen = (user[4].equals("male") || user[4].equals("М") || user[4].equals("муж")
                || user[4].equals("Муж") || user[4].equals("M") || user[4].equals("M")
                || user[4].equals("мужчина") || user[4].equals("Мужчина"))? true: false;
                sex.add(gen);

                }
                else if (user.length != 5) {
                    quit = true;
                } else {
                    // Выводим на печать сообщение об ошибке
                    System.out.println("Неверный формат ввода");
                }
            
        }
        while(!quit);

        for (Integer idx : id) {
            System.out.println(id.indexOf(idx) + lname.indexOf(idx) + fname.indexOf(idx) + mname.indexOf(idx) + age.indexOf(idx) + sex.indexOf(idx));       
        }
    }
       
}