import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(101, "deepak");
        m.put(102, "Harshil");
        m.put(103,"Amit");
        m.put(102, "Ravi");  // here as we know that map doesnot store duplicate values but if we store it will save the latest one as we can see we have two 102 id with different values but it will show the latest one 
        m.put(null, null);
        m.put(null, "aaa");  // mujltiple null values cant be stpred as we can see the value is updated to AAA  

        // m.clear();
        // System.out.println( m.containsKey(105));
        // System.out.println(m.containsValue("deepali"));
        // System.out.println(m.get(102));  // it will get the value of the key 
        // m.remove(102);// it will remove the given key 
        // m.replace(102, "Ravi");  // it will replace harshil with ravi   
        System.out.println(m.size());
        
        System.out.println(m);
        
    }
}
