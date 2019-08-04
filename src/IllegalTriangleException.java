import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh 1: ");
        int a = sc.nextInt();
        System.out.println("Nhap do dai canh 2: ");
        int b = sc.nextInt();
        System.out.println("Nhap do dai canh 3: ");
        int c = sc.nextInt();
        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
                int temp = 0 / 0;

            } System.out.println("Do dai 3 canh hop le");
        } catch (ArithmeticException e) {
            System.err.println("do dai 3 canh khong hop le");
        }


    }
}
