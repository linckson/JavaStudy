package heimaCollection.Generic.HomeWork;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 15:13
 */
public class Test06 {
    public static void main(String[] args) {
        //十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
        //十一、编写一个泛型方法，实现任意引用类型数组元素反转。
        Integer[] a = {1,2,3,4,5};
        String[] ss = {"我","爱","你"};
        test(a,2,3);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        test01(a);
        System.out.println();
        test01(ss);
    }
    public static <E> E[] test(E[] e, int from, int to){
        E temp = null;
        temp = e[from];
        e[from] = e[to];
        e[to] = temp;

        return e;
    }
    public static <E> void test01(E[] e){
        for(int i=e.length-1; i>=0; i--){
            System.out.print(e[i]+" ");
        }
    }
}
