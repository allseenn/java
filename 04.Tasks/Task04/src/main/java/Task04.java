import java.util.*;
public class Task04 {
    public static void main(String[] args) {
        LinkedList<Integer> id = new LinkedList<>();
        LinkedList<String> lname = new LinkedList<>();
        LinkedList<String> fname = new LinkedList<>();
        LinkedList<String> mname = new LinkedList<>();
        LinkedList<Integer> age = new LinkedList<>();
        LinkedList<Boolean> sex = new LinkedList<>();
        System.out.println("Образец заполнения через пробел: Фамилия Имя Отчество 38 муж");
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        do
        {
                System.out.printf(" q(uit), p(rint), s(ort) or add: "); // menu
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
                else if (user[0].equals("q")) {
                    quit = true;
                }
                else if (user[0].equals("p")) { // print data
                    for (Integer idx : id) {
                       // System.out.printf("%d ",id.get(idx));
                        System.out.printf("%s ", lname.get(idx));
                        System.out.printf("%s ", fname.get(idx));
                        System.out.printf("%s ", mname.get(idx));
                        System.out.printf("%d ", age.get(idx));
                        String gender = (sex.get(idx).equals(true))?"Мужчина":"Женщина";
                        System.out.printf("%s%n", gender);
                    }
                    System.out.println("Найдено " + id.size() + " зап.");
                }
                else if (user[0].equals("s")) { // sort data
                    int count = 0;
                    for (Integer s: bubble(age))
                    {
                        if(sex.get(age.indexOf(s)).equals(false)) {
                            id.set(count, age.indexOf(s));
                            count++;
                        }
                    }
                    for (Integer s: bubble(age))
                    {
                        if(sex.get(age.indexOf(s)).equals(true)) {
                            id.set(count, age.indexOf(s));
                            count++;
                        }
                    }
                    System.out.println("Данные отсортированны, нажмите p");
                }
                else {
                    System.out.println("Ввод не соответствует образцу!");
                }
            
        }
        while(!quit);
    }
    static LinkedList<Integer> bubble(LinkedList<Integer> list){ // bubble algo
        LinkedList<Integer> lst = new LinkedList<>();
        lst.addAll(list);
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

}