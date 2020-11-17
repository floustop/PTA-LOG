import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        if (M<N) { //保证 M > N , 否则 M 和 N 交换
            int t=M;
            M=N;
            N=t;
        }

        int x=M*N;
        int y=M*N;
        while (y!=0) {
            M=N;
            N=y;
            y=M%N;
        }
        System.out.printf("%d %d\n",N,x/N);
    }
}
