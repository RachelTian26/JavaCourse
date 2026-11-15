public class Case09NestedLoopTable {
    public static void main(String[] args) {
        System.out.println("Case 9：嵌套循环");
        System.out.println("先打印 1..3 和 1..3 的 9 种组合：");

        // 外层 i 每走一轮，内层 j 都要从 1 重新跑到 3。
        // 所以总共不是 3 + 3 次，而是 3 x 3 = 9 次。
        for (int i = 1; i <= 3; i = i + 1) {
            for (int j = 1; j <= 3; j = j + 1) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("九九乘法表：");
        // 外层 i 是乘号右边的行号，内层 j 是列号。
        // 条件 j <= i 让每一行只打印到 i 列，形成三角形。
        for (int i = 1; i <= 9; i = i + 1) {
            for (int j = 1; j <= i; j = j + 1) {
                // print 不换行，同一行可以连续输出多列。
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            // 内层跑完一行后，用空 println 换到下一行。
            System.out.println();
        }
    }
}
