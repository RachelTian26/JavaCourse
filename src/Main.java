public class Main {
    public static void main(String[] args) {
        System.out.println("编程基础环境已就绪");

        int score = 72;
        if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        int total = 0;
        for (int i = 1; i <= 9; i += 2) {
            total = total + i;
        }
        System.out.println("1,3,5,7,9 的和是 " + total);
    }
}
