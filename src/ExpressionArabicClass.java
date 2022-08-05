import java.util.List;

public class ExpressionArabicClass extends Exception {
    public static String ExpressionArabicNumber(List<Integer> numbersArray, List<String> textArray){
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
        } catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Please restart the program!");
        }

        int size = numbersArray.size();

        return String.valueOf(numbersArray.get(size - 1));
    }
}
