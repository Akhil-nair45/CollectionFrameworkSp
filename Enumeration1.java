import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumeration1 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add("Deepak");
        v.add(15.2);

        System.out.println(v);

        System.out.println("---------------------------");

       Enumeration e= v.elements();
       while(e.hasMoreElements())
       {
        System.out.println(e.nextElement());
       }
    }
}
