package fuck;

import java.util.ArrayList;
import java.util.List;

/**
 * 调整虚拟机参数：
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
 * DUMP：是
 */
public class GCOverheadLimitExceeded {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while (true) {
            list.add(String.valueOf(++i).intern());
            System.out.println(i);
        }
    }
}
