// imports scanner for user input
import java.util.Scanner;
class Main {
   static void factorial() {
       // scans for user input
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int user_num = scanner.nextInt();
       // original number entered by user
       int og = user_num;
       // counts the number of times iterated through loop
       int counter = 1;
       // the number being multiplied by the current number to get the factorial
       double factorial = 1;
       // for loop that calculates factorial
       for (double i = 1; i <= user_num; i++) {
           // iif the user enters 0, the correct factorial displayed is 1
           if (user_num == 0) {
               System.out.print("The factorial of " + og + " is " + 1);
           } else {
               // multiplies the previous number by the current number to product the factorial
               factorial = factorial * i;
               counter++;
           }
       }
       // prints out the number entered and factorial of that number
       System.out.print("The factorial of " + og + " is " + factorial);
   }
   public static void main(String[] args) {
       // calls my function
       factorial();
   }
}
