package io.pragra.learning.errorsandexception;

public class Testrun {
    public static void main(String[] args) {
        System.out.println("Line---1");
        System.out.println("Line---2");
        try{
            int i = Integer.parseInt("2");
            System.out.println(2/0);
            System.out.println("Line---3");

        }//catch(NumberFormatException | ArithmeticException ex){
           // System.out.println(ex.getMessage());
        //}
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("wow in finally");
        }
        System.out.println("Line---4");
        System.out.println("Line---5");
        System.out.println("Line---6");
        System.out.println("Line---7");
        System.out.println("Line---8");
    }
}
