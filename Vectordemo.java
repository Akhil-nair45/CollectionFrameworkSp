import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("deepak");
        v.add("rahul");
        v.add("rahul");
        v.add(null);
        v.add(null);
        v.addElement("Ravi");

        System.out.println(v.capacity());

        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        System.out.println(v.removeElement("rahul"));
        System.out.println(v);

        // v.removeElementAt(1);
        // System.out.println(v);

        System.out.println(v.indexOf("rahul"));
        
    }
}
