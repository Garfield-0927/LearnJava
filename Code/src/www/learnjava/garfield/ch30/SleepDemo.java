/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 21:45
 */

package www.learnjava.garfield.ch30;

public class SleepDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println('a');
            if (i>50){
                // 处于阻塞状态（如在睡眠，在wait，在执行阻塞式IO）的线程，
                // 如果被其他线程打断（即处于阻塞的线程的interupt方法被其它线程调用），
                // 会抛出InterruptedException，是一个必检异常
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
