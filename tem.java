import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt(),n=0;
        int X,Y,Z;

        while (n!=100){
            x++;
            y++;
            z++;
            n++;
            X=x%10;
            Y=y%10;
            Z=z%10;
            if(X==3||X==6||X==9){
                if(Y!=X&&(Y==3||Y==6||Y==9)){
                    if(Z!=X&&Z!=Y&&(Z==3||Z==6||Z==9)){
                        System.out.printf("%d",n);
                        break;
                    }
                }
            }

            if(n==100){
                System.out.println("so sad!");
            }
        }
    }
}
