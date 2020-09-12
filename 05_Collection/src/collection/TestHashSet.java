package collection;

import java.util.HashMap;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-08 10:33
 */
public class TestHashSet {
    HashMap map;
    private static final Object PRESENT = new Object();

    public TestHashSet() {
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    public int size(){
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(Object temp:map.keySet()){
            sb.append(temp+",");
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public static void main(String[] args) {
        TestHashSet hs = new TestHashSet();

        hs.add("11");
        hs.add("22");
        hs.add("11");

        System.out.println(hs.size());
        System.out.println(hs);
    }
}
