import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCursor {
   public static void main(String[] args) {
    List l = new ArrayList<>();
    l.add(10);
    l.add("deepak");
    l.add("Rahul");

    // if we want the collectrion element to be printed in one line 
    System.out.println(l);

    // if u want to retrieve the collection element line by line then we have to use cursors
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }

    // remove method
    l.remove("Rahul");
    System.out.println(l);
   } 
}
