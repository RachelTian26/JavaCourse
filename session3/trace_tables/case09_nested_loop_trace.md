# Case 9 跟踪表：嵌套循环 3 x 3

外层 i 每走一轮，内层 j 都要从 1 重新跑到 3。

| i | i <= 3 | j | j <= 3 | output |
| --- | --- | --- | --- | --- |
| 1 | true | 1 | true | i=1, j=1 |
| 1 | true | 2 | true | i=1, j=2 |
| 1 | true | 3 | true | i=1, j=3 |
| 2 | true | 1 | true | i=2, j=1 |
| 2 | true | 2 | true | i=2, j=2 |
| 2 | true | 3 | true | i=2, j=3 |
| 3 | true | 1 | true | i=3, j=1 |
| 3 | true | 2 | true | i=3, j=2 |
| 3 | true | 3 | true | i=3, j=3 |
| 4 | false | 0 | 未进入 | 结束外层循环 |

规律：总执行轮数 = 外层次数 x 内层次数，这里为 3 x 3 = 9 轮。
