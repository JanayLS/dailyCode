import java.util.Scanner;

class DoIt {
    public static void main(String[] args) {
    // BEGIN
    // Declare a variable for user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    //     Read input
    int userInteger = scanner.nextInt();
    // REPEAT AT LEAST ONCE
    // DO
    do {
        System.out.println("Invalid input. Try again.");
        System.out.print("Enter a positive number: ");
        //     Read input
        userInteger = scanner.nextInt();
    }

    // WHILE (input is negative)
    while(userInteger <= 0);
    
    System.out.println("You entered: " + userInteger);
    // END
    scanner.close();

    }
}
