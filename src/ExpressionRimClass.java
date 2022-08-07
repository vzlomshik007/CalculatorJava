import java.util.List;

public class ExpressionRimClass extends Exception {
    public static String ExpressionRimNumber(List<Integer> numbersArray, List<String> textArray) throws NegativeOutputException, FloatingPointNumbersException {
        float result = switch (textArray.get(0)) {
            case "*" -> numbersArray.get(0) * numbersArray.get(1);
            case "/" -> numbersArray.get(0) / numbersArray.get(1);
            case "+" -> numbersArray.get(0) + numbersArray.get(1);
            case "-" -> numbersArray.get(0) - numbersArray.get(1);
            default -> 0;
        };

        if (result <= 0) {
            throw new NegativeOutputException("The answer is less than or equal to zero!");
        }

        float resultFloat = result / 10;
        int resultInt = Integer.valueOf((int) resultFloat);
        resultFloat = resultFloat - resultInt;

        String textResultFloat = String.format("%.1f" ,resultFloat);

        String resultAll = "";

        switch (resultInt) {
            case 1 -> resultAll = "X";
            case 2 -> resultAll = "XX";
            case 3 -> resultAll = "XXX";
            case 4 -> resultAll = "XL";
            case 5 -> resultAll = "L";
            case 6 -> resultAll = "LX";
            case 7 -> resultAll = "LXX";
            case 8 -> resultAll = "LXXX";
            case 9 -> resultAll = "XC";
            case 10 -> resultAll = "C";
        }

        if (resultFloat != 0) {
            switch (textResultFloat) {
                case "0,1" -> resultAll += "I";
                case "0,2" -> resultAll += "II";
                case "0,3" -> resultAll += "III";
                case "0,4" -> resultAll += "IV";
                case "0,5" -> resultAll += "V";
                case "0,6" -> resultAll += "VI";
                case "0,7" -> resultAll += "VII";
                case "0,8" -> resultAll += "VIII";
                case "0,9" -> resultAll += "IX";
                default -> throw new FloatingPointNumbersException("Numbers with floating commas!");
            }
        }



        return resultAll;
    }
}
