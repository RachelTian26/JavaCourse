public class Case08LoopWithIf {
    public static void main(String[] args) {
        System.out.println("Case 8：循环里嵌套 if 判断偶数奇数");

        // 循环负责“重复地走 1 到 10”，
        // if 负责“每轮判断当前 i 是偶数还是奇数”。
        for (int i = 1; i <= 10; i = i + 1) {
            // % 得到余数：能被 2 整除就是偶数。
            if (i % 2 == 0) {
                System.out.println("i=" + i + " -> is even");
            } else {
                System.out.println("i=" + i + " -> is odd");
            }
        }
    }
}
