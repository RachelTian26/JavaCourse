public class Case06NestedScore {
    public static void main(String[] args) {
        System.out.println("Case 6：嵌套 if 成绩分级");

        // 大分类：先看是否及格。
        // 小分类：及格的人里，再判断是否达到 90 分优秀线。
        int score = 92;
        if (score >= 60) {
            if (score >= 90) {
                System.out.println("优秀");
            } else {
                System.out.println("及格");
            }
        } else {
            System.out.println("fail");
        }

        // else 和最近的、还没配对的 if 是一组；
        // 阅读时用缩进看层级，不要只看括号。
        System.out.println("else 和最近的、还没配对的 if 成一对");
        System.out.println("条件互相独立时可改写为 else if，避免嵌套太深");
    }
}
