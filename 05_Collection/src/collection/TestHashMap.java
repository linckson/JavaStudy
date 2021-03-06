package collection;

/**
 *
 * HashMap的底层实现
 * HashMap组成：Entry[] table位桶数组和存储在数组中的链表，其中数组对象Entry是链表，由hash,key,value,next组成
 * JDK8将链表在大于8情况下变为红黑二叉树
 * <p>
 * *
 * put(key,value);
 * 数据存储过程：目的是将”key-value两个对象”成对存放到HashMap的Entry[]数组中
 * 1.调用key对象的hashcode()方法，获得hashcode
 * 2.用算法根据hashcode计算出hash值，决定放在数组中的位置，
 * 3.生成Entry对象
 * 4.将Entry对象放到table数组中，形成链表
 * <p>
 * get(key,value);
 * 取数组过程：通过key取得对应value
 * 1.取得key的hashcode，计算出hash值，定位key在数组中的位置
 * 2.遍历链表，利用equals方法找到key对象
 * 3.返回找到的节点对象的value
 *
 * 实现put方法，实现了同key覆盖
 * @Author: LinZhiWei
 * @Date: 2020-07-07 9:03
 */
public class TestHashMap {
    HashNode[] table;//位桶数组。bucket array。 核心
    int size;

    public TestHashMap() {
        table = new HashNode[16];
    }

    public static void main(String[] args) {
        TestHashMap hm = new TestHashMap();
        hm.put(10, "ten");
        hm.put(20, "twenty");
        hm.put(20, "twenty-one");
        hm.put(30, "thirty");

        hm.put(53,"aa");
        hm.put(69,"bb");
        hm.put(85,"cc");

        System.out.println(hm);
    }

    /**
     * 插入新节点对象
     *
     * @param key
     * @param value
     */
    public void put(Object key, Object value) {
        HashNode newNode = new HashNode();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        HashNode temp = table[newNode.hash];
        HashNode lastNode = null;//遍历的最后一个节点
        boolean repeat = false;

        if (temp == null) {
            //为空直接放
            table[newNode.hash] = newNode;
        } else {
            //遍历,若key相同则覆盖之
            while (temp != null) {
                if (newNode.key.equals(temp.key)) {
                    System.out.println("key重复");
                    repeat = true;
                    temp.value = newNode.value;
                    size++;
                    break;
                } else {
                    lastNode = temp;
                    temp = temp.next;
                }
            }
            if (!repeat) {
                lastNode.next = newNode;
                size++;
            }
        }
    }

    /**
     * 获取hash值，即在数组中的下标
     *
     * @param h
     * @param length
     * @return
     */
    public int myHash(int h, int length) {
        if (length % 2 != 0) {
            throw new RuntimeException("长度需要为2的整数次幂");
        }
        //System.out.println("hash in myHash:"+(h& (length-1)));
        return h & (length - 1);
    }
}
