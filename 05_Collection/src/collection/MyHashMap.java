package collection;

import java.util.HashMap;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-07 16:04
 */
public class MyHashMap<K,V> {
    Node1[] table;//位桶数组
    int size;

    public MyHashMap(){
        super();
        table = new Node1[16];
    }

    public static void main(String[] args) {
        MyHashMap<Integer,String> m =new MyHashMap<>();

        m.put(10,"ten");
        m.put(20,"twenty");

        HashMap h;

        System.out.println(m);
    }

    /**
     * 增
     * @param key
     * @param value
     */
    public void put(K key,V value){
        Node1 newNode = new Node1();
        newNode.key = key;
        newNode.value = value;
        newNode.hash = getHash(key.hashCode(),table.length);
        newNode.next = null;

        Node1 temp = table[newNode.hash];
        Node1 lastNode = null;
        boolean repeat = false;
        if(temp == null){
            table[newNode.hash] = newNode;
            size++;
        }else{
            while(temp != null){//判断是添加还是覆盖
                if(temp.key.equals(newNode.key)){//覆盖
                    repeat = true;//置一个标记，若重复则后续不再添加节点
                    temp.value = newNode.value;
                    size++;
                    break;
                }else{//继续遍历
                    lastNode = temp;
                    temp = temp.next;
                }
                //遍历结束，在末尾添加
                if(!repeat){
                    lastNode.value = newNode.value;
                    size++;
                }
            }
        }
    }



    /**
     * 查
     * 输入key,输出value
     * @param key
     * @return value
     */
    public V get(K key){
        V value = null;
        int hash = getHash(key.hashCode(),table.length);
        Node1 temp = table[hash];
        while(temp != null){
            if(temp.key.equals(key)){
                value = (V)temp.value;
                break;
            }else{
                temp = temp.next;
            }
        }
        return value;
    }

    /**
     * 计算hash值，确定下标
     * @param h
     * @param length
     * @return  hash
     */
    public int getHash(int h,int length){
        if(length % 2 != 0){
            throw new RuntimeException("长度需要为2的n次幂");
        }
        return h&(length-1);
    }

    /**
     * 重写toString
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        //双重遍历，先遍历数组，再遍历其中的链表
        for(int i=0; i<table.length; i++){
            Node1 temp = table[i];
            while(temp != null){
                sb.append(temp.key+"-"+temp.value+",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }
}
