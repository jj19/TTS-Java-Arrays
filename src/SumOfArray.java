import java.util.Arrays;
public class SumOfArray {
    public static void main(String[] args){
        double[] exampleArray = {1, 5, 6, 5, 4, 1};
        double sum = 0;

        for (double value : exampleArray) {
            sum += value;
        }

        System.out.println("Sum: " + sum);
    }
}
