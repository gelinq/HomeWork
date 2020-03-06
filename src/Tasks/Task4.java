package Tasks;
//https://informatics.mccme.ru/mod/statements/view3.php?id=11680&chapterid=112168#1
// TODO: 01.01.2020 считать оба числа
// todo проверить лежит ли число в выбранной области

import java.util.Locale;
import java.util.Scanner;

public class Task4 {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        double s = Math.abs(x);
        double c = (x * x) - 2;
        if ((y >= c) && (y <= s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}



