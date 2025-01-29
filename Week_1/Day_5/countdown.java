// imports scanner for user input
import java.util.Scanner;

class countdown {
    // creates functioon called countdown
    static void count_down() {
        Scanner scanner = new Scanner(System.in);
        // flag used to see if user input is an integer
        boolean valid = false;
        // loop that checks to see if user input is a valid integer
        while (!valid) {
            // lets user try to enter a number and if it works, the number is valid
            try {
                System.out.print("Enter a number: ");
                int user_num = scanner.nextInt();
                valid = true;
                // checks user input and counts down
                for (int i=-user_num + 1; i <= user_num; i++) {
                    System.out.print(user_num);
                    --user_num;
                    System.out.println(" ");
                }
            }
            // if the input entered is not an integer, it will print to the screen that it is not a valid input and ask again.
            catch(Exception e) {
                System.out.print("This is not a valid input.\n");
                scanner.nextLine();
            }
        }
    }
    
    public static void main(String[] args) {
        // calls my function
        count_down();
    }
}
