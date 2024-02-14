import java.util.*;

public class TreeSetInJava {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>(); //TreeSet is similar to HashSet but values will be sorted from small to big by default
        s.add(3);
        s.add(31);
        s.add(24);  //adding values into it
        s.add(546);
        s.add(74);
        System.out.println(s);
    }
}
