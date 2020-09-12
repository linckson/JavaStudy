public class Tools {
    public int[] numToArr(int n){
        //判断位数
        String numStr = String.valueOf(n);
        int w = numStr.length();
        //拆分数字进入数组
        int[] arr = new int[w];
        for(int i=0; i<w; i++){
            arr[i] = numStr.charAt(i)-'0';
        }
        return arr;
    }
}
