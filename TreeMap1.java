import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm = new  TreeMap<>();
        tm.put(101, "Deepak");
        tm.put(103, "Harshil");
        tm.put(102, "Amit");
        tm.put(105, "Shailesh");
        tm.put(104, "Akhil");


        //here we are changing key to string from integer so it wiklk sort the key accroding to the char convention 
        // tm.put( "Deepak",111);
        // tm.put( "Deep",121);
        // tm.put( "Deepen",141);
        // tm.put( "Deepali",131);
        // tm.put( "Deepika",151);


        System.out.println(tm);
        System.out.println(tm.ceilingEntry(100));  //ceieling entry will return the value directly, if not present it will return the next big key like enter 100 and check it will give output of 101
        System.out.println(tm.ceilingKey(102));  // it will return the key
        System.out.println(tm.firstKey());
        System.out.println(tm.firstEntry());
        System.out.println(tm.floorEntry(109));  // it will return the smaller value of what if not present 
        System.out.println(tm.get(103));
        System.out.println(tm.headMap(104));  // it will return all the value before the given value 
        System.out.println(tm.higherEntry(103));  // it will print the higher value of the given key, null if no greater key
        System.out.println(tm.keySet());  //it will return the keys present as output
        System.out.println(tm.subMap(102, 105)); // it will return all the data between this two numbers or keys

        System.out.println("---------------------------------");

        System.out.println(tm.pollFirstEntry());  // it will remove the firsr data just sout tm
        System.out.println(tm);
        
        System.out.println("----------------------------------");

        System.out.println(tm.pollLastEntry());  // it will remove the last data just sout tm 
        System.out.println(tm);

    }
}
