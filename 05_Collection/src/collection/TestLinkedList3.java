package collection;

/**
 * 增加addNode
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-06 9:58
 */
public class TestLinkedList3 {
    private Node first;
    private Node last;

    private int size;

    public static void main(String[] args) {
        TestLinkedList3 tll = new TestLinkedList3();

        tll.add("a");
        tll.add("b");
        tll.add("c");
        tll.add("d");
        tll.add("e");
        tll.add("f");

//        tll.addNode(5,"*");
//        System.out.println(tll.toString());
        tll.addNode(4,"#");
        System.out.println(tll.toString());

    }

    /**
     * 增
     * 尾插法添加链表
     *
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

    /**
     * 增加新节点
     * @param index
     * @param obj
     */
    public void addNode(int index,Object obj){
        Node newNode = new Node(obj);
        Node temp = getNode(index);
        if(temp != null){
            if(index == 0){
                first.prev = newNode;
                newNode.next = first;
                first = newNode;
            }
            if(index == size-1){
                last.next = newNode;
                newNode.prev = last;
                last = newNode;

            }else{
                temp.prev.next = newNode;
                temp.prev = newNode;
                newNode.next = temp;
                newNode.prev = temp.prev;
            }

        }
    }

    /**
     * 删
     * @param index
     */
    public void remove(int index) {
        Node temp = getNode(index);
        if(temp != null){
            if(temp.prev != null){
                temp.prev.next = temp.next;
            }
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
            if(index == 0){
                first = first.next;
            }
            if(index == size-1){
                last = last.prev;
            }
        }
        size--;
    }

    /**
     * 查
     * 传索引，返回对应内容
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        Node temp = getNode(index);
        return temp == null ? null : temp.element;
    }

    /**
     * 返回索引所在节点
     *
     * @param index
     * @return
     */
    public Node getNode(int index) {
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
        return temp;
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
}
