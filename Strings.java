public class Strings {
  public static void main(String[] args) {
    String str1 = "      Hello World      "; //      Hello World    
    String str2 = "world"; // world  
    str1 = str1.trim(); //Hello World      
    str1 = str1.substring(6); // World
    str1 = str1.toLowerCase(); // world
    str1 = str1.toUpperCase(); // WORLD
    str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase(); // World
    str1.compareTo(str2); // -32
    str1.equals(str2); // false
    str1.equalsIgnoreCase(str2); // true
    str1.regionMatches(1, "or", 0, 2); // true
    char[] name = {'S', 'l', 'a', 'v', 'a'}; // Slava
    String[] surname = {"R", "o", "m", "a", "s", "h", "i", "n"};
    String.join("", surname); // Romashin
    str1.concat(str2); // Worldworld
    System.out.println();
  }
}
