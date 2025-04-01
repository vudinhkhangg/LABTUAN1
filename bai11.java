import java.util.Scanner;

class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so:");
        int a = sc.nextInt();
        int i=0; int b=0;
        while (a%10!=0) {
            b=(b*10)+(a%10);
            a=(a-(a%10))/10;
        }    
        System.out.println(b+"");
    }
}
