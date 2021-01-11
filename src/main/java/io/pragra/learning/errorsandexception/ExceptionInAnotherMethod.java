package io.pragra.learning.errorsandexception;

public class ExceptionInAnotherMethod {
                public static void main(String[] args) {
            System.out.println("line 1");
            try{
                System.out.println("line A");
                namaste();
            }catch(ArithmeticException ex){
                System.out.println("I catched exception in namaste()");
            }
                    System.out.println("line 3");
                    System.out.println("line 4");
    }
    public static void namaste(){
                    try{
                        System.out.println(2/0);
                    }catch(IllegalArgumentException ex){
                        System.out.println("in namaste");
                    }
    }
}
