import java.util.Scanner;

class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so:");
        int a = sc.nextInt(); int b=a;
        int tong =a%10; int tich =a%10;
        for (int i=1; i<=a; i++) {
            a=(a-(a%10))/10;
            if (a%10==0) break;
            tich=tich*(a%10);
        }
        for (int i=1; i<=b; i++) {
            b=(b-(b%10))/10;
            tong=tong+(b%10);
            if (b%10==0) break;
        }
        System.out.println("tong cac so la "+tong);
        System.out.println("tich cac so la "+tich);
    }
}
