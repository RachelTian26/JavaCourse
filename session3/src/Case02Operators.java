public class Case02Operators {
    public static void main(String[] args) {
        System.out.println("Case 2：运算符");

        // 两个整数参与 / 时，Java 会做整数除法，结果只保留整数部分。
        int a = 7;
        int b = 3;

        // 算术运算符：+ - * / %
        // % 是取余数，例如 7 除以 3 余 1。
        System.out.println("算术: a + b = " + (a + b));
        System.out.println("算术: a - b = " + (a - b));
        System.out.println("算术: a * b = " + (a * b));
        System.out.println("算术: a / b = " + (a / b));
        System.out.println("算术: a % b = " + (a % b));

        // 关系运算符：判断结果是 boolean 类型，只有 true 或 false。
        // == 是“是否相等”，= 是“赋值”，不能混用。
        System.out.println("关系: a > b = " + (a > b));
        System.out.println("关系: a == b = " + (a == b));
        System.out.println("关系: a != b = " + (a != b));

        boolean raining = true;
        boolean cold = false;
        // && 表示“两边都为 true 才为 true”。
        // || 表示“只要一边为 true 就是 true”。
        // ! 是取反：true 变 false，false 变 true。
        System.out.println("逻辑: raining && cold = " + (raining && cold));
        System.out.println("逻辑: raining || cold = " + (raining || cold));
        System.out.println("逻辑: !raining = " + (!raining));

        // 赋值运算符：把右边算完的结果交给左边变量。
        int score = 80;
        score = score + 10;
        System.out.println("赋值: score 加 10 后 = " + score);

        // 条件判断最容易错的一步：== 是比较，= 是赋值。
        // if (tem == 30) 才是“tem 是否等于 30”。
        // if (tem = 30) 是“把 30 交给 tem”，判断结果永远为 true。
        int tem = 30;
        System.out.println("== 比较: tem == 30 = " + (tem == 30));
        System.out.println("如果把 == 错写成 =，会变成给 tem 赋值为 30，不再是比较");
        System.out.println("示例中的条件应写成 if (tem == 30)，不要写 if (tem = 30)");
    }
}
