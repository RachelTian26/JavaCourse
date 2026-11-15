public class Case05ZeroEvenOdd {
    public static void main(String[] args) {
        System.out.println("Case 5：零、偶数、奇数");

        // 三个分支按顺序判断：
        // 1) 先排除 0；
        // 2) 再交给 isEven 判断是否是偶数；
        // 3) 最后剩下的就是奇数。
        int number = 18;
        if (number == 0) {
            System.out.println("0 不是奇数也不是偶数");
        } else if (isEven(number)) {
            System.out.println(number + " 是偶数");
        } else {
            System.out.println(number + " 是奇数");
        }
    }

    // isEven 把“是不是偶数”单独做成方法，主流程更容易读。
    // return 会把后面表达式的结果送回调用处。
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
