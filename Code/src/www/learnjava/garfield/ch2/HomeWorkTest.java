/**
 * @author：Garfield
 * @date ：Created in 2021/5/25 19:49
 */

package www.learnjava.garfield.ch2;

import java.util.Scanner;

public class HomeWorkTest {
    public static void main (String [] args) {
        int x = 1;
        System.out.print((x > 1) & (x++ > 1));
        System.out.print(" ");
        System.out.print((x > 1) && (x++ > 1));
    }

}
