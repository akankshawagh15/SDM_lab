public class GreaterAmongThreeNumbers {
    public static void main(String[] args) {
        // Assuming the three numbers are hardcoded for simplicity
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        // Find the greater among three numbers
        int result = findGreater(num1, num2, num3);

        // Display the result
        System.out.println("The greater number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
    }

    // Method to find the greater among three numbers
    public static int findGreater(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
