
public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 254;
        int sum = sumOfDigits(number);
        System.out.println("Sum is " + sum); // Va afișa "Sum is 11"
    }
}
