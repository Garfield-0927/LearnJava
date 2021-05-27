### 一、填空

1. Java语言中有4种基本的整数类型，哪种类型所占的内存空间最小，写出定义该类型的关键字 <u>byte</u>。

2. Java语言中有4种基本的整数类型，哪种类型所占的内存空间最大，写出定义该类型的关键字 <u>long</u>。
3. Java中存在一种基本的数据类型，该类型定义的变量不能与其他类型转换，定义该类型用 <u>boolean</u>。

4. 布尔型定义的成员变量是有默认值的，它的值是 <u>false</u>。

5. 定义变量保存含有小数的数据时，使用 <u>double</u> 定义的变量精度比较高。

6. Java源程序经过编译后生成被称为 <u>字节码</u> 的特殊机器语言码，然后经过 <u>JVM（java虚拟机）</u> 解释运行。

7. 声明一个值为3.14的double型常量PI的语句为 `final double PI = 3.14;`。
8. 下列程序中，首先声明和初始化三个变量ch = ‘a’，变量d=0.1，变量 l =12L，并将该三个变量打印输出.请将程序补充完整.

```java
public class Assign{
	public static void main(String args[]){
			____char___ ch = ‘a’;
			___double____ d = 0.1;
			____long___ l = 12L;
			System.out.println("ch=" + __ch__);
			System.out.println("d=" + __d__);
			System.out.println("l=" + __l__);
	}
}

```

9. 执行下列语句后，变量x，y的值分别为  <u>x = 0, y =1</u>  ，原因是 <u>判断A&&B时，如果A为假，则B不去进行判断</u>。

```java
int x = 0, y = 0;
System.out.println( ((x > 1) && (++x == 0)) + " " + x);
System.out.println( ((y < 1) | (y++ == 0)) + " " + y);
```

10. 阅读下面代码

    以上代码错误的地方是 <u>switch内的变量不支持long类型，</u>
    
    <u>应该为</u>`int i = new Scanner(System.in).nextInt();`。

```java
System.out.print("Please input your choice[1,2]:");
 long i = new Scanner(System.in).nextLong();
 switch (i){
   case 1 :
     System.out.println("Your choice is 1");
     break;
   case 2 :
     System.out.println("Your choice is 2");
     break;
   default:
     System.out.println("Wrong choice");
 }
```



知识点总结：

- Java 4种基本的整数类型：`byte, short, int, long`，占用空间分别为1字节，2字节，4字节，8字节
- Java 2种基本浮点数类型：`float, double`，占用空间分别为4字节，8字节，默认值为`0.0f, 0.0d`
- Java 1种布尔类型：`boolean`，占用空间为1字节或者4字节，默认值为false
- Java 1种基本字符类型：`char`，占用空间为2字节
- Java 中用final关键字声明常量
- switch 语句中开关变量不能为long



### 二、选择

1．以下说法正确的是（A）。

***（A） Java中所有的方法都必须在类内定义***

（B） Java中主方法可以不在类内定义，其他方法都必须定义在类内 

（C） Java中主方法必须定义在类内，其他方法可以不必定义在类内      

（D） Java中所有方法都不必在类内定义



2. Java源文件和编译后的文件扩展名分别是（C）。

（A）.class 和 .java     （B）.class 和 .class  

***（C）.java 和 .class***      （D）.java 和 .java



3. 关于布尔类型说法正确的是 （A）。

***（A）boolean表示布尔类型，它的取值只有true和false***

（B）bool表示布尔类型，它的取值只有true和false  

（C）boolean表示布尔类型，它的取值只有1和0

（D）bool表示布尔类型，它的取值只有1和0



4. 下面表达式错误的是（B）。 

（A）int i = 100; 

***（B）float f = 100.0;*** 

（C）Object o = “Hello world”; 

（D）char c = ‘\u1234’;



5. 下面代码的输出是（A）。

```java
    public static void main (String [] args) {
        int x = 1;
        System.out.print((x > 1) & (x++ > 1));
        System.out.print(" ");
        System.out.print((x > 1) && (x++ > 1));
    }
```

***（A）false true*** 

（B）true false 

（C）false false 

（D）true true



6. 下列叙述中正确的是（A）。

***（A） Java语言的标识符是区分大小写的***

（B）Java源程序文件名可以任意命名

（C）Java源程序文件的扩展名为.jar

（D） 一个Java源程序文件里public类的数目不限

 

7. 下列标识符中，合法的是（A）。

***（A）_name***            （B） 4Person    

（C）public            （D） -3.1415



### 三、编程题

```java
public static int addAllDigits(int target){
    		int res = 0;        // result int
    		String target2 = "";
    		target2 = target2 + target;
    		char[] targetcopy = target2.toCharArray();
    		for (int i = 0; i<targetcopy.length; i++){
        		res+= ((int)targetcopy[i] - (int)'0');
    		}
    		return res;
}
```

