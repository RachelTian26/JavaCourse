public class Case03PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Case 3：正负数判断");

        // if 后面括号里是一个 boolean 条件。
        // 条件为 true 就执行 if 块；否则执行 else 块。
        int number = -6;
        if (number > 0) {
            System.out.println(number + " 是正数");
        } else {
            System.out.println(number + " 不是正数");
        }

    }
}
