package heimaCollection.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
 * @Author: LinZhiWei
 * @Date: 2020-07-31 9:00
 */
public class Test {
    public static void main(String[] args) {
        char[] c = new Scanner(System.in).nextLine().toCharArray();//输入的字符串转数组
        LinkedHashSet<Character> lkhset = new LinkedHashSet<>();
        for(char temp : c){
            lkhset.add(temp);
        }
        for(char temp : lkhset){
            System.out.print(temp);
        }
    }
}
