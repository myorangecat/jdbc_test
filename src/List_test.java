import java.util.ArrayList;
import java.util.List;

public class List_test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        //添加元素
        list.add("Tom");
        list.add("Tom2");
        list.add("Tom3");
        list.add("Tom4");
        list.add("Tom5");
        //遍历元素
        {
            int num = list.size();
            String str = null;
            while (num != 0) {
                str = list.get(num - 1);
                System.out.println(str);
                num--;
            }
        }
        //遍历元素
       for(String s:list){
           System.out.println(s);
       }
       //查询某一元素是否存在
        list.contains("Tom");   //
    }
}
