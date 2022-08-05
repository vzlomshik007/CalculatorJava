import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("����� ���������� � �����������!\n����� �������������: ������� ����� � ��������� � ���� ������, � ���������! ����� ������ ���� ������ �������� ��� �������(�� 1 �� 10)!");
        System.out.println("��������: '1 + 2 + 3' ��� 'I + II + III'");

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