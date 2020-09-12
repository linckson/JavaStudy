import java.util.*;

public class MapExercise01 {
    /**
     * 从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
     * 如果该 年没有举办世界杯，则输出：没有举办世界杯。
     */
    public static void test01(Map<String,String> map){
        System.out.println("请输入年份或队伍名字，退出请输入#");
        String s = new Scanner(System.in).nextLine();
        boolean isNumber = true;
        for(int i = 0; i< s.length(); i++){
            if(!Character.isDigit(s.charAt(i)))
                isNumber=false;
        }
        if (isNumber) {
            if(map.containsKey(s)){
                System.out.println("冠军是"+map.get(s));
            }else{
                System.out.println("该年没有举办世界杯");
            }
        }else{
            if(s.equals("#")){
                System.out.println("程序结束");
                return;
            }else if(s.equals("巴西") ||
                    s.equals("荷兰") ||
                    s.equals("乌拉圭") ||
                    s.equals("意大利")){
                test02(map,s);
            }
            else{
                System.out.println("能不能输点阳间的玩意儿？");
            }
        }
        test01(map);
    }
    public static void test02(Map<String,String> map,String s){
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        boolean isChampion = false;
        if(iterator.hasNext()){
            System.out.print("夺冠年份：");
        }
        while(iterator.hasNext()){
            String key = iterator.next();
            if(map.get(key).equals(s)){
                isChampion = true;
                System.out.print(key+" ");
            }
        }
        if(!isChampion){
            System.out.println("没有获得过世界杯");
        }else{
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1930","乌拉圭");
        map1.put("1934","意大利");
        map1.put("1938","意大利");
        map1.put("1950","乌拉圭");
        map1.put("1954","西德");
        map1.put("1958","巴西");
        map1.put("1962","巴西");

        test01(map1);
    }
}
