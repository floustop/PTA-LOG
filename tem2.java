public class stu2 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++) {
            int num=0;
            for (int j=1;j<=i;j++) {
                num++;
                System.out.print(j*i+"\t");
                if (j==i) {
                    System.out.println();
                }
            }
        }
    }
}
