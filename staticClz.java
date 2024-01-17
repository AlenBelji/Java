class mobile{
    String brand;
    int cost;
    static String type; //static variable

    //static block
    //will be executed before constructor when we create an object and only once
    static{
        type="Smartphone";
        System.out.println("inside the static block ");
    }

    mobile(String brand,int cost){
        this.brand=brand;
        this.cost=cost;
        System.out.println("Inside the constructor");
    }
    void display(){
        System.out.println("Brand : "+brand+" and Cost :"+cost);
    }
}
public class staticClz {
    public static void main(String args[]){ //static method -> can be accessed without creating an object
        mobile obj1= new mobile("Apple",1500);
        mobile obj2= new mobile("Samsung",1000);
        obj1.display();
        obj2.display();
    }
    
}
