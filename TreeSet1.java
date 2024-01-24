import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(40);
        ts.add(60);
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(50);
        ts.add("deepak");  // we can only store homogenous data means single data type we cant store heterogenous data it will give error java.lang.ClassCastException if first value is int and then u r trying to store string it will give errorn string cant be converted to int and vice versa
        System.out.println(ts);  // here u will find that the tree set is following the sorting order
    }
}
