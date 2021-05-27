1. 给定编译好的Java程序，**请在控制台运行**下面编译好的类：

（1） Welcome类，该文件位于package homework.ch1里

（2） 运行run.jar里面的Welcome类，该文件位于package homework.ch1里。

其中，Welcome类和run.jar所在的相对目录结构下图所示：

![image-20210525192006627](..\assets\image-20210525192006627.png)

（3）要求提交控制台运行的脚本文件

```bash
set JAVA_HOME=D:\codeLanguage\jdk-13.0.2
set PROJECT_HOME=D:\garfield\study\大二下\java\LearnJava\homework\第1章作业\chapter1
set path=%path%;%JAVA_HOME%\bin
set classpath=%classpath%;%PROJECT_HOME%\jar\run.jar

java -classpath %classpath% homework.ch1.Welcome
```

