package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int digit;
        int length;
        String stringX = String.valueOf(x);
        length = stringX.length();
        do{
            digit = x % 10;
            x /= 10;
            if((digit % 2) != 0) return "FALSE";
            length--;
        }while(length != 0);

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
