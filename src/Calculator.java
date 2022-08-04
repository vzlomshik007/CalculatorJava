import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор! Выберите категорию:");
        System.out.println("1) Арабские цифры \n2) Римские цифры");

        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();

        System.out.println("Опция использование: Введите число и выражение в одну строку, с пробелами!");

        if(answer.equals("1")) {
            System.out.println("Введите только арабские цифры!");
            System.out.println("Например: '1 + 2 + 3'");

            String text = console.nextLine();
            String[] data = text.split(" ");

            List<Integer> numbersArray = new ArrayList<>();
            List<String> textArray = new ArrayList<>();

            for(String numbers : data) {
                try {
                    Integer number = Integer.valueOf(numbers);
                    numbersArray.add(number);
                } catch(NumberFormatException e) {
                    if(numbers.equals("+")) {
                        textArray.add(numbers);
                    } else if(numbers.equals("-")){
                        textArray.add(numbers);
                    } else if(numbers.equals("*")){
                        textArray.add(numbers);
                    } else if(numbers.equals("/")){
                        textArray.add(numbers);
                    } else {
                        System.err.println("Неправильный формат! Пишите только арабские цифры!");
                    }
                }
            }


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
                System.out.println(numbersArray.get(size - 1));

            } catch(IndexOutOfBoundsException e){
                System.out.println("Пожалуйста запустите программу занова!");
            }
        } else if (answer.equals("2")) {
            System.out.println("Введите только римские цифры!");
            System.out.println("Например: 'I + II + III'");
            String answer1 = console.nextLine();

            String[] data1 = answer1.split(" ");
            List<Integer> listData1 = new ArrayList<>();
            List<String> textArray1 = new ArrayList<>();

            for (int i = 0; i < data1.length; i++) {
                switch (data1[i]) {
                    case "I" -> listData1.add(1);
                    case "II" -> listData1.add(2);
                    case "III" -> listData1.add(3);
                    case "IV" -> listData1.add(4);
                    case "V" -> listData1.add(5);
                    case "VI" -> listData1.add(6);
                    case "VII" -> listData1.add(7);
                    case "VIII" -> listData1.add(8);
                    case "IX" -> listData1.add(9);
                    case "X" -> listData1.add(10);
                    case "+" -> textArray1.add("+");
                    case "-" -> textArray1.add("-");
                    case "*" -> textArray1.add("*");
                    case "/" -> textArray1.add("/");
                    default -> System.out.println("Пожалуйста введите только римские цифры до 10!");
                }
            }

            try{
                for (int i = 0; i < listData1.size() - 1; i++ ) {
                    if(textArray1.get(i).equals("*")) {
                        int result1 = listData1.get(i) * listData1.get(i + 1);
                        listData1.set(i + 1, result1);
                    } else if(textArray1.get(i).equals("/")) {
                        int result2 = listData1.get(i) / listData1.get(i + 1);
                        listData1.set(i + 1, result2);
                    }
                }

                for (int i = 0; i < listData1.size() - 1; i++) {

                    if(textArray1.get(i).equals("+")) {
                        int result3 = listData1.get(i) + listData1.get(i + 1);
                        listData1.set(i + 1, result3);
                    } else if(textArray1.get(i).equals("-")) {
                        int result4 = listData1.get(i) - listData1.get(i + 1);
                        listData1.set(i + 1, result4);
                    } else if(textArray1.get(i).equals("*")) {
                        listData1.set(i + 1, listData1.get(i));
                    } else if(textArray1.get(i).equals("/")) {
                        listData1.set(i + 1, listData1.get(i));
                    }
                }

                int size = listData1.size();
                String result = "";
                switch (listData1.get(size - 1)) {
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
                
                System.out.println(result);

            } catch(IndexOutOfBoundsException e){
                System.out.println("Пожалуйста запустите программу занова!");
            }
        } else {
            System.out.println("Введите только 1 или 2!");
        }
    }
}
