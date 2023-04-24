import java.util.Scanner;
public class StarsTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter triangle height: ");
        int height = keyboard.nextInt();
        for (int i=1; i<=height; i++) {
            for (int j=1; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            for (int j=1; j <= height-i; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
