public class x9x9 {
    public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) { // 外层循环i，控制行数
                for (int k = 1; k < i; k++) { // 内层循环k，控制每行空格数
                    System.out.print("\t"); // 每行输出一个 \t 制表符[类似 TAB 按键]
                }
                for (int j = i; j <= 9; j++) { // 内层j，控制每行列数
                    System.out.print(+ i * j + "\t"); // "\t"转义字符，水平制表[即四个 Space]
                }
                System.out.println(); //每操作完一行换行
            }
    }
}()