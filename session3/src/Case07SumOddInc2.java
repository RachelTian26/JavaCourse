public class Case07SumOddInc2 {
    public static void main(String[] args) {
        System.out.println("Case 7：sum1toNumInc2 累加奇数");
        // 先用笔在 trace table 上推 num=5 和 num=10，
        // 再运行程序，对比手里的表和输出结果。
        System.out.println("num=5，结果：" + sum1toNumInc2(5));
        System.out.println("num=10，结果：" + sum1toNumInc2(10));
    }

    // for 循环三要素从上往下依次是：
    // 初始化 i=1、继续条件 i<=num、每次结束后增量 i=i+2。
    // i 每次增加 2，所以拿到的都是奇数。
    public static int sum1toNumInc2(int num) {
        // sum 先归零，随后一轮一轮累加。
        int sum = 0;
        for (int i = 1; i <= num; i = i + 2) {
            sum = sum + i;
        }
        // 循环结束时把最终答案送回 main 里使用。
        return sum;
    }
}
