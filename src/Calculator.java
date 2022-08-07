import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the calculator!\nUse option: Enter a number and an expression in one line, with spaces! The numbers should only be Arabic or Roman (from 1 to 10)!");
        System.out.println("To exit the calculator, write stop!");
        System.out.println("For example: '1 + 2 ' or 'I + II'");

        while (true) {
            String consoleData = console.nextLine();

            if (consoleData.equals("stop")) {
                break;
            }

            try {
                String result = Main.calc(consoleData);
                System.out.println(result);
            } catch (Exception exception) {
                System.err.println(exception.getMessage());
            }
        }

    }
}