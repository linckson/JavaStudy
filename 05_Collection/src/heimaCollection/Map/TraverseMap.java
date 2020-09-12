package heimaCollection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * traverse:遍历
 * ketset() 把map中的key取出来放到一个set中
 * @Author: LinZhiWei
 * @Date: 2020-07-30 17:02
 */
public class TraverseMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("101","语文");
        map.put("102","数学");
        map.put("102","高等数学");
        map.put("103","英语");
        map.put("104","英语");

        //第一种方法，keyset
        Iterator<String> keyset = map.keySet().iterator();
        while(keyset.hasNext()){
            String key = keyset.next();
            System.out.print(key+"-");
            System.out.println(map.get(key));
        }
        System.out.println("-------------------------------");

        //another way to traverse a map by using entryset()
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("---------------------------------");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
