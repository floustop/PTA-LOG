import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=0,b=0,c=0,d=0,e=0;
        while (N-->0) {
            int score=sc.nextInt();
            int scoreNum=(int)score/10;
            switch (scoreNum) {
                case 10:
                case 9:
                    a++;
                    break;
                case 8:
                    b++;
                    break;
                case 7:
                    c++;
                    break;
                case 6:
                    d++;
                    break;
                default:
                    e++;
                    break;
            }
        }
        System.out.printf("%d %d %d %d %d",a,b,c,d,e);
    }
}
