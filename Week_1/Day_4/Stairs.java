import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    // Accept a single character as input from the user.
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a single character: ");
    String userInput1 = userInput.next();
    // Accept a whole number as input from the user.
    Scanner wholeNumber = new Scanner(System.in);
    System.out.print("Enter a whole number: ");
    
    int whole = wholeNumber.nextInt();

    // Print a right-justified staircase using the character as the stairs with the same number of stairs as the user enters.
     for (int i = 0; i <= whole; i++) {
         for (int j = 0; j<= whole-i; j++){
             System.out.print("  ");}
            for (int x=0; x <= i; x++){
                System.out.print(userInput1+ " ");
            }
            System.out.println();
     }    
        
        
        
    }
}
