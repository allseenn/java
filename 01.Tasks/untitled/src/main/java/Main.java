import java.util.Random;

public class Main {
    int i; //32
    long l; //64
    byte b; //8
    short s; //16
    float f; //32
    double d; //64
    boolean aBoolean;
    char aChar = 'd';
    static int[] arr = new int[4];
    public static void main(String[] arg){
        arr[0] = 1;
        int[] tmp = new int[arr.length*2+1];
        for (int j = 0; j < arr.length; j++) {
            tmp[j] = arr[j];
        }
        tmp[5] = 5;

        for (int i:
             arr) {
            i = 5;
        }
        System.out.println(arr[0]);
        if (tmp == null) {
            System.out.println(tmp);
        }
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100, 200);
        }
        for (int i:
             arr) {
            System.out.println(i);
        }
        String binary = Integer.toBinaryString(9);
        System.out.println(binary);
        System.out.println(binary.length());
    }
    static int getInt(String str){
        return Integer.parseInt(str);
    }
}
