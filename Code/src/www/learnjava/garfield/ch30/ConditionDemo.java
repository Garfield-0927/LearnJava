/**
 * @author：Garfield
 * @date ：Created in 2021/5/21 17:45
 */

package www.learnjava.garfield.ch30;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
    private static Lock lock = new ReentrantLock();     // 创建lock对象
    private static Condition condition = lock.newCondition();       // 创建lock的Condition对象
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        lock.lock();        // 获取锁
        try {
            // while循环{ //必须是while， 不能用if
            // 只要余额小于取钱数额，就调用condition.wait，使得当前线程（进入withDraw方法的线程）被挂起；
            // 如果当前线程被唤醒，如果余额还小于取钱数额，继续等待
            // }
            // 当执行到while循环的下一条语句，余额一定>=取钱数额
            // condition.wait会导致当前线程被挂起同时锁被释放（和sleep不一样），否则存钱线程永远没机会进入deposit方法
            while (balance < amount) {
                System.out.println("\t\t\t\tWaiting for deposit");
                condition.await();
            }
            balance -= amount;
            System.out.println("\t\t\t\tWithdraw " + amount + "\t\t\t\t" + getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void deposit(int amount) {
        lock.lock();

        try {
            balance += amount;
            System.out.println("deposit" + amount + "\t\t\t\t\t\t\t\t" + getBalance());
            // 进入deposit的是另外一个线程，往账户存钱后，
            // 调用newDeposit.signalAll去唤醒所有因调用condition.wait而被挂起的线程（二者配套使用）
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
