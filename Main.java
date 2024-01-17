Main.java


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example usage of UserInput class
        int number = UserInput.getNumberInput("Enter a number: ");
        System.out.println("Entered number: " + number);

        int[] array = UserInput.getArrayInput();
        System.out.println("Entered array: " + Arrays.toString(array));

        // Example usage of Calculator class
        int result = Calculator.add(number, array[0]);
        System.out.println("Addition result: " + result);

        // Add more operations as needed
    }
}

