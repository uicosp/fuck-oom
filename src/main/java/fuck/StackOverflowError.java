package fuck;

/**
 * 调整虚拟机参数：
 * -XX:+HeapDumpOnOutOfMemoryError
 * DUMP：否
 * 发生 StackOverflowError 时不会 dump，因为 HeapDumpOnOutOfMemoryError 仅在 OutOfMemoryError 时生效
 */
public class StackOverflowError {

    static int i = 0;

    public static void main(String[] args) {
        stackOverflowErrorTest();
    }

    private static void stackOverflowErrorTest() {
        i++;
        System.out.println("这是第 " + i + " 次调用");
        stackOverflowErrorTest();
    }
}
