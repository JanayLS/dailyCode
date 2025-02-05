import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    // BEGIN
    // Declare a variable for user input
    Scanner scanner = new Scanner(System.in);
    // REPEAT AT LEAST ONCE
    // DO
    int userInteger;
    do {
        System.out.print("Enter a positive number: ");
        //     Read input
        userInteger = scanner.nextInt();
        if (userInteger <= 0) {
            System.out.println("Invalid input. Try again.");
        }
    }

    // WHILE (input is negative)
    while(userInteger <= 0);
     System.out.println("You entered: " + userInteger);

    // END
    scanner.close();

    }
}
