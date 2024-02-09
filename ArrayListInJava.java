import java.util.*;
public class ArrayListInJava {
    public static void main(String args[]){
        ArrayList<Integer> l=new ArrayList<Integer>();  //declaring an arraylist
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter value : ");
            l.add(in.nextInt());   //adding value into arraylist using "listName.add(value)"
        }
        System.out.println();
        for(int i=0;i<l.size();i++)  //accessing list size using  "listName.size()"
            System.out.print(l.get(i)+" ");  //accessing individual values using  "listName.get(index)"

        System.out.println();
        // l.remove(2); //remove value from list using "listName.remove(index)"
        
        // l.clear(); //remove all values using "listName.clear()"

        l.add(5,6);  //to add value at specific point "ListName.add(index,value)"

        l.contains(41); //to check if a value is present or not

        l.indexOf(4); //to find index of a value

        l.isEmpty(); //to check if it is empty
        l.lastIndexOf(5);  //to find last index of a value
        l.remove(3); //to remove value at particular index
        
    }
}
