import java.util.Scanner;

class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so:");
        int a = sc.nextInt(); int b = a;
        int j=0;
        while (a%10!=0) {
            a=(a-(a%10))/10;
            j=j+1;
        }  
        int j2=j;
        boolean KQ = true;
        for (int i =1; i<=j2/2; i++){
            j=j-1;
            double x= b%Math.pow(10,i);
            double y= b/Math.pow(10,j);
            double tam= (b%((int)y*Math.pow(10,j)));
            b = ((b-(int)x)/10);
            b = (int) tam;
            System.out.println(b);
            if (((int)x)==((int)y)){
                KQ = true;
            }    
            else 
            {
                KQ = false;
                break;
            }
        }    
        System.out.println(KQ);
    }
}
