package PracTest;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) throws Exception {

        ThreadFactory namedThreadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {

                return new Thread(r);
            }
        };
        Thread pre = Thread.currentThread();
        ExecutorService pool = new ThreadPoolExecutor(6, 200, 20000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        pool.execute(new TestThread_Runnable(pre));
        pool.execute(new TestThread_Runnable(pre));
        pool.execute(new TestThread_Runnable(pre));
        pool.execute(new TestThread_Runnable(pre));
        pool.execute(new TestThread_Runnable(pre));
        System.out.println("��ʼ");
        TestThread_Runnable.begin.countDown();
//        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());
        TestThread_Runnable.end.countDown();

        pool.shutdown();
    }
}
