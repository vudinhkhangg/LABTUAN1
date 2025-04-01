import java.util.Scanner;

class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam:");
        int a = sc.nextInt();
        if (a%4==0 && (a%100!=0||a%400!=0))
            System.out.println(a+" la nam nhuan");
        else
            System.out.println(a+ " la nam khong nhuan");
    }
}
