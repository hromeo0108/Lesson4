import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: за выигрыш - 3, за проигрыш - 0,за ничью - 1");
        int a = sc.nextInt();

        switch (a){
            case 3:
                System.out.println("выигрыш!");
                break;
            case 0:
                System.out.println("проигрыш!");
                break;
            case 1:
                System.out.println("ничья!");
                break;
            default:
                System.out.println("число должно быть 0,1,3");
        }
    }
}
