UserInput.java
import java.util.Scanner;

public class UserInput {
    public static int getNumberInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int[] getArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}

