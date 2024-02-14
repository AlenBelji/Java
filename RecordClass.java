record alien(int age,String name){ }  //record is a class in java that contains toString(),parameterized constructor,and getters
//all the variables in a record are private by default

public class RecordClass {
    public static void main(String[] args) {
        alien o1=new alien(31,"superman");
        alien o2=new alien(54,"batman");
        alien o3=new alien(787,"wonder woman");

        System.out.println(o1);
        System.out.println(o2); //to get toString() method
        System.out.println(o3);

        System.out.println(o1.age());  //these are the getter
        System.out.println(o2.age());
        System.out.println(o3.age());
    }
}
