package heimaCollection.Generic.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 14:59
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = (int)(Math.random()*100);
            if(arr[i]>=10){
                al.add(arr[i]);
            }
        }

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
