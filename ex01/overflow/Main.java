public class Main {

    public static void main(String[] args) {
	// 一个数据溢出的代码案例
        int i = Integer.MAX_VALUE; // 定义变量 i 获取其最大值
        int j = Integer.MAX_VALUE; // 定义变量 j 获取其最大值

        int k = i + j; // 变量 i + 变量 j
        System.out.println("i (" + i + ") + j (" + j + ") = k (" + k + ")");
        // 输入出两者的相加的和，输出过程中将两者获取的最大值都打印出来，放置于i() 或者 j() 以及 k()
        // 在溢出过程中没有任何报错，所以在进行数据计算时请注意数据是否会溢出，或者定义变量时，未来你给定义好的变量赋值时会不会溢出
    }
}
