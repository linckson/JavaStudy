package collection;

/**
 * ArrayList采用数组扩容的方式
 * 自定义实现ArrayList*
 * 增加set和get方法，以及数组边界的检查
 *
 *  增加remove
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-04 9:18
 */
public class TestArrayList5<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    /**
     * 默认构造器，初始容量10
     */
    public TestArrayList5() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 含参构造器
     *
     * @param capacity
     */
    public TestArrayList5(int capacity) {
        if(capacity < 0){
            throw new RuntimeException("容量不能为负数");
        }else if(capacity == 0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else{
            elementData = new Object[capacity];
        }

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
    /**
     * 增
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

    /**
     * 删
     * @param element
     */
    public void remove(E element){//按内容删除
       for(int i = 0; i < size; i++){
           if(element.equals(get(i))){
               remove(i);
           }
       }
    }
    public void remove(int index){//按索引删除
        checkRange(index);
        System.arraycopy(elementData,index+1,elementData,index,elementData.length-index-1);
        elementData[size-1] = null;
        size--;
    }
    /**
     * 改
     * @param element
     * @param index
     */
    public void set(E element,int index){
        checkRange(index);
        elementData[index] = element;
    }
    /**
     * 查
     * @param index
     * @return
     */
    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }
    /**
     * 索引合法判断
     * @param index
     */
    public void checkRange(int index){
        if(index < 0 || index >= size){
            throw new RuntimeException("索引越界："+index);
        }
    }
    public static void main(String[] args) {
        TestArrayList5 tal = new TestArrayList5(20);

        for (int i = 0; i < 40; i++) {
            tal.add("hello" + i);
        }
        tal.remove(2);
        tal.remove("hello1");
        System.out.println(tal);

    }
}
