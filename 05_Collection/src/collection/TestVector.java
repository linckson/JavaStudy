package collection;

import java.util.List;
import java.util.Vector;

/**
 * Vector底层是用数组实现的List，相关的方法都加了同步检查，因此“线程安全,效率低”。 synchronized：同步标记。
 * @Author: LinZhiWei
 * @Date: 2020-07-06 17:46
 */
public class TestVector {
    public static void main(String[] args) {
        List<String> v = new Vector<>();
    }
}
