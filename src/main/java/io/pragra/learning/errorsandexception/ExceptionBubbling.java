package io.pragra.learning.errorsandexception;

public class ExceptionBubbling {
    public static void main(String[] args) {
        System.out.println("line 1");
        try {
            System.out.println(2 / 0);
        try {
            System.out.println("line 2");
        } catch (ArithmeticException ex) {
        }
        System.out.println("line3");
    }catch( ArithmeticException ex){
        }
        System.out.println("line 4");
        System.out.println("line 5");
}}
