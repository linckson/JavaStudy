package heimaCollection.HashSet;

import java.util.HashSet;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 8:48
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Person> hset = new HashSet<>();
        hset.add(new Person("张三",9));
        hset.add(new Person("张三",18));
        hset.add(new Person("张三",9));
        hset.add(new Person("张四",9));

        for(Person p : hset){
            System.out.println(p);
        }
    }
}
