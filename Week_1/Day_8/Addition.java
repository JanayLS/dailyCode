import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
    // BEGIN
    Scanner scanner = new Scanner(System.in);
    // Generate two random numbers between 0 and 9
    // SET number1 = RANDOM(0-9)
    int number1 = (int)(Math.random() * 10);
    // SET number2 = RANDOM(0-9)
    int number2 = (int)(Math.random() * 10);
    
    // Prompt user for input
    // PRINT "What is " + number1 + " + " + number2 + "? "
    System.out.printf("What is %d + %d? ", number1, number2);
    // READ answer
    int userAnswer = scanner.nextInt();
    
    // Keep asking until the user gets it right
    
    // WHILE (answer ≠ number1 + number2) DO
    while (userAnswer != number1 + number2) {
    //     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
        System.out.printf("Wrong answer. Try again. What is %d + %d? ", number1, number2);
    //     READ answer
        userAnswer = scanner.nextInt();
    // END WHILE
    }
    if (userAnswer == number1+number2) {
        // Correct answer message
        // PRINT "You got it!"
        System.out.print("You got it!");
        // END
        }
    }
}
