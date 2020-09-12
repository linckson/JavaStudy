public class P09 {
    public static void main(String[] args) {
        boolean b = isPalindrome(11000011);
        System.out.println(b);
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        //if(x>0 && x<10) return true;

        //判断位数
        String numStr = String.valueOf(x);
        int w = numStr.length();
        //拆分数字进入数组
        int[] arr = new int[w];
        for(int i=0; i<w; i++){
            arr[i] = numStr.charAt(i)-'0';
        }

        int head=0;
        int tail=w-1;
        while(head < tail){
            if(arr[head] != arr[tail]){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
