import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();

        if(Math.pow(b,2) < a){
            b = b * 5;
            System.out.println(b);
        } else System.out.println("квадратный корень из второго числа больще первого числа");
    }
}
