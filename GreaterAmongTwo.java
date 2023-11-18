public class GreaterAmongTwo {
    public static void main(String[] args) {
        // Two numbers to compare
        int number1 = 10;
        int number2 = 20;

        // Compare the numbers
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " is greater than " + number1);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
