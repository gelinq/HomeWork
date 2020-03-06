package Tasks;
//https://informatics.mccme.ru/mod/statements/view3.php?id=11680&chapterid=112169#1
// TODO: 01.01.2020 считать оба числа
// todo проверить лежит ли число в выбранной области

import java.util.Locale;
import java.util.Scanner;

public class Task9 {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        double s = Math.abs(y);
        double c = (x * x) + (y * y);
        if ((c <= 1) || ((x>=0) && (x<=1)) && ((y>=0) && (y<=1))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}



