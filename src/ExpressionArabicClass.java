import java.util.List;

public class ExpressionArabicClass extends Exception {
    public static String ExpressionArabicNumber(List<Integer> numbersArray, List<String> textArray) throws NegativeOutputException {
        int result = switch (textArray.get(0)) {
            case "*" -> numbersArray.get(0) * numbersArray.get(1);
            case "/" -> numbersArray.get(0) / numbersArray.get(1);
            case "+" -> numbersArray.get(0) + numbersArray.get(1);
            case "-" -> numbersArray.get(0) - numbersArray.get(1);
            default -> 0;
        };

        if (result <= 0) {
            throw new NegativeOutputException("The answer is less than or equal to zero!");
        }

        return String.valueOf(result);
    }
}