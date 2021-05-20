/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 21:43
 */

package www.learnjava.garfield.ch30;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println('a');
            Thread.yield(); // 挂起进入ready，给其他进程调度机会
        }
    }

}
