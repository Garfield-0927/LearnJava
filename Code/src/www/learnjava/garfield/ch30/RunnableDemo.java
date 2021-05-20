/**
 * @author：Garfield
 * @date ：Created in 2021/5/20 17:30
 */

package www.learnjava.garfield.ch30;

public class RunnableDemo implements Runnable{
    public RunnableDemo(){
        // constructor function
    }

    @Override
    public void run() {
        // do something
    }

    public static void main(String[] args) {
        // 创建一个实现了Runnable接口的实例
        Runnable task = new RunnableDemo();
        // 创建一个线程，注意new Thread()中的参数必须是实现了Runnable接口的实例
        Thread thread1 = new Thread(task);
        // 启动线程，会执行task的run方法
        thread1.start();
    }
}
