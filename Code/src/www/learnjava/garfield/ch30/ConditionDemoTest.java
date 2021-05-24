/**
 * @author：Garfield
 * @date ：Created in 2021/5/21 17:54
 */

package www.learnjava.garfield.ch30;

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

        }
    }

}
