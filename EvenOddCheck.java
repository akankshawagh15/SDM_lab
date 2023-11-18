public class EvenOddCheck {

    public static void main(String[] args) {
        // Assuming you have a specific number to check, for example, 5
        int numberToCheck = 5;

        // Check if the number is even or odd
        if (isEven(numberToCheck)) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is odd.");
        }
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
