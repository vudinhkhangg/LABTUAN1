import java.util.Scanner;

class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so:");
        int a = sc.nextInt();
        int i=0;
        while (a%10!=0) {
            a=(a-(a%10))/10;
            i=i+1;
        }    
        System.out.println("do la so co "+i+" chu so");
    }
}
