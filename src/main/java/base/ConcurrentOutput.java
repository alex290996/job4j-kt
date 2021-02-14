package base;

public class ConcurrentOutput {
    public static void main(String[] args) {
        Thread another = new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        );
        another.start();
        System.out.println(Thread.currentThread().getName());
    }
}

/** анонимный класс.
 * Thread another = new Thread(
 *         new Runnable() {
 *             @Override
 *             public void run() {
 *                 System.out.println(Thread.currentThread().getName())
 *             }
 *         }
 * );
 */
