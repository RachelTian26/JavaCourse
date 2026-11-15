public class Case04PassOrFail {
    public static void main(String[] args) {
        System.out.println("Case 4：及格判断");

        // >= 表示“大于或等于”。
        // 60 分及以上进 if，其余进 else。
        int score = 5;
        if (score >= 60) {
            System.out.println(score + " -> pass");
        } else {
            System.out.println(score + " -> nor pass");
        }
    }
}
