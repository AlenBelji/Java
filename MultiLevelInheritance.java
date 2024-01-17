class A{
    void showA(){
        System.out.println("Inside class A");
    }
}

class B extends A{
    void showB(){
        System.out.println("Inside class B");
    }
}

class C extends B{
    void showC(){
        System.out.println("Inside class C");
    }
}

public class MultiLevelInheritance {
    public static void main(String args[]){
        C obj=new C();
        obj.showC();
        obj.showB();
        obj.showA();
    }
}
