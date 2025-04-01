import java.util.Scanner;

class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem 5 mon ly, hoa, sinh, toan, may tinh ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double TL = (a+b+c+d+e)/5*10;
        if (TL<40) System.out.println("Hang F");
        else if (TL>40) System.out.println("Hang E");
        else if (TL>60) System.out.println("Hang D");
        else if (TL>70) System.out.println("Hang C");
        else if (TL>80) System.out.println("Hang B");
        else if (TL>90) System.out.println("Hang A");
    }
}
