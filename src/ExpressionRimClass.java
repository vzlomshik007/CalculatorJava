import java.util.List;

public class ExpressionRimClass extends Exception {
    public static String ExpressionRimNumber(List<Integer> numbersArray, List<String> textArray) {
        String resultAll = "";
        try{
            for (int i = 0; i < numbersArray.size() - 1; i++ ) {
                if(textArray.get(i).equals("*")) {
                    int result1 = numbersArray.get(i) * numbersArray.get(i + 1);
                    numbersArray.set(i + 1, result1);
                } else if(textArray.get(i).equals("/")) {
                    int result2 = numbersArray.get(i) / numbersArray.get(i + 1);
                    numbersArray.set(i + 1, result2);
                }
            }

            for (int i = 0; i < numbersArray.size() - 1; i++) {

                if(textArray.get(i).equals("+")) {
                    int result3 = numbersArray.get(i) + numbersArray.get(i + 1);
                    numbersArray.set(i + 1, result3);
                } else if(textArray.get(i).equals("-")) {
                    int result4 = numbersArray.get(i) - numbersArray.get(i + 1);
                    numbersArray.set(i + 1, result4);
                } else if(textArray.get(i).equals("*")) {
                    numbersArray.set(i + 1, numbersArray.get(i));
                } else if(textArray.get(i).equals("/")) {
                    numbersArray.set(i + 1, numbersArray.get(i));
                }
            }

            int size = numbersArray.size();
            String result = "";
            switch (numbersArray.get(size - 1)) {
                case -1 -> result = "-I";
                case -2 -> result = "-II";
                case -3 -> result = "-III";
                case -4 -> result = "-IV";
                case -5 -> result = "-V";
                case -6 -> result = "-VI";
                case -7 -> result = "-VII";
                case -8 -> result = "-VIII";
                case -9 -> result = "-IX";
                case -10 -> result = "-X";
                case -11 -> result = "-XI";
                case -12 -> result = "-XII";
                case -13 -> result = "-XIII";
                case -14 -> result = "-XIV";
                case -15 -> result = "-XV";
                case -16 -> result = "-XVI";
                case -17 -> result = "-XVII";
                case -18 -> result = "-XVIII";
                case -19 -> result = "-IXX";
                case -20 -> result = "-XX";
                case -21 -> result = "-XXI";
                case -22 -> result = "-XXII";
                case -23 -> result = "-XXIII";
                case -24 -> result = "-XXIV";
                case -25 -> result = "-XXV";
                case -26 -> result = "-XXVI";
                case -27 -> result = "-XXVII";
                case -28 -> result = "-XXVIII";
                case -29 -> result = "-XXIX";
                case -30 -> result = "-XXX";
                case 0 -> result = "0";
                case 1 -> result = "I";
                case 2 -> result = "II";
                case 3 -> result = "III";
                case 4 -> result = "IV";
                case 5 -> result = "V";
                case 6 -> result = "VI";
                case 7 -> result = "VII";
                case 8 -> result = "VIII";
                case 9 -> result = "IX";
                case 10 -> result = "X";
                case 11 -> result = "XI";
                case 12 -> result = "XII";
                case 13 -> result = "XIII";
                case 14 -> result = "XIV";
                case 15 -> result = "XV";
                case 16 -> result = "XVI";
                case 17 -> result = "XVII";
                case 18 -> result = "XVIII";
                case 19 -> result = "IXX";
                case 20 -> result = "XX";
                case 21 -> result = "XXI";
                case 22 -> result = "XXII";
                case 23 -> result = "XXIII";
                case 24 -> result = "XXIV";
                case 25 -> result = "XXV";
                case 26 -> result = "XXVI";
                case 27 -> result = "XXVII";
                case 28 -> result = "XXVIII";
                case 29 -> result = "XXIX";
                case 30 -> result = "XXX";
            };

            resultAll = result;

        } catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Пожалуйста запустите программу занова!");
        }
        return resultAll;
    }
}
