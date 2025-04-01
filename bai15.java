import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay/thang/nam: ");
        String ngayNhap = scanner.nextLine();
        String[] parts = ngayNhap.split("/");
        int ngay = Integer.parseInt(parts[0]);
        int thang = Integer.parseInt(parts[1]);
        int nam = Integer.parseInt(parts[2]);
        System.out.println("hom nay la ngay " + ngay+" thang " +thang+ " nam "+nam);
    }
}
