import java.util.*;
public class HashMapInJava {
    public static void main(String args[]){
        HashMap<String,Integer> m=new HashMap<>();  //declaring a hash map as key value pair

        m.put("Alen",99);  //adding values to a hashmap
        m.put("Albin",89);
        m.put("Alias",9799);
        m.put("Alvin",79);
        m.put("Sony",56);
        System.out.println(m);

        System.out.println(m.keySet()); //to access all the keys

        System.out.println(m.values()); //to access all the values

        System.out.println(m.get("Alen"));  //to get value of a particular key

        System.out.println(m.containsKey("alvvin"));  //to know if a key is present
        
        System.out.println(m.containsValue(99));  //to know if a value is present
        
        System.out.println(m.size());  //to know the size
    }
}
