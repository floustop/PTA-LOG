import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A=0,E=0;
        int Max;
        Scanner sc=new Scanner(System.in);
        Max = sc.nextInt();
        for (int i =1;i <=Max;i++){
            if (i%3 ==0) {
                if (i%2 ==0) {
                    E++;
                } else A++;
            }
        }
        System.out.println(A+","+E);
    }
}