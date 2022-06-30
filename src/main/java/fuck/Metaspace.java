package fuck;

import javassist.ClassPool;

/**
 * 查看默认参数
 * -XX:+PrintFlagsInitial
 * -XX:+PrintFlagsFinal
 * 调整虚拟机参数：
 * -XX:MaxMetaspaceSize=20m -XX:+HeapDumpOnOutOfMemoryError
 * DUMP：是
 */
public class Metaspace {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100_000_000; i++) {
            generate("org.example.fuck.Demo" + i);
//            Thread.sleep(1000);
        }
    }

    public static Class<?> generate(String name) throws Exception {
        System.out.println(name);
        ClassPool pool = ClassPool.getDefault();
        return pool.makeClass(name).toClass();
    }
}
