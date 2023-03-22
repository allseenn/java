import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        //1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        System.out.printf("Введите строку цифр: ");
        String firstString = new Scanner(System.in).nextLine();
        System.out.printf("Еще строку цифр: ");
        String secondString = new Scanner(System.in).nextLine();
        System.out.println("1. " + firstString.contains(secondString));
        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        System.out.println("2. " + firstString.equals(new StringBuilder(secondString).reverse().toString()));
        // 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println("3. reverse firstString: "+ reverse(firstString));
        System.out.println("  reverse secondString: "+ reverse(secondString));
        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //  3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        String string41 = new StringBuilder(firstString).append(" + ").append(secondString).append(" = ").append(Integer.parseInt(firstString) + Integer.parseInt(secondString)).toString();
        System.out.println("4. " + string41);
        String string42 = new StringBuilder(firstString).append(" - ").append(secondString).append(" = ").append(Integer.parseInt(firstString) - Integer.parseInt(secondString)).toString();
        System.out.println("   " + string42);
        String string43 = new StringBuilder(firstString).append(" + ").append(secondString).append(" = ").append(Integer.parseInt(firstString) * Integer.parseInt(secondString)).toString();
        System.out.println("   " + string43);
        //5. Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println("5. " + new StringBuilder(string41).deleteCharAt(string41.indexOf("=")).insert(string41.indexOf("="), "равно"));
        System.out.println("   " + new StringBuilder(string42).deleteCharAt(string41.indexOf("=")).insert(string42.indexOf("="), "равно"));
        System.out.println("   " + new StringBuilder(string43).deleteCharAt(string41.indexOf("=")).insert(string43.indexOf("="), "равно"));
        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println("6. " + new StringBuilder(string41).replace(string41.indexOf("="),  string41.indexOf("=")+1,"равно"));
        System.out.println("   " + new StringBuilder(string42).replace(string41.indexOf("="),  string42.indexOf("=")+1,"равно"));
        System.out.println("   " + new StringBuilder(string43).replace(string41.indexOf("="),  string43.indexOf("=")+1,"равно"));
        // 7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        String testString = string41.repeat(10000);
        long begin = System.currentTimeMillis();
        String endSting = testString.replace("=", "равно");
        long end = System.currentTimeMillis();
        System.out.printf("7. String.Replace(): ");
        System.out.println(end - begin);

        StringBuilder buildStr = new StringBuilder(testString);
        long begin2 = System.currentTimeMillis();
        int index = buildStr.indexOf("=");
        while (index != -1) {
                buildStr.replace(index, index + 1, "равно");
                index = buildStr.indexOf("=", index+1);
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("   Builder.replace(): ");
        System.out.println(end2 - begin2);

    }
        static String reverse(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }
}
