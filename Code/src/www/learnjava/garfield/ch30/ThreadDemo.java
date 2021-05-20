/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 17:40
 */

package www.learnjava.garfield.ch30;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new PrintCharDemo2('a');
        Thread thread2 = new PrintCharDemo2('b');
        thread1.start();
        thread2.start();
    }

}

// 扩展类继承了Thread类
class PrintCharDemo2 extends Thread{
    private char printedChar;
    public PrintCharDemo2(char a){
        this.printedChar = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.printedChar);
        }
    }
}
