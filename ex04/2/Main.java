import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        int[] monthArray= new int[13];
        int days=0;
        for (int i =1;i<monthArray.length;i++){
            switch (i){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    monthArray[i]=31;
                    break;
                case 4: case 6 : case 9: case 11:
                    monthArray[i]=30;
                default:
                    if (year %4 ==0 && year % 100 != 0 || year % 400 ==0) {
                        monthArray[i] = 29;
                    }else{
                        monthArray[i]=28;
                    }   
            }
        }
        while (month>=2){
            days=days+monthArray[month-1];
            month=month-1;
        }
        System.out.println(days + day);
    }
}