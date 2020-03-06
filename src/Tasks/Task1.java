package Tasks;
//https://informatics.mccme.ru/mod/statements/view3.php?id=11680&chapterid=112165#1
// TODO: 29.02.2020 считать оба числа
// todo проверить лежит ли число в выбранной области

import java.util.Locale;
import java.util.Scanner;

public class Task1 {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        double eps = 1e-5;
        if (x - 2 < eps && y - x < eps && x * x + y * y - 4 > eps && x > 0 && y > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}



