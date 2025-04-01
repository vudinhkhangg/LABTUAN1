import java.util.Scanner;

class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so:");
        int a = sc.nextInt();
        int i=10;
        while (a/i!=0) i=i*10;
        System.out.println("chu so dau tien la "+a/(i/10)+" chu so cuoi cung la "+a%10);
    }
}
