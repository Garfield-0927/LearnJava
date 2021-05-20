/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 17:36
 */

package www.learnjava.garfield.ch30;

public class PrintCharDemo implements Runnable{
    private char printedChar;

    public PrintCharDemo(char printedChar) {
        this.printedChar = printedChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(printedChar);
        }
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintCharDemo('a'));
        Thread thread2 = new Thread(new PrintCharDemo('b'));
        thread1.start();
        thread2.start();
    }
}
