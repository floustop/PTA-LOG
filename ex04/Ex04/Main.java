import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char c=sc.next().charAt(0);
        int b=sc.nextInt();
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b!=0) {
                    System.out.println(a/b);
                } else System.out.println("ERROR");
                break;
            case '%':
                if (b!=0) {
                    System.out.println(a%b);
                } else System.out.println("ERROR");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}