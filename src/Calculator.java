import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор!\nОпция использование: Введите число и выражение в одну строку, с пробелами! Цифры должны быть только арабские или римские(от 1 до 10)!");
        System.out.println("Например: '1 + 2 + 3' или 'I + II + III'");

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