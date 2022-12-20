import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();

        if (a < b && b < c) System.out.println("неравенство a < b < c выполняется");
        if (b > a && a > c) System.out.println("неравенство b > a > c выполняется");
    }
}

