import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4个整数。");
        int[] numbs= new int[5];
        int max = numbs[0];
        for (int i = 1; i<numbs.length; i++) {
            System.out.print("整数"+i+":");
            numbs[i] =sc.nextInt();
            if (numbs[i]>max) max=numbs[i];
        }
        System.out.println("最大值是："+max+"。");
    }
}