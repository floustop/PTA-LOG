    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String time=sc.nextLine();
            int hour=Integer.parseInt(time.substring(0,2));
            int min=Integer.parseInt(time.substring(3,5));
            if (hour>12 && hour<24) {
                System.out.printf("%02d:%02d PM\n", hour-12, min);
            } else if(hour>=0&&hour<12||hour==12&&min==00) {
                System.out.printf("%02d:%02d AM\n", hour, min);
            } else System.out.printf("%02d:%02d PM\n", hour, min);
        }
    }