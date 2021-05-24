/**
 * @author：Garfield
 * @date ：Created in 2021/5/21 17:54
 */

package www.learnjava.garfield.ch30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConditionDemoTest {
    private static ConditionDemo conditionDemo = new ConditionDemo();

    public static class DepositTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    conditionDemo.deposit((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class WithdrawTask implements Runnable{
        @Override
        public void run() {
            try {
                while (true) {
                    conditionDemo.withdraw((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ConditionDemo conditionDemo = new ConditionDemo();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new DepositTask());
        executor.execute(new WithdrawTask());
        System.out.println("Thread1\t\t\tThread2\t\t\t\tBalance");
    }
}
