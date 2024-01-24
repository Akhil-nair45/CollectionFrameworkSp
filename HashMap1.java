import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Ravi");
        map.put(103, "Sachin");
        map.put(104, "Ajay");
        System.out.println(map);


        // here this is done as the value is in curly set and in order to retrieve data in single form we first need to convert it to array form and then we can perform iterator to retrieve data in single form
        Set set=map.entrySet();
        System.out.println(set);

        // now here after converting we can retrieve data one by one
        Iterator it = set.iterator();
        while (it.hasNext()){
            // System.out.println(it.next());  // here it will return key value pair but if we want single data then use below method

            Map.Entry entry= (Map.Entry)it.next();  // here we have typecasted .next (object) to Map.entry
            System.out.println(entry.getKey()+"-"+entry.getValue());  // as entry method has get key and get value pair
    }

    System.out.println("-----------------------------------");

    // we have some other method for each method
            for(Map.Entry me : map.entrySet())  // here it will firsr gove error in map.entryset() because of type mismatch but u just have to mention the generics in Hashmap<Integer, String>
            {
                System.out.println(me.getKey()+"-"+me.getValue());
            }
}
}
