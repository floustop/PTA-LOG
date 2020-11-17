import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int F,C;
        Scanner sc=new Scanner(System.in);
        F = sc.nextInt();
        C = 5 * (F - 32)/9;
        System.out.printf("Celsius = %d",C);
    }

}

