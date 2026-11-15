# Session 3：编程基础 Java 案例

## 第 1 小节：变量类型

- `src/Case01Variables.java`：基本数据类型、默认规则、char / String、对象类型简介
- `src/Case02Operators.java`：算术 / 关系 / 逻辑 / 赋值运算符，`==` 与 `=` 的区别

## 第 2 小节：选择分支

- `src/Case03PositiveNegative.java`：正负数判断
- `src/Case04PassOrFail.java`：及格 / 不及格
- `src/Case05ZeroEvenOdd.java`：零、偶数、奇数三分支
- `src/Case06NestedScore.java`：嵌套 if 成绩分级

## 第 3 小节：循环与 trace table

- `src/Case07SumOddInc2.java`：累加奇数
- `src/Case08LoopWithIf.java`：循环内嵌套 if
- `src/Case09NestedLoopTable.java`：嵌套循环与九九乘法表
- `src/Case10DivisibleBy9.java`：统计能被 9 整除的个数
- `src/Case11MakeBricksLoop.java`：大小砖拼长度

## 手写跟踪表

- `trace_tables/case07_sum_odd_trace.md`
- `trace_tables/case08_loop_if_trace.md`
- `trace_tables/case09_nested_loop_trace.md`

## 逐个运行

在 VS Code 中打开 `session3`，点开一个 `.java` 文件按 `F5`，或在终端：

```bash
cd session3
javac src/*.java -d out
java -cp out Case01Variables
java -cp out Case02Operators
java -cp out Case03PositiveNegative
```
