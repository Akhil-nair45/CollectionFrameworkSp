import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("deepak");
        s.push("amit");
        s.push(100);
        s.push(200.10);

        System.out.println(s);
        // System.out.println(s.pop()); // removes top most element from the stack
        // System.out.println(s);

        System.out.println(s.peek()); //it can only retrieve the data or get the data it cant remove the data from the stack
        System.out.println(s); // here u can see the element is not removed only the value is retrieved 

        System.out.println(s.search(100));  // here we can directly find the index value of the element 
        System.out.println(s.search(100.10));  // here if it cant find the element in the stack then it will return -1

        System.out.println(s.empty());  // it will give true/false if stack is empty it will return true if not then false
    }
}
