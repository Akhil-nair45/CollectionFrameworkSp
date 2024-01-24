import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(10);
        l.add("Deepak");
        l.add("Rahul");

        // if we want the collectrion element to be printed in one line 
         System.out.println(l);
         System.out.println("-----------------------------------------------");

        // if u want to retrieve the collection element line by line then we have to use cursors
        //here we are using listiterator so we are using different methods 
        // method 1(.hasnext())
        ListIterator itr =l.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

    }
    System.out.println("----------------------------------------");

    // Method 2 (.hasPrevious())
    //herer after first loop the cursor will come at the end now we can run previous methods before we cant do it will not give any output
   while(itr.hasPrevious())
    {
        System.out.println(itr.previous());
    }
    

    // using add method
//     itr.add(100);
//     System.out.println(l);

// // using remove method
// l.remove("Rahul");
// System.out.println(l);


// using set method
itr.set(200);
System.out.println(l); //  here as cursor ends previous at 10 its been replaced with 200
}
}
