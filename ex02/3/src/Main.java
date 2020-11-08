import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数。");
        System.out.print("整数A：");
        int A=sc.nextInt();
        System.out.print("整数B：");
        int B=sc.nextInt();
        if (A>B) {
            System.out.println("A大于B。");
        } else if(A<B) {
            System.out.println("A小于B。");
        } else System.out.println("A和B相等。");
    }
}