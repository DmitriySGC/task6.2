import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое число a: ");
        int a = in1.nextInt();
        System.out.println("Введите второе число b: ");
        int b = in1.nextInt();
        System.out.println("Введите один из символов +,-,/,*");
        Scanner in2 = new Scanner(System.in);
        String operation = in2.nextLine();
        switch (operation){
            case "+": System.out.println("Программа выполнена корректно, ответ: " + (a+b));
                break;
            case "/": System.out.println("Программа выполнена корректно, ответ: " + (a/b));
                break;
            case "-": System.out.println("Программа выполнена корректно, ответ: " + (a-b));
                break;
            case "*": System.out.println("Программа выполнена корректно, ответ: " + (a*b));
                break;
            default: System.out.println("Такой арифметической операции не существует");
                break;
        }
    }
}
