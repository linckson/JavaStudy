package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 泛型，类名后面加<E>，其中E可以使任何字母
 * 泛型：装在集合中的元素，同一是某种类型
 * 泛型只能是引用类型，不能是基本类型
 *
 *
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-03 15:39
 */
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc =new MyCollection<String>();
        mc.set("sas",0);
        mc.set("111",1);

        mc.get(0);
        System.out.println(mc.get(1));
        //Integer a = (Integer)mc.get(1);
        String s = mc.get(0);

        List list = new ArrayList();
        Map map = new HashMap();

    }
}
class MyCollection<E>{
    Object[] objs = new Object[5];
    public void set(E e , int index){
        objs[index] = e;
    }
    public E get(int index){
        return (E)objs[index];
    }
}
