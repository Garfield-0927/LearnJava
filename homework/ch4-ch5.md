### 一、 填空题

1：假设 

String s1 = "Welcome to Java";

String s2 = s1;

String s3 = new String("Welcome to Java");

那么下面表达式的结果是什么？

(1) s1 == s2         <u>true</u>

(2) s1 == s3        <u>false</u>

(3) s1.equals(s2)     <u>true</u>

(4) s2.equals(s3)     <u>true</u>

(5) s1.compareTo(s2);   <u>0</u>

(6) s2.compareTo(s3);   <u>0</u>

(7) s1.charAt(0);     <u>W</u>

(8) s1.indexOf('j');    <u>-1</u>

(9) s1.indexOf("to");   <u>8</u>

(10) s1.lastIndexOf("o",15)  <u>9</u>

(11) s1.substring(3, 11);  <u>come to</u>

(12) s1.endsWith("Java")   <u>true</u>

(13) s1.startsWith("wel"); <u>false</u>

(14) "  We come ".trim(); <u>We come</u>

(15) s1.toUpperCase();  <u>WELCOME TO JAVA</u>

(16) s1.replace('o', 'T');  <u>WelcTme tT Java</u>

 

  2．如果

StringBuffer s1 = new StringBuffer("Java");

StringBuffer s2 = new StringBuffer("HTML");

假设下列每个语句是独立的，每条语句结束后，写出相应结果

(1) s1.append(" is fun");    s1为_______Java is fun_______

(2) s1.append(s2);        s1为_______JavaHTML___

(3) s1.insert(2, "is fun");    s1为_______Jais funva_____

(4) s1.insert(1,s2);       s1为_______JHTMLava_________

(5) char c = s1.charAt(2);    c为________v______________

(6) int i = s1.length();     i为________4______________

(7) s1.deleteCharAt(3);      s1为_______Jav______________

(8) s1.delete(1,3);        s1为_______Ja______________

(9) s1.reverse();         s1为________avaJ_____________

(10) s1.replace(1,3, "Computer"); s1为  _  JComputera__________

(11) String s3 = s1.substring(1,3); 

s3为_________av______________，s1为____________Java_______________

(12) String s4 = s1.substring(2);    

S4为____________va___________，s1为________________Java___________

  

 

 

3. 假设StringBuffer s = new StringBuffer("Welcome to JAVA");

将s的内容清空的语句是__________ s.delete(0,s.length());

________。

 

  4.如果

String s1 = "Welcome";
String s2 = new String("Welcome");
String s3 = s2.intern();
String s4 = "Wel" + "come";
String s5 = "Wel";
String s6 = "come";
String s7 = s5 + s6;
String s8 = "Wel" + new String("come");

那么下面表达式的结果为：

（1）s1 == s2   ____false________

（2）s1 == s3   ____true________

（3）s1 == s4   ____true________

（4）s1 == s7   ____false________

（5）s1 == s8   ____true________

（6）s1.equals(s2)    ___true_________

（7）s1.equals(s3)    ____true________

（8）s1.equals(s4)    ____true________

（9）s1.equals(s7)    ____true________

（10）s1.equals(s8)   ____true________

 

 

### 二、单项选择题

1．可以获取字符串s的最后一个字符的表达式是___C_____。

（A）s.length() 

（B）s[s.length() - 1] 

（C）s.charAt(s.length() - 1) 

（D）charAt(s, length(s))

 

2. 下面程序 

```java
class C { 
	public static void main(String[] args) { 
		String s = "null" ;
		if(s == null) 
			System.out.print(“a”);
		else if(s.length() == 0) 
			System.out.print(“b”); 
		else 
			System.out.print(“c”); 
	} 
} 
```

的输出为___C_____。 

（A）a                （B）b 

（C）c                （D）null

 

3. 下面的程序

```java
class C { 
	public static void main(String[] args) { 
		String s = “Welcome to ”; 
		concat(s); 
		System.out.print(s); 
	} 

	public static void concat(String s) { 
		s += “Java”; 
	} 

} 
```





的输出为 ____A______。 

（A）Welcome to         （B）Welcome to Java 

（C）编译错误           （D）运行时异常

 

 

### 三、编程题

1：编写程序，从控制台或对话框任意输入一个英文字符串，统计字符串中每个英文字母出现的次数并输出到控制台（大小写不敏感）。

```java
public static void main(String[] args) {
        // 字符串输入
        String str;
        str = new Scanner(System.in).next();

        // 字符串处理
        // 1. 变成小写
        // 2. 转换为char数组进行排序
        str.toLowerCase();
        char[] str2 = str.toCharArray();
        Arrays.sort(str2);

        // 处理输出
        int count = 1;
        int i = 1;
        for (; i < str2.length; i++) {
            if (i == (str2.length - 1)) {
                if (str2[i] == str2[i - 1]) {
                    System.out.println(str2[i - 1] + " " + ++count);
                } else {
                    System.out.println(str2[i - 1] + " " + count);
                    System.out.println(str2[i] + " " + 1);
                }
            } else {
                if (str2[i] == str2[i - 1]) {
                    count++;
                } else {
                    System.out.println(str2[i - 1] + " " + count);
                    count = 1;
                }
            }
        }
    }
```



2：假设一个车牌号码由三个大写字母和后面的四个数字组成。编写一个程序. 随机生

成5个不重复的车牌号码。

```java
    public static void main(String[] args) {
        String[] res = new String[]{"", "", "", "", ""};
        for (int i = 0; i < 5; i++) {
            StringBuffer str = generateLicense();
            res[i] = str.toString();
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (res[j].toString().equals(res[i].toString())) {
                        i--;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(res[i]);
        }

    }


    public static StringBuffer generateLicense() {
        char c1 = (char) (int) (Math.random() * 26 + 65);
        char c2 = (char) (int) (Math.random() * 26 + 65);
        char c3 = (char) (int) (Math.random() * 26 + 65);
        char c4 = (char) (Math.random() * 10 + '0');
        char c5 = (char) (Math.random() * 10 + '0');
        char c6 = (char) (Math.random() * 10 + '0');
        char c7 = (char) (Math.random() * 10 + '0');

        StringBuffer str = new StringBuffer();
        str.append(c1).append(c2).append(c3).append(c4).append(c5).append(c6).append(c7);
        return str;
    }
```