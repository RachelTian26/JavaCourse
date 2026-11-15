public class Case01Variables {
    public static void main(String[] args) {
        System.out.println("Case 1：基本数据类型");

        // 整数家族：byte < short < int < long，范围依次变大。
        // 不写 L 时，Java 默认把整数当 int 处理。
        // long 超出 int 范围时，结尾必须写 L。
        byte one = 127;
        short two = 32767;
        int age = 14;
        long phone = 13800000000L;

        // 小数家族：double 是默认类型；float 比 double 省空间，值后面要写 F。
        float price = 3.5F;
        double height = 1.65;

        // char 用单引号，只能装一个字符。
        // '\u5468' 是 Unicode 编码，实际是“周”这个汉字。
        char letter = 'A';
        char number = 52; // Unicode/ASCII 编码 52 对应字符 '4'
        char chinese = '\u5468';

        // String 不算基本类型，它属于对象类型，要用双引号。
        String word = "Hello~";

        // boolean 只有 true 和 false 两个值。
        boolean isPass = true;

        // 打印每个类型的取值范围，帮助理解 byte 为什么只能存到 127。
        System.out.println("byte 最大: " + Byte.MAX_VALUE);
        System.out.println("short 最大: " + Short.MAX_VALUE);
        System.out.println("int 最大: " + Integer.MAX_VALUE);
        System.out.println("long 最大: " + Long.MAX_VALUE);
        System.out.println("float price = " + price + "F");
        System.out.println("double height = " + height);
        System.out.println("char letter = " + letter);
        System.out.println("char 数字 52 = " + number);
        System.out.println("char Unicode: " + chinese);
        System.out.println("String word = " + word);
        System.out.println("boolean isPass = " + isPass);
        System.out.println("age = " + age);

        // 对象类型简介：先新建一个 Lesson 对象，再给它填数据。
        // 这里只是预习，后面课程会正式学习类和对象。
        Lesson lesson = new Lesson();
        lesson.name = "第三节";
        lesson.lessonNumber = 3;
        System.out.println("对象类型: " + lesson.name + "，第 " + lesson.lessonNumber + " 节");
    }
}

// 一个最简单的类：字段（属性）先声明，之后可以赋值。
class Lesson {
    String name;
    int lessonNumber;
}
