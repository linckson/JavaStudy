package heimaCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 10:02
 */
public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("h");
        s.push("e");
        s.push("l");
        s.push("l");
        s.push("o");

        while(!s.empty()){
            System.out.println(s.pop());
        }

        Queue q1 = new LinkedList();

    }
}
