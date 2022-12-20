import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2-х значное число");
        int a = sc.nextInt();
        int doz = a / 10;
        int did = a % 10;
        int dozDiv = doz % did;
        int didDiv = did % doz;
        System.out.println("остаток от деления десятков на единицы: " + dozDiv);
        System.out.println("остаток от деления единицы на десятки: "+ didDiv);
    }
}
