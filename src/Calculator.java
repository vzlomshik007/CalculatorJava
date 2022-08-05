import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the calculator!\nUse option: Enter a number and an expression in one line, with spaces! The numbers should only be Arabic or Roman (from 1 to 10)!");
        System.out.println("For example: '1 + 2 + 3 ' or 'I + II + III'");

        while (true) {
            String consoleData = console.nextLine();

            try {
                String result = Main.calc(consoleData);
                System.out.println(result);
            } catch (DifferentNumberException exception) {
                System.out.println(exception.getMessage());
                break;
            } catch (IndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
                break;
            }
        }

    }
}