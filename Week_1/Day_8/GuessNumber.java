import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
    // BEGIN
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");
    System.out.print("\n\n\n");
    // Choose a hidden number
    int hiddenNumber = (int) (Math.random() * 101);
    // Prompt the user to start guessing
    // Repeat until the correct guess is made
    // WHILE (true) DO
    //     Ask for a guess
    //     Get user input
    while (true) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        //     IF the guess is correct THEN
        if (userGuess == hiddenNumber) {
        //         Display success message
            System.out.printf("Yes, the number is %d.", hiddenNumber);
            //         Exit the loop
            break;
        }

        //     ELSE IF the guess is too high THEN
        //         Give a hint
        
        else if (userGuess > hiddenNumber){
            System.out.println("Your guess is too high.");
            System.out.println("");
        }
        //     ELSE
        //         Give a different hint
        else {
            System.out.println("Your guess is too low.");
            System.out.println("");
        }
        //     END IF
        // END WHILE
    }

    
    // END
    scanner.close();

    }
}
