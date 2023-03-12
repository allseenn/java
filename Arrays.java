import javax.sound.midi.Soundbank;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[]{1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : b) {
            System.out.printf("%d ", i);
        }
    }
}