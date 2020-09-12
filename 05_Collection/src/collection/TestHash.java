package collection;

/**
 * 测试hash算法
 * @Author: LinZhiWei
 * @Date: 2020-07-07 10:10
 */
public class TestHash {
    public static void main(String[] args) {
        int h = 123456789;
        int length = 16;//length为2的整数幂
        myHash(h,length);
    }
    public static int myHash(int h,int length){
        System.out.println("位运算："+(h&(length-1)));
        //length为2的整数次幂的时候，h&(length-1)和取模作用类似
        //取余rem,符号和除数相同，rem(-5,2)  ->   -1
        //取模mod,符号和被除数相同，mode(-5,2) ->  1
        System.out.println("取余数："+h%length);
        return h&(length-1);
    }
}
