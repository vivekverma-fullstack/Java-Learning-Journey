import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Aditya");
        set.add("Rohit");
        set.add("Rohan");
        //System.out.println(set.contains( "Aditya"));  //True
        //System.out.println(set.contains("Vivek"));    //False

        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Vivek" );
        map.put(102, "Aditya");
        map.put(103, "Vivek");
        System.out.println(map.containsKey(101));
        System.out.println(map.get(102) );
    }
}