# Java 编程基础练习环境

本目录已配置好 JDK 17 和 VS Code Java 运行环境。

第三节课程案例位于 `session3/`，详见 `session3/README.md`。

## 直接运行

在 VS Code 打开本目录后，按 `F5` 运行 `src/Main.java`。

也可以在终端里运行：

```bash
cd JavaCourse
javac src/Main.java -d out
java -cp out Main
```

## 已安装内容

- JDK：Eclipse Temurin 17.0.21（位于 `~/Library/Java/JavaVirtualMachines/temurin-17.jdk`）
- VS Code 扩展：Java Extension Pack、Language Support for Java、Debugger、Maven、Gradle
- 终端环境：`JAVA_HOME` 和 `PATH` 已加入 `~/.zshrc`
