public class Objects {
    public static void main(String[] args) {
        Object a = 1; 
        a.getClass().getName(); // java.lang.Integer
        Object b = 0.2;
        b.getClass().getName(); // java.lang.Double
        Object c = "hello"; 
        c.getClass().getName(); // java.lang.String
        System.out.println((Double)c + (Double)b);
    }
}