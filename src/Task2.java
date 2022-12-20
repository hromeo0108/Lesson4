import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        int a = sc.nextInt();
        System.out.println("Введите сторону квадрата");
        int b = sc.nextInt();

        double crcl = 2 * Math.PI * a;
        double sqr = b * 4;

        if(crcl>sqr){
            System.out.println("площадь круга больше");
        }
        if(crcl<sqr){
            System.out.println("площадь квадрата больше");
        }
    }
}
