package collection;

/**
 * 增加get方法
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-06 9:58
 */
public class TestLinkedList1 {
    private Node first;
    private Node last;

    private int size;



    /**
     * 传索引，返回对应内容
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引位置不合法：" + index);
        }

        Node temp = null;
        if (index <= (size >> 1)) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp.element;
    }

    /**
     * 尾插法添加链表
     * @param obj
     */
    public void add(Object obj) {
        Node node = new Node(obj);

        if (first == null) {
//            node.prev = null;
//            node.next = null;
            first = node;
            last = node;
        } else {
            node.prev = last;
            node.next = null;

            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        TestLinkedList1 tll = new TestLinkedList1();

        tll.add("a");
        tll.add("b");
        tll.add("c");
        tll.add("d");
        tll.add("e");
        tll.add("f");

        System.out.println(tll.get(1));
        //System.out.println(tll.toString());

    }
}
