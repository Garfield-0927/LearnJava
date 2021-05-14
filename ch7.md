# Chapter 7 数组

### 7.1 基础

定义：数组是相同类型的集合。

初始化：通过 new 关键字初始化，凡使用new后，内存单元都初始化为0或者null或者false或者'\u0000'。

注意：声明数组引用变量并不分配数组内存空间，必须通过new实例化数组来分类数组内存空间。



### 7.2 数组的复制

​		由于数组是引用类型，通过赋值语句不能实现对数组的深拷贝，因此复制数组的方法有以下几个：

- 使用循环来赋值每一个元素
- 使用`System.arraycopy`，前提：两个数组都与先实例化了

- 使用数组的clone方法复制，被复制的数组变量可以没有实例化。



### 7.5 可变长参数

​		在方法中，最后一个形参可以设置成可变长参数，表示形参个数不定，java可以将可变长参数当作数组看待。

```java
public class VariableLengthParameter {
    public static void main(String[] args) {
        System.out.println(VariableLengthParameter.sum(1,2,3,4,5,6,67,78));
    }
    public static int sum(int n1, int n2, int... n3) {
        int s = 0;
        s += n1;
        s += n2;
        for (int i : n3) {
            s += i;
        }
        return s;
    }
}
```

​		上例中我们可以看到sum方法看似形参只有3个，但实际上可以传大于3个的任意个数的参数，这就是可变长参数，实际上就是数组的变形，我们可以通过for循环遍历可变长参，也可以通过 length 方法获取可变长参数的长度。



### 7.6 数组的查找和排序

#### 7.6.1 查找

- 线性搜索：顺序遍历，最坏情况下比较N次，平均比较N/2，时间复杂度为O(N)
- 二分查找：在一个已排序好的数组中进行查找，时间复杂度为O(logN)

```java
    public static int binarySearch(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
```

#### 7.6.2 排序

- 选择排序
- 冒泡排序
- .......



### 7.7 Arrays类

​		java.util.Arrays类中实现了常见的排序和搜索方法，我们可以直接调用API即可

```java
        int[] a = new int[]{3,4,2,8,5,6,956,345,5645};
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, 956);
        System.out.println(Arrays.toString(a));	// [2, 3, 4, 5, 6, 8, 345, 956, 5645]
        System.out.println(index);	// 7
```



### 7.8 命令行参数

​		我们可以从命令行向java程序传递参数。参数以空格分隔，如果参数本身包含空格，可以用双引号括起来。

格式：`java 类名 参数1 参数2`

例子：`java TestMain "First Arg" aaa 123`

​		命令行参数对应的就是main方法中的`String[] args`，可以通过访问args来实现对每个参数的访问。



### 7.9 多维数组

声明二维数组引用变量：`dataType[][] refVar;  `

​		创建数组并赋值给引用变量：当指定了行、列大小，是矩阵数组（每行的列数一样）。非矩阵数组则需逐维初始化。

 ` refVar = new dataType[rowSize][colSize];` （这时元素初始值为0或null)

