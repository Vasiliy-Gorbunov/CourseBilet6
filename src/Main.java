import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(returnOdd3to7(array)));
    }

    public static int[] returnOdd3to7(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        int[] returnArray = new int[5];
        System.arraycopy(array, 2, returnArray, 0, 5);
        return returnArray;
    }
}