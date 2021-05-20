/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 21:46
 */

package www.learnjava.garfield.ch30;

public class JoinDemo extends Thread{
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintChar('a'));
        Thread threadB = new Thread(new PrintChar('b'));
        threadA.start();        // 启动线程A
        try {
            threadA.join();     // 主线程被阻塞，等待线程A执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();        // 主线程被唤醒，启动线程B
    }
}
class PrintChar implements Runnable{
    private char printedChar;

    public PrintChar(char printedChar) {
        this.printedChar = printedChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(printedChar);
        }
    }

}