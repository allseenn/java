import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = ranIn(200);
        System.out.println("1. Случайное число от 0 до 2000: " + i);
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = numBit(i);
        System.out.println("2. Номер старшего бита: " + n);
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = array1(i, n);
        System.out.println("3. Массив m1 содержит " + m1.length+" чисел кратных " + n);
        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = array2(i, n);
        System.out.println("4. Массив m2 содержит " + m2.length+" чисел не кратных " + n);
    }
    static int ranIn(int any){
        return new Random().nextInt(any);
    }
    static int numBit(int interNum){
        return Integer.toBinaryString(interNum).length();
    }
    static int[] array1(int interNum, int bit){
        int counter = 0;
        for (int i = interNum; i < Short.MAX_VALUE; i++) {
            if (i % bit == 0) {
                counter++;
            }
        }
        int[] ara = new int[counter];
        int j = 0;
        for (int i = interNum; i < Short.MAX_VALUE; i++) {
            if (i % bit == 0) {
                ara[j] = i;
                j++;
            }
        }
        return ara;
    }

    static int[] array2(int interNum, int bit){
        int counter = 0;
        for (int i = Short.MIN_VALUE; i < interNum; i++) {
            if (i % bit != 0) {
                counter++;
            }
        }
        int[] ara = new int[counter];
        int j = 0;
        for (int i = Short.MIN_VALUE; i < interNum; i++) {
            if (i % bit != 0) {
                ara[j] = i;
                j++;
            }
        }
        return ara;
    }

}
