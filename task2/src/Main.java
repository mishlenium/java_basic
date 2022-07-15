import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * TODO:
         * есть 4 банковские операции
         * операция 1 вызывает функцию function1
         * операция 2 вызывает функцию function2
         * ....
         * написать программу, которая будет реализовывать следующий алгоритм
         * 1. считывает из консоли целое число
         * 2. вызывает функцию, соответствующую номеру операции
         *
         */
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        switch (op){
            case 1 -> function1();
            case 2 -> function2();
            case 3 -> function3();
            case 4 -> function4();
            default -> System.err.println("No such operation");

        }

    }

    public static void function1() {

        System.out.println("This is function1");
        return;
    }

    public static int function2() {
        System.out.println("This is function2");
        return 1;
    }

    public static Object function3() {
        System.out.println("This is function3");
        return new Object();
    }

    public static String function4() {
        System.out.println("This is function4");
        return "Hello";
    }
}
