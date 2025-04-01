import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi:");
        String chuoi = scanner.nextLine();
        String[] sotu = chuoi.trim().split("\\s+");
        System.out.print("so tu trong chuoi la: "sotu.length);
    }
}
