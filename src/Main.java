import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("array numbers");

        for (int i = 0; i < array.length; i++) {
          array[i] = input.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i-- ) {
            System.out.print(array[i] + " ");
        }

    }
}