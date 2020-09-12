package collection;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-06 10:04
 */
public class Node {
    Node prev;
    Node next;
    Object element;

    public Node(Node prev, Node next, Object element) {
        this.prev = prev;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
