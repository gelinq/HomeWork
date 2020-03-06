import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Введите число ступеней пирамиды:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
//        while (n!=0){
//            for (int i=0; i<k; i++){
//                System.out.print("");
//            }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('1');
            }
            System.out.print('\n');
            //сначала выводим пробелы - n-i
            //Потом выводим единицы
            //вставляем символ переноса строки

        }
//        for (int i = 0 ; i < 10; i++){
//            if(i == 3){
//                continue;
//            }
//            if(i == 8){
//                break;
//            }
//            System.out.println(i);
//        }
    }
}

