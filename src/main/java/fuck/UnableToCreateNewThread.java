package fuck;

/**
 * 调整虚拟机参数：无需
 * DUMP：未确认
 */
public class UnableToCreateNewThread {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            System.out.println("i=" + i);
            new Thread(() -> {
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }, i + "").start();
        }
    }
}
