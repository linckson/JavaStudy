package heimaCollection.Generic.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 11:00
 */
public class Test02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        ArrayList<Integer> al = intArrayCastToIntergerCollection(a);
        for(Iterator it = al.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }

    private static ArrayList<Integer> intArrayCastToIntergerCollection(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            al.add(arr[i]);
        }
        return al;
    }

}
