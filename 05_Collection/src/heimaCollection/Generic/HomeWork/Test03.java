package heimaCollection.Generic.HomeWork;

import java.util.ArrayList;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 11:08
 */
public class Test03 {
    public static void main(String[] args) {

    }

    private static boolean listContainsElem(ArrayList<String> al, String s) {
//        boolean f = false;
//        Iterator<String> it = al.iterator();
//        while(it.hasNext()){
//            if(it.next().equals(s)){
//                f = true;
//            }
//        }
//        return f;
        if(al.contains(s)) return true;
        return false;
    }
    private static boolean listIsEmpty(ArrayList<String> al){
        if(al.isEmpty()) return true;
        return false;
    }
    private static int firstOccur(ArrayList<Integer> al, Integer s){
        return al.indexOf(s);
    }
}
