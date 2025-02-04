import java.util.Scanner;


public class JavaQuickMaths {
    public static void main(String[] args)    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        double counter = 1.0;
        System.out.println("Looping from 1.0 to 5.0 with rounding methods: ");
        for (int i = 0; counter <= 5.0; i++) { 
            //    - Print the number
            System.out.print("Number: "+ counter);
            //    - Apply and print results of:
            //      - Math.ceil()
            System.out.print("  Ceil: " + Math.ceil(counter) );
            //      - Math.floor()
            System.out.print("  Floor: " + Math.floor(counter) );
            //      - Math.rint()
            System.out.print("  Rint: " + Math.rint(counter) );
            //      - Math.round()
            System.out.println("  Round: " + Math.round(counter) );
            counter = counter + 0.5;
        }
        
        System.out.print("\n\n\n");

        
        // 2. Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        //    - Store the number
        double userNum = scanner.nextDouble();
        //    - Print the rounding results (ceil, floor, rint, round)
            //    - Apply and print results of:
            //      - Math.ceil()
            System.out.print("  Ceil: " + Math.ceil(userNum) );
            //      - Math.floor()
            System.out.print("  Floor: " + Math.floor(userNum) );
            //      - Math.rint()
            System.out.print("  Rint: " + Math.rint(userNum) );
            //      - Math.round()
            System.out.println("  Round: " + Math.round(userNum) );
        
        System.out.print("\n\n\n");    
            
        // 3. Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        //    - Store the integer
        int userInt = scanner.nextInt();
        //    - Prompt the user to enter a string
        System.out.print("Enter a word: ");
        //    - Store the string
        String userWord = scanner.next();
        //    - Print the entered integer and string
        System.out.println("You entered integer: " + userInt);
        System.out.println("You entered string: " + userWord);

        System.out.print("\n\n\n");    

        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        double newdub = userInt;
        System.out.println("Implicit cast (int -> double): " + newdub);
        //    - Convert the decimal number to int (explicit cast) and print
        int newInt = (int)userNum;
        System.out.println("Explicit cast (double -> int): " + newInt);
        //    - Convert the integer to a char (ASCII representation) and print
        char newChar = (char)userInt;
        System.out.println("Casting int to char (ASCII): " + newChar);
        
        
        System.out.print("\n\n\n");
        
        
        // 5. Prompt the user to enter a character
        System.out.print("Enter a character: ");
        //    - Store the character
        char userChar = scanner.next().charAt(0);
        //    - Convert the character to its ASCII value (int) and print
        int charToASCII = userChar;
        System.out.printf("ASCII value of '%c' is: " + charToASCII, userChar);
        
        
        System.out.print("\n\n\n");
        
        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        String str1 = "Hey wassup";
        String str2 = str1;
        //    - Create another String using new String()
        String str3 = new String ("Hey wassup");
        //    - Compare the first two strings using == (reference check)
        System.out.println("String Comparisons:");
        System.out.printf("str1 == str2: %b\n", str1 == str2);
        //    - Compare one literal with the new String() object using ==
        System.out.printf("str1 == str3: %b\n", str1 == str3);
        //    - Compare the content of both strings using .equals()
        System.out.printf("str1.equals(str3): %b\n", str1.equals(str3));
        //    - Print the results
        
        // Close the Scanner object
        scanner.close();
    }
}
