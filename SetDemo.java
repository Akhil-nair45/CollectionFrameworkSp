import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(6); // here it doesnt follow insertion order whereas in list it follows insertion order as it follows index postioning 
        s.add(3);
        s.add(4);
        s.add(4);  // here it will not print the duplicate element/value as set doesnt store the same value again 
        s.add(5);
        s.add(null);
        s.add(null);  //we cant store miultiple null values as we cant store duplicate values in set


        // System.out.println(s); // we are going to get value one by one so we are using iterator

        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // here we cant use list iterator as it doesnt supports list iterator unlike list it will throw error
        // s.ListIterator();  // it is throwing error


    }
}
