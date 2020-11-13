import java.util.Scanner;
public class FractionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program is a fraction calculator");
        System.out.println("It will add, subtract, multiply and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers.");
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static String getOperation(Scanner input) {
        System.out.println("Please enter an operation(+, -, /, *, = or Q to quit): ");
        String operation = input.next();
        if(operation.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        while(!operation.equals("+") || !operation.equals("-") || !operation.equals("/") || !operation.equals("*") || !operation.equals("=")) {
            System.out.println("Invalid input. Please enter a valid operation(+, -, /, *, = or Q to quit): ");
            operation = input.next();
        }
        return operation;
    }

    public static boolean isNumber(String input) {
        boolean number = false;
        for(int i = 0; i < input.length(); i++) {
            number = Character.isDigit(input.charAt(i)) && !input.substring(i, i + 1).isEmpty();
            if(!number) {
                return number;
            }
        }
        return number;
    }

    public static boolean validFraction(String input) {

    }

    public static Fraction getFraction(Scanner input) {

    }
}
