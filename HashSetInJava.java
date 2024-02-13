import java.util.*;
public class HashSetInJava {
    public static void main(String args[]){
        HashSet<Integer> s=new HashSet<>();  //declaring a hashset
        s.add(3);
        s.add(31);
        s.add(24);  //adding values into it
        s.add(546);
        s.add(74);
        System.out.println(s);

        System.out.println(s.contains(31));  //to check if a value is present or not

        s.remove(24);
        System.out.println(s);  //to remove a specific value

        System.out.println(s.size());  //to find the size of a set
    }
}
