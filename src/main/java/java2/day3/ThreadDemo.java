package java2.day3;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from main");
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt();
//        thread.setDaemon(true);

        System.out.println("Main finished");
    }
}
