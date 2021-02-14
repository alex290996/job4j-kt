package base;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println("Start loading ... ");
                        Thread.sleep(3000);
                        System.out.println("Loaded.");
                        int count = 0;
                        while (!Thread.currentThread().isInterrupted()) {
                            System.out.println(count++);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        thread.start();
        thread.interrupt(); // выставляем флаг прерывания. Это рекомендации о том, чтобы нить завершала свою работу.
        System.out.println("Main");
    }
}
