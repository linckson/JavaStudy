package collection;

/**
 * ArrayList采用数组扩容的方式
 * 自定义实现ArrayList*
 * Vector 相关方法都加了同步检查synchronized，不存在线程安全问题时，一般用ArrayList
 * @Author: LinZhiWei
 * @Date: 2020-07-04 9:18
 */
public class TestArrayList<E> {
    public static void main(String[] args) {
        TestArrayList tal = new TestArrayList(20);
        tal.add("A");
        tal.add("B");
        //System.out.println(tal); //直接打印为类名加地址，建议重写toString()
        System.out.println(tal.toString());
    }


    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 默认构造器，初始容量10
     */
    public TestArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 含参构造器
     * @param capacity
     */
    public TestArrayList(int capacity){
        elementData = new Object[capacity];
    }

    /**
     * 添加函数
     * @param obj
     */
    public void add(Object obj){
        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
}
