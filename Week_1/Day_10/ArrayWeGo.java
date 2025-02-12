import java.util.Scanner;
import java.util.Random;

class ArrayWeGo {
    // Task 1: Declare an Array
    public static void task1() {
        System.out.println("Task 1: Declare an Array:\n");
        // Declare an integer array named numbers with a size of 5.
        int[] numbers;
        numbers = new int[5];
        // Print all elements of the array to show their default values.
        System.out.println("Element at index 0 is "+ numbers[0]);
        System.out.println("Element at index 1 is "+ numbers[1]);
        System.out.println("Element at index 2 is "+ numbers[2]);
        System.out.println("Element at index 3 is "+ numbers[3]);
        System.out.println("Element at index 4 is "+ numbers[4]);
        System.out.print("\n\n\n");
    }
        
    // Task 2: Declare an Array and fill the values in multiple lines
    public static void task2() {
        System.out.println("Task 2: Declare an Array and fill the values in multiple lines:\n");
        // Declare an integer array named numbers with a size of 5.
        int[] numbers;
        numbers = new int[5];
        // Assign the values 21, 12, 22, 11, 2 to the array using separate assignment statements.
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        // Print the complete array.
        System.out.println("The complete array: {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + "}\n\n\n");
    }

         
    // Task 3: Declare an Array and fill the values in one line
    public static void task3() {
        System.out.println("Task 3: Declare an Array and fill the values in one line:\n");
        // Declare and initialize an integer array named numbers with a size of 5 in one line.
        // Assign the values 21, 12, 22, 11, 2 directly.
        int[] numbers = {21, 12, 22, 11, 2};
        // Print the complete array.
        System.out.println("The complete array: {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + "}\n\n\n");
    }    
        
    // Task 4: Declare an Array and fill the values using a for loop
    public static void task4() {
        System.out.println("Task 4: Declare an Array and fill the values using a for loop:\n");
        // Declare an integer array named numbers with a size of 5.
        int[] numbers = new int[5];
        // Use a for loop to populate the array starting with 3, then fill it with increasing multiples of 3.
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                numbers[i] = 3;
            }
            else {
                numbers[i] = i * 3+3;
            }
        }
        // Print the complete array. 
        System.out.println("Multiples of 3 in an array: {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + "}\n\n\n");
    }

        
    // Task 5: Declare an Array and fill the values using a for loop, char edition
    public static void task5() {
        System.out.println("Task 5: Declare an Array and fill the values using a for loop, char edition:\n");
        // Declare a char array named charArray with a size of 5.
        char[] charArray = new char[5];
        // Set the first element to 'A'.
        charArray[0] = 'A';
        // Use a for loop to fill the array with the next respective letters, increasing by 2 each time. You must use math, you cannot hard code.
        int letter = 65;
        for (int i = 0; i < 5; i++) {
            charArray[i] = (char)(letter);
            letter+= 2;
        }
        
        // Print the complete array.
        System.out.println("Character Array: {" + charArray[0] + ", " + charArray[1] + ", " + charArray[2] + ", " + charArray[3] + ", " + charArray[4] + "}\n\n\n");
    }
        
    // Task 6: User-Defined Array with Random Values
    public static void task6() {
        System.out.println("Task 6: User-Defined Array with Random Values:\n");
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the size of the array.
        System.out.print("Enter a size for the array: ");
        int size = scanner.nextInt();
        // Create an array of that size.
        int[] random_array = new int[size];
        // Fill it with random numbers between 1 and 100 using a for loop.
        Random rand = new Random();
        System.out.print("Random Array: ");
        for(int i = 0; i < size; i++) {
            int rand_num = rand.nextInt(101);
            random_array[i] = rand_num;
            // Print the array values.
            System.out.print(random_array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
}
