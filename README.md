# Fuck-OOM

记录一些常见的 OOM Demo，包括：

- Java heap space
- GC overhead limit exceeded
- Metaspace
- Direct buffer memory
- Unable to create new thread（未验证）
- StackOverflowError

## 关于 HeapDumpOnOutOfMemoryError

通常线上环境会配置该参数来实现 OOM 时自动 dump 文件，
其中比较有趣的是发生 Direct buffer memory OOM 时无法自动 dump heap，

根据官方说明：
> The -XX:+HeapDumpOnOutOfMemoryError command-line option tells the HotSpot VM to generate a heap dump when an
> allocation from the Java heap or the permanent generation cannot be satisfied.
>
> 见：[B.1.2 -XX-XX:+HeapDumpOnOutOfMemoryError Option](https://www.oracle.com/java/technologies/javase/clopts.html#gbzrr)
>
具体原因见 [为什么 Direct buffer memory OOM 没有 dump](./direct_buffer_memory.md)

另外 StackOverflowError 也无法 dump，因为 StackOverflowError 和 OutOfMemoryError 都继承自 VirtualMachineError，两者没有继承关系。

## 参考

- https://www.cnblogs.com/simon-1024/p/12221917.html