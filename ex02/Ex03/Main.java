import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    double m=sc.nextInt();
        double s=sc.nextInt();
        double d=sc.nextInt();
        double mavg = (d / ((m / 60) + (s / 3600)))/1.6;
        System.out.printf("%.2f",mavg);
    }
}