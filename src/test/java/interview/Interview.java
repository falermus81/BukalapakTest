package interview;

import org.junit.Test;

public class Interview {
    public static void displayFibonacci(int num1, int num2, int n) {
        int temp = 0;

        System.out.printf(num1 + ", " + num2);

        for (int i = 0; i < n; i++) {
            if (num1 == 0) {
                temp = num2 * 2;
            }
            else if (num2 == 0) {
                temp = num1 * 2;
            }
            else {
                temp = num1 + num2;
            }

            System.out.printf(", " + temp);

            num1 = num2;
            num2 = temp;
        }

        System.out.println("");
    }

    @Test
    public void testFibonacci() {
        displayFibonacci(0, 1, 20);
    }
}
