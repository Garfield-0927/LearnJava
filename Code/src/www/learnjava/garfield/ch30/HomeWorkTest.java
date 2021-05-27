/**
 * @author：Garfield
 * @date ：Created in 2021/5/27 20:30
 */

package www.learnjava.garfield.ch30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWorkTest {
}


class Holder {
    private int data = 0;

    public int getData() {
        return data;
    }

    public synchronized void inc(int amount) {
        int newValue = data + amount;
        try {
            System.out.println("IncThread sleep");
            Thread.sleep(5000);
            System.out.println("IncThread awake");
        } catch (InterruptedException e) {
        }
        data = newValue;
    }

    public void dec(int amount) {
        int newValue = data - amount;
        try {
            System.out.println("DecThread");
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        data = newValue;
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Holder holder = new Holder();
        int incAmount = 10, decAmount = 5, loops = 100;
        Runnable incTask = () -> holder.inc(incAmount);
        Runnable decTask = () -> holder.dec(decAmount);
        for (int i = 0; i < loops; i++) {
            es.execute(incTask);
            es.execute(decTask);
        }
        es.shutdown();
        while (!es.isTerminated()) {
        }
    }
}


class Test2_3 {

    private static Object lockObject = new Object();

    /**
     * \* 计数器
     */
    public static class Counter {
        private int count = 0;

        public int getCount() {
            return count;
        }

        public void inc() {
            synchronized (lockObject) {
                int temp = count + 1;
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
                count = temp;
            }
        }

        public void dec() {
            synchronized (lockObject) {
                int temp = count - 1;
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
                count = temp;
            }
        }
    }


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        int loops1 = 10, loops2 = 5;
        Runnable incTask = () -> counter1.inc();
        Runnable decTask = () -> counter2.dec();
        for (int i = 0; i < loops1; i++) {
            es.execute(incTask);
        }
        for (int i = 0; i < loops2; i++) {
            es.execute(decTask);
        }
        es.shutdown();
        while (!es.isTerminated()) {
        }
    }
}


class Test2_4 {
    public static class Resource {
        private int value = 0;

        public int sum(int amount) {
            int newValue = value + amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
            return newValue;
        }

        public int sub(int amount) {
            int newValue = value - amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
            return newValue;
        }
    }


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Resource r = new Resource();
        int loops1 = 10, loops2 = 5, amount = 5;
        Runnable sumTask = () -> r.sum(amount);
        Runnable subTask = () -> r.sub(amount);
        for (int i = 0; i < loops1; i++) {
            es.execute(sumTask);
        }
        for (int i = 0; i < loops2; i++) {
            es.execute(subTask);
        }
        es.shutdown();
        while (!es.isTerminated()) {
        }
    }
}

class Test2_5 {

    public static class Resource {
        private static int value = 0;

        public static int getValue() {
            return value;
        }

        public static void inc(int amount) {
            synchronized (Resource.class) {
                int newValue = value + amount;
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
                value = newValue;
            }
        }

        public synchronized static void dec(int amount) {
            int newValue = value - amount;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
            }
            value = newValue;
        }

    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        int incAmount = 10, decAmount = 5, loops = 100;
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Runnable incTask = () -> r1.inc(incAmount);
        Runnable decTask = () -> r2.dec(decAmount);
        for (int i = 0; i < loops; i++) {
            es.execute(incTask);
            es.execute(decTask);
        }
        es.shutdown();
        while (!es.isTerminated()) {
        }
    }
}


//class p3 {
//    public static void main(String[] args) {
//        Thread t1 = new T1();
//        Thread t2 = new T2();
//        Thread t3 = new T3();
//
//        try {
//            t1.start();
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            t2.start();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            t3.start();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
