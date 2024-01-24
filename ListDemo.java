import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(1,2);
        l.add(2,12);
        l.add(3, 12); // in list we can store duplicate values and also we can store multiple null values 
        l.add(null);
        l.add(null); // we can store multiple null values in list


        // System.out.println(l); // here we are printing all the data ,what if we want toi get data one by one here comes the iterator

        //iterator
       Iterator itr= l.iterator();
       while(itr.hasNext())
       {
        System.out.println(itr.next());
       }



       System.out.println("--------------------------------------------");

       //list Iterator
       //here we can also use list iterator in the case of list only not the same with set, as set doesnt supports list iterator
      ListIterator itr1 = l.listIterator();
      while(itr1.hasNext())
      {
        System.out.println(itr1.next());
      }
 
    }
}
