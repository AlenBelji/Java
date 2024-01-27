enum abc{ //enum is like class but object are inside itself
    obj1("clark",30),obj2("bruce",28),obj3("diana",1250); //these are the objects
    String name;
    int age;

    private abc(String name,int age){  //it can have constructor
        this.name=name;
        this.age=age;
    }
    public String getName() {  //it can have getters and setters
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}

public class enumJava {
    public static void main(String args[]){
        abc varName=abc.obj1;  //to access specific object
        System.out.println(varName);
        System.out.println("Name - "+varName.getName());
        System.out.println("Age - "+varName.getAge());
        System.out.println("----------");

        abc varName1[]=abc.values(); //get all the objects as an array
        for(abc x:varName1){
            System.out.println(x);
            System.out.println("Name - "+x.getName());
            System.out.println("Age - "+x.getAge());
            System.out.println();
        }
    }
}
