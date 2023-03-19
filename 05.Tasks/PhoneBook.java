import java.util.*;

public class PhoneBook {

    // A method to create a sample phone book
    public static HashMap<String, ArrayList<String>> createPhoneBook() {
        // Create a new HashMap of String and ArrayList of String
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        // Add some sample entries
        phoneBook.put("Иван Иванов", new ArrayList<>(Arrays.asList("123456789", "987654321")));
        phoneBook.put("Светлана Петрова", new ArrayList<>(Arrays.asList("111111111")));
        phoneBook.put("Кристина Белова", new ArrayList<>(Arrays.asList("222222222")));
        phoneBook.put("Анна Мусина", new ArrayList<>(Arrays.asList("333333333")));
        phoneBook.put("Анна Крутова", new ArrayList<>(Arrays.asList("444444444")));
        phoneBook.put("Иван Юрин", new ArrayList<>(Arrays.asList("555555555")));
        phoneBook.put("Петр Лыков", new ArrayList<>(Arrays.asList("666666666")));
        phoneBook.put("Павел Чернов", new ArrayList<>(Arrays.asList("777777777")));
        phoneBook.put("Петр Чернышов", new ArrayList<>(Arrays.asList("888888888")));
        phoneBook.put("Мария Федорова", new ArrayList<>(Arrays.asList("999999999")));
        phoneBook.put("Марина Светлова", new ArrayList<>(Arrays.asList(
                "1010101010",
                "2020202020"
                )));
        phoneBook.put(
                "Мария Савина",
                new ArrayList<>(
                        Arrays.asList(
                                "3030303030",
                                "4040404040",
                                "5050505050"
                                )));
        phoneBook.put(
                "Мария Рыкова",
                new ArrayList<>(
                        Arrays.asList(
                                "6060606060",
                                "7070707070"
                                )));
                                phoneBook.put("Марина Лугова", new ArrayList<>(Arrays.asList("8080808080")));
        phoneBook.put("Анна Владимирова", new ArrayList<>(Arrays.asList("9090909090")));
        phoneBook.put("Иван Мечников", new ArrayList<>(Arrays.asList(
                "1112223333",
                "4445556666",
                "7778889999"
                )));
        phoneBook.put("Петр Петин", new ArrayList<>(Arrays.asList("1212121212")));
        phoneBook.put("Иван Ежов", new ArrayList<>(Arrays.asList(
                "1313131313",
                "1414141414"
                )));

        // Return the phone book
        return phoneBook;
    }

    // A method to find and print the repeating names with their counts
    public static void printRepeatingNames(HashMap<String, ArrayList<String>> phoneBook) {
        // Create a new HashMap of String and Integer
        HashMap<String, Integer> nameFrequency = new HashMap<>();

        // Iterate over the keys of the phone book
        for (String name : phoneBook.keySet()) {
            // Get the value (list of phone numbers) for each key (name)
            ArrayList<String> phones = phoneBook.get(name);
            // Check if the list has more than one element
            if (phones.size() > 1) {
                // Add or update the name and its frequency in the nameFrequency map
                nameFrequency.put(name, phones.size());
            }
        }

        // Sort the nameFrequency map by value in descending order using a custom comparator
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameFrequency.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // Compare the values in reverse order
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Print the sorted list of repeating names and their counts
        System.out.println("Повторяющиеся имена с количеством повторений:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Create a sample phone book
        HashMap<String, ArrayList<String>> phoneBook = createPhoneBook();

        // Find and print the repeating names with their counts
        printRepeatingNames(phoneBook);
    }
}
