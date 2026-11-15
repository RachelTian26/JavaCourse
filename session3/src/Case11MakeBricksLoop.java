public class Case11MakeBricksLoop {
    public static void main(String[] args) {
        System.out.println("Case 11：makeBricksLoop 大小砖拼长度");
        // 小砖长度 1，大砖长度 5。
        // small 是小砖数量，big 是大砖数量，goal 是要拼出的总长度。
        System.out.println("makeBricks(3, 1, 8) -> " + makeBricks(3, 1, 8));
        System.out.println("makeBricks(3, 1, 9) -> " + makeBricks(3, 1, 9));
        System.out.println("makeBricks(3, 2, 10) -> " + makeBricks(3, 2, 10));
        makeBricks(10, 2, 18);
        makeBricks(1, 6, 18);

    }

    // 用循环把“大砖用 0 块、1 块、2 块……”每种方案都试一遍。
    public static boolean makeBricks(int small, int big, int goal) {
        for (int usedBig = 0; usedBig <= big; usedBig = usedBig + 1) {
            // left 是扣掉大砖之后，还需要多少长度。
            int left = goal - usedBig * 5;
            // 剩余长度不为负，并且小砖足够，就说明这个方案可行。
            if (left >= 0 && left <= small) {
                return true;
            }
        }
        // 所有方案都试完仍不行，返回 false。
        return false;
    }
}
