import java.util.ArrayList;

public class ArrayListdemo1 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30); //even if we dont give index value by default it will give so we say arraylist follows the insertion order
        al.add(3,40);  //here we have mentioned index value also as arraylist is a index based collection so it is a good habit to write value along with index number
        al.add(5);  //here it doesnt folow the sorting so even if u saved a lower valued data it is stored after 40 only
        // we can also add different data types in array list so it is called as heterogenous
        al.add("deepak");
        al.add('c');
        al.add(23.23);
        al.add(23.23);  // here we have stored duplicate values and it is acceptable in arraylist
        al.add(null);
        al.add(null); // we can also add multiple null values in arraylist
 
        System.out.println(al);

        System.out.println("-----------------------------------");

        // now if we want to add the collection object of al1 in al2 we have a inbuilt method called addAll
        ArrayList al2 = new ArrayList<>();
        al2.add(null);
        al2.add(23.23);
        al2.add(10);
        al2.add("deepak");
//         al2.addAll(al);
//         System.out.println(al2);
// System.out.println("----------------------------------------");

        // remove all method
        // it will only print that value which is not present in both the arraylist
        al.removeAll(al2);
        System.out.println(al);


        System.out.println("----------------------------------");

        // we are using contains method to check whether the data is present or not   
        System.out.println(al2.contains("deepak"));
        System.out.println(al2.contains("Akhil"));
        
        System.out.println("--------------------------------------");

        // size method
        System.out.println(al.size());

        System.out.println("----------------------------------------");

        // to get the value of that particular index
        System.out.println(al.get(1));

        System.out.println("----------------------------------------");

        // set method
        al.set(1, 31);
        System.out.println(al);

        System.out.println("-----------------------------------------");

        // index of method to know the index value
        System.out.println( al.indexOf(23.23));

System.out.println("---------------------------------------");
        // clear method
// it will clear everything
        al.clear();
        System.out.println(al);
    }
}
