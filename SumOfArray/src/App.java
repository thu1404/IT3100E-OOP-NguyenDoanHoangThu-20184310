import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] Arr = {1, 2, 5, 9, 3, 5, 3, 4, 6, 8, 7, 20, 22, 12};
        int sum = 0;
        double avg;

        Arrays.sort(Arr);
        System.out.println("The sorted Array is: ");
        for (int i=0; i < Arr.length; i++) {
            sum += Arr[i];
            System.out.print(Arr[i] + " ");
        }
        System.out.println("\nThe sum of the Array is: " + sum);
        avg = Double.valueOf(sum)/Double.valueOf(Arr.length);
        System.out.println("The average value of the Array is: " + avg);
    }
}
