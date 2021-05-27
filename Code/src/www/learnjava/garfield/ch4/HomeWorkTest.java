/**
 * @author：Garfield
 * @date ：Created in 2021/5/26 18:02
 */

package www.learnjava.garfield.ch4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTest {
    //    public static void main(String[] args) {
//        // 字符串输入
//        String str;
//        str = new Scanner(System.in).next();
//
//        // 字符串处理
//        // 1. 变成小写
//        // 2. 转换为char数组进行排序
//        str.toLowerCase();
//        char[] str2 = str.toCharArray();
//        Arrays.sort(str2);
//
//        // 处理输出
//        int count = 1;
//        int i = 1;
//        for (; i < str2.length; i++) {
//            if (i == (str2.length - 1)) {
//                if (str2[i] == str2[i - 1]) {
//                    System.out.println(str2[i - 1] + " " + ++count);
//                } else {
//                    System.out.println(str2[i - 1] + " " + count);
//                    System.out.println(str2[i] + " " + 1);
//                }
//            } else {
//                if (str2[i] == str2[i - 1]) {
//                    count++;
//                } else {
//                    System.out.println(str2[i - 1] + " " + count);
//                    count = 1;
//                }
//            }
//        }
//    }
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

}
