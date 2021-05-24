/**
 * @author：Garfield
 * @date ：Created in 2021/5/21 16:44
 */

package www.learnjava.garfield.ch30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSync {
    private static Account account = new Account();
    private static Lock lock = new ReentrantLock();

    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            lock.lock();
            try {
                balance += amount;
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    private static class AddPennyTask implements Runnable {
        @Override
        public void run() {
            account.deposit(1);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i = 0; i < 100; i++){
            executor.execute(new AccountWithSync.AddPennyTask());
        }
        executor.shutdown();
        while(!executor.isTerminated()){  }
        System.out.println("What is balance?" + account.getBalance());
    }
}
