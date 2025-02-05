
class ThreeIsNotTheMagicNumber {
    public static void main(String[] args) {
        // BEGIN
        // Loop through numbers 1 to 20
        // FOR each number from 1 to 20 DO
        for (int i = 1; i <= 20; i++) {
            //     IF number is divisible by 3 THEN
            if (i % 3 == 0) {
            //         Skip this iteration
                continue;
            }
            //     ELSE
            else {
            //         Print the number
                System.out.println(i);
            //     END IF
            }
        // END FOR
        }
        // END
    }
}
