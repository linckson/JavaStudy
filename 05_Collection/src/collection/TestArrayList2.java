package collection;

/**
 * ArrayList采用数组扩容的方式
 * 自定义实现ArrayList*
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-04 9:18
 */
public class TestArrayList2<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    /**
     * 默认构造器，初始容量10
     */
    public TestArrayList2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 含参构造器
     *
     * @param capacity
     */
    public TestArrayList2(int capacity) {
        elementData = new Object[capacity];
    }

    /**
     * 添加函数
     * 要添加更多的元素就得写成可扩容型。扩容：通过System.arraycopy(src,srcPos,dest,destPos,length)实现
     *
     * @param element
     */
    public void add(E element) {
        // elementData[size++] = obj;
        if (size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            // +优先级大于>>,要括号括起来
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;//把newArray的地址直接赋给elementData，老数组对象内容会被垃圾回收
        }
        elementData[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        TestArrayList2 tal = new TestArrayList2(20);

        for (int i = 0; i < 400; i++) {
            tal.add("hello" + i);
        }
        System.out.println(tal);
    }
}
