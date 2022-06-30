package fuck;

/**
 * 调整虚拟机的参数：
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 * DUMP：是
 */
public class JavaHeapSpace {
    public static void main(String[] args) {
        byte[] bytes = new byte[30 * 1024 * 1024];
    }
}
