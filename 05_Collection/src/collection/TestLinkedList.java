package collection;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-06 9:58
 */
public class TestLinkedList {
    private Node first;
    private Node last;

    private int size;

    public void add(Object obj){
        Node node = new Node(obj);

        if(first == null){
//            node.prev = null;
//            node.next = null;
            first = node;
            last = node;
        }else{
            node.prev = last;
            node.next = null;

            last.next = node;
            last = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp =first;
        while(temp != null){
            sb.append(temp.element+",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return  sb.toString();
    }

    public static void main(String[] args) {
        TestLinkedList tll = new TestLinkedList();

        tll.add("a");
        tll.add("b");
        tll.add("c");

        System.out.println(tll);
        System.out.println(tll.toString());
    }
}
