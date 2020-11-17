import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t,i = 0,sum = 0;
        t = num;
        while (t!=0) {
            sum = sum +t % 10;
            t = t /10;
            i++;
        }
        System.out.printf("%d %d\n",i,sum);
        }
    }
