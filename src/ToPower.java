import java.util.Arrays;
public class ToPower {
    public static int[] toPower(int size, int power) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            int value = 1;
            for (int j = 0; j < power; j++) {
                value *= i;
            }
            result[i] = value;
        }
        return result;

    }
    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        int[] result = toPower(size, power);

        System.out.println(Arrays.toString(result));
    }

    }




