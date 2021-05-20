/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 21:53
 */

package www.learnjava.garfield.ch30;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建一个线程池，最大容量为3个
        ExecutorService es = Executors.newFixedThreadPool(3);
        // 提交runnable的任务给线程池
        es.execute(new PrintString("Thread A running"));
        es.execute(new PrintString("Thread B running"));
        es.execute(new PrintString("Thread C running"));
        // 关闭线程池
        es.shutdown();
    }
}

class PrintString implements Runnable{
    private String s;

    public PrintString(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(s);
        }
    }
}
