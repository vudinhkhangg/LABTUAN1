import java.util.Scanner;

class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so do F can chuyen doi qua do C:");
        double oF = sc.nextDouble();
        double oC = (oF - 32) / 1.8;
        System.out.println(oF+" do F = "+ oC+" do C");
    }
}
