package fuck;

import java.nio.ByteBuffer;

/**
 * 调整虚拟机参数：
 * -Xms10m -Xmx10m -XX:MaxDirectMemorySize=5m -XX:+HeapDumpOnOutOfMemoryError
 * DUMP：否
 * 见：<a href="https://www.oracle.com/java/technologies/javase/clopts.html">B.1.2 -XX:+HeapDumpOnOutOfMemoryError Option</a>
 * The -XX:+HeapDumpOnOutOfMemoryError command-line option tells the HotSpot VM to generate a heap dump when an allocation from the Java heap or the permanent generation cannot be satisfied.
 */
public class DirectBufferMemory {
    public static void main(String[] args) {
        System.out.println("配置的 MaxDirectMemorySize:" + sun.misc.VM.maxDirectMemory() / (double) 1024 / 1024 + "MB");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
