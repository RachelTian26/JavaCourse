# Case 8 跟踪表：循环内判断偶数奇数

循环变量 i 从 1 到 10，每次判断 `i % 2 == 0`。

| i | i <= 10 | i % 2 == 0 | output |
| --- | --- | --- | --- |
| 1 | true | false | is odd |
| 2 | true | true | is even |
| 3 | true | false | is odd |
| 4 | true | true | is even |
| 5 | true | false | is odd |
| 6 | true | true | is even |
| 7 | true | false | is odd |
| 8 | true | true | is even |
| 9 | true | false | is odd |
| 10 | true | true | is even |
| 11 | false | false | 结束循环 |
