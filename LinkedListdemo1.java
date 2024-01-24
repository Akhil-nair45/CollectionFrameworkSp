import java.util.LinkedList;

public class LinkedListdemo1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("deepak");
        ll.add("Rahul");
        ll.add(105);
        ll.add(124.7);
        ll.add('c');
        ll.add("deepak");
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        ll.addFirst(12);
        System.out.println(ll);

        ll.addLast(12);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll); 

        ll.removeLast();
        System.out.println(ll);
    }
}
