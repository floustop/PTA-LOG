import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,num;
        for (int i = 1;; i++) { // 不定义 for 的循环条件实现死循环
            num=sc.nextInt();
            if (num%2!=0)
                sum=sum+num; // 计算奇数和
            if((num==0||num<0)&&num%2!=0) {
                sum=sum-num; // 此条件下 sum 需要将此时的 num 减掉
                break; // 并退出循环
            }
            if ((num==0||num<=0)&&num%2==0)
                break; // 此条件退出循环
        }
        System.out.println(sum);
    }
}
