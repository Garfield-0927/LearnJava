一、填空题

1. 当希望一个类中的成员不能在类的外部访问时，应使用_<u>private</u>__修饰符定义该成员。

2. 使用 <u>static</u>修饰符定义的类成员，可以通过类直接访问而不需要创建对象后再访问。

3. 类的中一个成员是一个类的对象时，如果该成员没有被初始化，则该对象的初始值是_<u>null</u>__。

4. 在类的非静态成员函数中，使用__<u>this</u> _关键字来表示当前调用该函数的对象。

5. 假设A为一个类，则执行A [] array = new A[10];语句时，一共调用 __<u>0</u>__ 次A的构造函数。

 

 

 

二、单项选择题

1. 下面关于构造函数的说法不正确的是___B__。

​    A. 构造函数的调用时机是实例化对象时

​    B. 一个类必须且只能定义一个构造函数

​    C. 一个类可以不定义构造函数

​    D. 构造函数一定要和类名相同, 并且不能有返回值

 

2. 下列哪个修饰符可以使在一个类中定义的成员变量只能被同一包中的类访问？ B    

   A．private        B．无修饰符        C．public        D．protected

 

3. 给出下列代码，如何使成员变量m 被方法fun（）直接访问__C__。

   ```java
   class Test {
      private int m;
      public static void fun（）
      {
              ...
      }
   }
   ```


   ​    A．将private int m 改为 protected int m
   ​    B．将private int m 改为 public int m
   ​    C．将private int m 改为 static int m
   ​    D．将private int m 改为 int m

 

4. 对于class A，如果在另一个包中的class B中，语句 A a = new A( ); a.m=10;成立，则下列定义正确的是  __C__。

A．class A { int m; }              B．class A {public int m; }

C．public class A{ public int m; }          D．public class A { int m; }

 

5. 关于下面程序，说法正确的是  __C__。

```java
class AA{
    private long i = 0;
    AA(int i){
       this.i =i;
    }
    String AA(long i) {
       this.i = i;
       return "i = " + this.i;
    }   
}

public class Test_1_6 {
    public static void main(String[] args) {       
       System.out.println(new AA(10).AA(20));
    }
}
```

A. 以上代码编译出错，一个类的构造函数不能有返回值；

B. 以上代码编译通过，输出结果为i = 10;

C. 以上代码编译通过，输出结果为i = 20;

D. 以上代码编译出错，一个类的构造函数不能重载；

 

6. 对于以下代码，说法正确的是__C__。A

```java
package homework.ch9.p1;
public class A {
  private int i = 0;
  protected int j = 0;
}

 
package homework.ch9.p2;
import homework.ch9.p1.A;
public class B extends A {
  public void m() {
    new A().j = 10;
    this.j = 10;
  }
}
```



A．new A().j = 10; 有编译错误，在方法m里无法访问new A().j ;this.j无编译错误，在方法m里可以访问this.j;          

B．new A().j = 10; 无编译错误，在方法m里可以访问new A().j ;this.j有编译错误，在方法m里不可以访问this.j;

C．new A().j = 10; 无编译错误，在方法m里可以访问new A().j ;this.j无编译错误，在方法m里可以访问this.j;     

D．new A().j = 10; 有编译错误，在方法m里不可以访问new B().j ;this.j有编译错误，在方法m里不可以访问this.j;

 

 

三、判断对错题

1. 若a是类A的实例化对象，且a.fun();能顺利执行，则函数fun一定是实例方法。( F )

2. protected修饰的类成员只能被其子类访问。( F )

3. 类的静态变量被该类的所有实例共享。( T )

4. **Double类型的变量是值类型。( F )** 

5. 当类的实例方法的形参变量与类的实例变量同名时，优先访问形参变量。( T )

 

 

四、阅读下列程序，写出输出结果：

```java
public class Circle{
    private double radius;
	public static int count = 0;
	public Circle(double r){
	    radius = r;
        count ++;
	}

	public Circle(){
 	   this(1.0);
	}

	public static void main(String[] args){
 	   Circle c1 = new Circle ();
 	   Circle c2 = new Circle (15.0);
 	   c1. count ++;
 	   c2. count ++;
  	  Circle. count ++;
    	System.out.println("count ="+ count);
	}
}
```

输出结果为 count =5