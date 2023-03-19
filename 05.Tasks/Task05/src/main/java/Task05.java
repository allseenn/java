// Rostislav Romashin GB-4992
import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<>(createPhoneBook());
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Выбирите действие введя цифру меню и Enter:\n" +
                            "1. Посмотреть несортированную тел. книгу\n" +
                            "2. Посмотреть популярные имена и счетчик\n" +
                            "3. Посмотреть популярные номера и звонки\n" +
                            "0. Завершить программы и выйти в консоль");
        do
        {
            System.out.printf( "1. records, 2. names, 3. calls,  0. quit : "); // menu
            String[] user = input.nextLine().split(" ");
            if (user[0].equals("1")) {      // print phonebook
                phoneBook.forEach((k, v) -> System.out.println(k + " " + v));
            }
            else if (user[0].equals("0")) {
                quit = true;
            }
            else if (user[0].equals("2")) { // sort names
                TreeMap<String, Integer> popName = new TreeMap<>(names(phoneBook));
                popName.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
            }
            else if (user[0].equals("3")) { // sort calls
                ArrayList<String> parsed = new ArrayList<>(parse(phoneBook));
                parsed.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
            }
            else {
                System.out.println("Ввод не соответствует образцу!");
            }
        }
        while(!quit);
    }
    public static ArrayList<String> parse(TreeMap<String, ArrayList<String>> phonebook){
        ArrayList<String> phones = new ArrayList<>();
        Set<Map.Entry<String, ArrayList<String>>> entries = phonebook.entrySet();
        Iterator<Map.Entry<String, ArrayList<String>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<String>> entry = iterator.next();
            String string0 = "";
            String string1;
            for (int i = 0; i < entry.getValue().size(); i++) {
          ;
                if (i % 2 == 0) {
                    string0 = entry.getValue().get(i).toString();
                }
                else {
                    string1 = entry.getValue().get(i).toString();
                    phones.add(string1 + " " + string0 + " " + entry.getKey().toString());
                }

            }

        }
        return phones;
    }
    public static TreeMap<String, ArrayList<String>> createPhoneBook() {
        TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<>();
        phoneBook.put("Иван Иванов", new ArrayList<>(phones()));
        phoneBook.put("Светлана Петрова", new ArrayList<>(phones()));
        phoneBook.put("Кристина Белова", new ArrayList<>(phones()));
        phoneBook.put("Анна Мусина", new ArrayList<>(phones()));
        phoneBook.put("Анна Крутова", new ArrayList<>(phones()));
        phoneBook.put("Иван Юрин", new ArrayList<>(phones()));
        phoneBook.put("Петр Лыков", new ArrayList<>(phones()));
        phoneBook.put("Павел Чернов", new ArrayList<>(phones()));
        phoneBook.put("Петр Чернышов", new ArrayList<>(phones()));
        phoneBook.put("Мария Федорова", new ArrayList<>(phones()));
        phoneBook.put("Марина Светлова", new ArrayList<>(phones()));
        phoneBook.put("Мария Савина", new ArrayList<>(phones()));
        phoneBook.put("Мария Рыкова", new ArrayList<>(phones()));
        phoneBook.put("Марина Лугова", new ArrayList<>(phones()));
        phoneBook.put("Анна Владимирова", new ArrayList<>(phones()));
        phoneBook.put("Иван Мечников", new ArrayList<>(phones()));
        phoneBook.put("Петр Петин", new ArrayList<>(phones()));
        phoneBook.put("Иван Ежов", new ArrayList<>(phones()));
        return phoneBook;
    }
    public static ArrayList<String> phones(){
        Random random = new Random();
        int items = random.nextInt(1,5);
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            numbers.add(phone());
            numbers.add(rate());
        }
        return numbers;
    }
    public static String phone() {
        Random random = new Random();
        String[] prefixes = {"(495)", "(499)", "(916)", "(915)", "(985)", "(903)", "(905)", "(965)", "(999)", "(925)", "(926)", "(498)", "(901)"};
        String prefix = prefixes[random.nextInt(prefixes.length)];
        int firstPart = random.nextInt(900) + 100;
        int secondPart = random.nextInt(90) + 10;
        int thirdPart = random.nextInt(90) + 10;
        String phoneNumber = "+7" + prefix + firstPart + "-" + secondPart + "-" + thirdPart;
        return phoneNumber;
    }
    public static String rate(){
        Random random = new Random();
        return String.format("%03d", random.nextInt(999));
    }
    public static TreeMap<String, Integer> names(TreeMap<String, ArrayList<String>> phoneBook) {
        TreeMap<String, Integer> firstNamesWithCount = new TreeMap<>();
        for (String fullName : phoneBook.keySet()) {
            String firstName = fullName.split(" ")[0];
            if (firstNamesWithCount.containsKey(firstName)) {
                firstNamesWithCount.put(firstName, firstNamesWithCount.get(firstName) + 1);
            }
            else {
                firstNamesWithCount.put(firstName, 1);
            }
        }
        return firstNamesWithCount;
    }
}