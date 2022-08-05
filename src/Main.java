import java.util.ArrayList;
import java.util.List;
public class Main {
    public static String calc(String input) throws DifferentNumberException, IndexOutOfBoundsException {
        String result = "";

        String[] data = input.split(" ");

        List<Integer> numbersArray = new ArrayList<>();
        List<String> textArray = new ArrayList<>();
        List<Integer> RimNumbersArray = new ArrayList<>();

        String[] RimNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for(String textNumber : data) {
            try {
                Integer number = Integer.valueOf(textNumber);
                numbersArray.add(number);
            } catch(NumberFormatException e) {
                if(textNumber.equals("+")) {
                    textArray.add(textNumber);
                } else if(textNumber.equals("-")){
                    textArray.add(textNumber);
                } else if(textNumber.equals("*")){
                    textArray.add(textNumber);
                } else if(textNumber.equals("/")){
                    textArray.add(textNumber);
                } else {
                    boolean flag = false;
                    for (String RimNumber : RimNumbers) {
                        if (textNumber.equals(RimNumber)) {
                            switch (textNumber) {
                                case "I" -> RimNumbersArray.add(1);
                                case "II" -> RimNumbersArray.add(2);
                                case "III" -> RimNumbersArray.add(3);
                                case "IV" -> RimNumbersArray.add(4);
                                case "V" -> RimNumbersArray.add(5);
                                case "VI" -> RimNumbersArray.add(6);
                                case "VII" -> RimNumbersArray.add(7);
                                case "VIII" -> RimNumbersArray.add(8);
                                case "IX" -> RimNumbersArray.add(9);
                                case "X" -> RimNumbersArray.add(10);
                            };
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.err.println("Неправильный формат! Пишите только арабские или римские(от 1 до 10) цифры с пробелами!");
                    }
                }
            }
        }

        if (numbersArray.isEmpty()) {
            result = ExpressionRimClass.ExpressionRimNumber(RimNumbersArray, textArray);
        } else if (RimNumbersArray.isEmpty()) {
            result = ExpressionArabicClass.ExpressionArabicNumber(numbersArray, textArray);
        } else if (numbersArray.isEmpty() && RimNumbersArray.isEmpty()) {
            System.out.println("Консоль пустой! Пишите арабские или римские(от 1 до 10) цифры с пробелами!");
        } else {
            throw new DifferentNumberException("Неправильный формат ввода! Не совпадает данные цифры! Пишите только арабские или римские(от 1 до 10) цифры с пробелами!");
        }

        return result;
    }
}

class DifferentNumberException extends Exception{
    public DifferentNumberException(String message) {
        super(message);
    }
}