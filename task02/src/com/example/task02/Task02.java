package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long numberInput = Long.parseLong(input);
        if (numberInput >= Byte.MIN_VALUE && numberInput <= Byte.MAX_VALUE) return "byte";
        else {
            if (numberInput >= Short.MIN_VALUE && numberInput <= Short.MAX_VALUE) return "short";
            else {
                if (numberInput >= Integer.MIN_VALUE && numberInput <= Integer.MAX_VALUE) return "int";
                else {
                    return "long";
                }
            }
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("4000000000");
        System.out.println(result);
        */
    }

}
