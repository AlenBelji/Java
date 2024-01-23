class A{
    void show1(){
        System.out.println("in show a");
    }
}

class B extends A{
    void show2(){
        System.out.println("in show b");
    }
}

public class OopCasting{
    public static void main(String args[]){

        //auto upcasting
        A obj=new B();
        obj.show1();

        //down casting
        B obj1=(B)obj;
        obj1.show2();
    }
}