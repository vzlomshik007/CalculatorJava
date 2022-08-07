import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String calc(String input) throws DifferentNumberException, IndexOutOfBoundsException, NegativeOutputException, BigNumberException, MinNumberException, InvalidInputFormatException, FloatingPointNumbersException {
        String[] dataArray = input.split(" ");

        String result = "";

        List<Integer> NumbersArray = new ArrayList<>();
        List<Integer> RimNumbersArray = new ArrayList<>();
        List<String> textArray = new ArrayList<>();
        String[] RimNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (dataArray.length != 3) {
            throw new InvalidInputFormatException("Enter only two operands with an expression leaving a space between them!");
        }

        for(String textNumber : dataArray) {
            try {
                Integer number = Integer.valueOf(textNumber);
                if (number > 10) {
                    throw new BigNumberException("The numbers you entered are greater than 10! Please write numbers in the range of 1 to 10.");
                } else if (number < 1) {
                    throw new MinNumberException("The numbers you entered are less than 1! Please write the numbers in the range from 1 to 10.");
                }
                NumbersArray.add(number);
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
                        System.err.println("Wrong format! Write only Arabic or Roman (from 1 to 10) numbers with spaces!");
                    }
                }
            }
        }

        if (NumbersArray.isEmpty()) {
            result = ExpressionRimClass.ExpressionRimNumber(RimNumbersArray, textArray);
        } else if (RimNumbersArray.isEmpty()) {
            result = ExpressionArabicClass.ExpressionArabicNumber(NumbersArray, textArray);
        } else {
            throw new DifferentNumberException("Incorrect input format! These figures do not match! Write only Arabic or Roman (from 1 to 10) numbers with spaces!");
        }


        return result;
    }
}

class InvalidInputFormatException extends Exception{
    public InvalidInputFormatException(String message) { super(message); }
}
class DifferentNumberException extends Exception{
    public DifferentNumberException(String message) {
        super(message);
    }
}
class NegativeOutputException extends Exception {
    public NegativeOutputException(String message) {
        super(message);
    }
}

class BigNumberException extends Exception{
    public BigNumberException(String message) { super(message); }
}
class MinNumberException extends Exception{
    public MinNumberException(String message) { super(message); }
}
class FloatingPointNumbersException extends Exception{
    public FloatingPointNumbersException(String message) {
        super(message);
    }
}