import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {

        System.out.printf("\n\nWelcome to my Largest Of Three program!!\n\n");

        // Variable Declaration Section
        String userName = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Create a scanner object.
        Scanner scanner = new Scanner(System.in);

        // Use the scanner object to get the user's name
        // Prompt the user for userName
        System.out.println("\n Please enter your name: ");
        // Store username into the variable named 'username'
        userName = scanner.nextLine();

        //Output the username.
        System.out.println("\n The username is: " + userName);

        // Get the three ints from the user:
        // Prompt for the first int.
        System.out.println("Enter Number One: ");
        num1 = scanner.nextInt();
        // Output num1 ...
        System.out.println("\n You entered " + num1 + " for the first number.");

        // Prompt for the second int.
        System.out.println("Enter Number Two: ");
        num2 = scanner.nextInt();
        // Output num1 ...
        System.out.println("\n You entered " + num2 + " for the second number.");

        // Prompt for the third int.
        System.out.println("Enter Number Three: ");
        num3 = scanner.nextInt();
        // Output num1 ...
        System.out.println("\n You entered " + num3 + " for the third number.");

        System.out.println("\n You entered: " + num1 + " and " + num2 + " and " + num3);

        // Find the largest of three ints with decisions.
        if (num1 > num2 & num1 > num3) {
            largest = num1;
        }
        if (num2 > num1 & num2 > num3) {
            largest = num2;
        }
        if (num3 > num1 & num3 > num2) {
            largest = num1;
        }

        // Output the largest number:
        System.out.println("\n***********\n The largest of " + num1 + " and " + num2 + " and " + num3 + " is: " + largest);
    }
}