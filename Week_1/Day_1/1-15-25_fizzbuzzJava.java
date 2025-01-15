// Fizzbuzz and testing
public class Main
{
    public static void main(String[] args) {
        // Set one variable equal to 3
        int three = 3;
        // Set one variable equal to 5
        int five = 5;
        // Set one variable equal to 15
        int fifteen = 15;
        // Set one variable equal to any other number
        int test_fizz = 21;
        int test_buzz = 10;
        int test_fizzbuzz = 30;
        int myNumber = 60;

        // Testing 3 or fizz
        if (test_fizz % fifteen == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (test_fizz % three == 0) {
            System.out.println("Fizz");
        }
        else if (test_fizz % five == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("You get nothing.");
        }
        
        // Testing 5 or buzz
        if (test_buzz % fifteen == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (test_buzz % three == 0) {
            System.out.println("Fizz");
        }
        else if (test_buzz % five == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("You get nothing.");
        }
        
        // Testing 15 or Fizzbuzz
        if (test_fizzbuzz % fifteen == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (test_fizzbuzz % three == 0) {
            System.out.println("Fizz");
        }
        else if (test_fizzbuzz % five == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("You get nothing.");
        }
        
        // Testing my number
        if (myNumber % fifteen == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (myNumber % three == 0) {
            System.out.println("Fizz");
        }
        else if (myNumber % five == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("You get nothing.");
        }
    }
}
