import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=1,d=1;
        double sum=0,n=1.0,eps;
        eps=sc.nextDouble();
        if (eps>=1) {
            System.out.printf("sum = %.6f",n);
        } else {
            while (Math.abs(n)>eps) {
                n=f*1.0/d;
                sum=sum+n;
                d+=3;
                f=-f;
            }
            System.out.printf("sum = %.6f",sum);
        }
    }
}
