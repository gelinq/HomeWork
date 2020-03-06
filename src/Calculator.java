import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        char op = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.println("Введите число:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else {
                System.out.println("Ошибка. Попробуйте еще раз.");
                scanner.next();
            }
            System.out.println("Введите операцию:");
            if (scanner.hasNext()) {
                op = scanner.next().charAt(0);
            } else {
                System.out.println("Ошибка. Попробуйте еще раз.");
                scanner.next();
            }
            System.out.println("Введите число:");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
            } else {
                System.out.println("Ошибка. Попробуйте еще раз.");
                scanner.next();
            }


            if (op == '+') {
                double res = x + y;
                System.out.println(x + "+" + y + "=" + res);
            } else if (op == '-') {
                double res = x - y;
                System.out.println(x + "-" + y + "=" + res);
            } else if (op == '/') {
                double res = x / y;
                System.out.println(x + "/" + y + "=" + res);
            } else if (op == '*') {
                double res = x * y;
                System.out.println(x + "*" + y + "=" + res);
            }
            System.out.println("Если хотите выйти введите e");
            System.out.println("Если хотите продолжить введите с");
            if (scanner.hasNext()) {
                op = scanner.next().charAt(0);
                if(op=='e')
                    break;
                else if(op=='с')
                    continue;
                else
                    System.out.println("Введено неверное значение");
            }
        }
        System.out.println("Спасибо, что воспользовались калькулятором");
        scanner.close();
    }
}
