import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add("deepak");
        hs.add("deepak");  //cant store duplicate elements
        hs.add(200.20);
        // System.out.println(hs); //hashset doesnot follows insertion order, just look at the output also we cant store duplicate values

        Iterator itr =hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
    
}
