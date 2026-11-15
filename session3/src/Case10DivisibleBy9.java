public class Case10DivisibleBy9 {
    public static void main(String[] args) {
        System.out.println("Case 10：统计 1..num 能被 9 整除的个数");
        // 1 到 100 中能被 9 整除的有 9,18,27,...,99，共 11 个。
        System.out.println("num=100，个数：" + divisibleBy9(1000));
    }

    // count 是“计数器”：先归零，每发现一个答案就加 1。
    public static int divisibleBy9(int num) {
        int count = 0;
        for (int i = 1; i <= num; i = i + 1) {
            // 除以 9 余 0，说明能被 9 整除。
            if (i % 9 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
