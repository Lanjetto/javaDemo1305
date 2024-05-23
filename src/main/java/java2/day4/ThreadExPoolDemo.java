package java2.day4;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 5.	Создайте свою аннотацию Repeat с целочисленным параметром.
 * Расширьте класс  ThreadPoolExecutor и переопределите метод execute следующим образом: если экземпляр Runnable имеет аннотацию Repeat, то его метод run выполняется несколько раз (количество задается параметром в Repeat).
 */
public class ThreadExPoolDemo extends ThreadPoolExecutor {
    public ThreadExPoolDemo(int corePoolSize) {
        super(corePoolSize, corePoolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    }

    @Override
    public void execute(Runnable command) {

        if (command.getClass().isAnnotationPresent(Repeat.class)) {
            int value = command.getClass().getAnnotation(Repeat.class).value();
            for (int i = 0; i < value; i++) {
                super.execute(command);
            }
        } else
            super.execute(command);
    }

    public static void main(String[] args) {
        ThreadExPoolDemo threadExPoolDemo = new ThreadExPoolDemo(3);
        threadExPoolDemo.execute(new NewRunnable());
        threadExPoolDemo.shutdown();
    }
}
