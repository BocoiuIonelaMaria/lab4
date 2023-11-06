public class MiddleCharacter {
    public static String findMiddleCharacters(String input) {
        int length = input.length();
        if (length % 2 == 0) {
            // Cuvântul are un număr par de litere, deci mijlocul este format din 2 litere.
            int middleStart = length / 2 - 1;
            int middleEnd = length / 2 + 1;
            return input.substring(middleStart, middleEnd);
        } else {
            // Cuvântul are un număr impar de litere, deci mijlocul este o singură literă.
            int middleIndex = length / 2;
            return String.valueOf(input.charAt(middleIndex));
        }
    }

    public static void main(String[] args) {
        String input = "masina";
        String middle = findMiddleCharacters(input);
        System.out.println(middle); // Va afișa "si"
    }
}
