import java.util.*;
import java.util.stream.Stream;  //Liberary for using stream in java
public class StreamInJava {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>();  //arraylist declaration in java
        s.add(3);
        s.add(31);  //adding values into a arraylist
        s.add(24);  
        s.add(546);
        s.add(74);
        s.add(53);
        s.add(64);  
        s.add(5624);  
        s.add(3);
        s.add(44);

        s.forEach(n -> System.out.print(n+"-")); //forEach method to print a arrayList in java

        //a stream can only be used once
        Stream<Integer> s1=s.stream();  //converting a arraylist to a Stream
        
        Stream<Integer> s2=s1.filter(n->n%3==0);  //filtering a stream to only desired content

        Stream<Integer> s3=s2.map(n->n*10);  //map method is used to do some operation on a stream

        int s4=s3.reduce(0,(a,b)->a+b);  //reduce is used to convert the stream into a single valuegit 

        System.out.println();
        System.out.println(s4);

        
    }
}
