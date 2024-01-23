class A{  //outer class
    public void show(){
        System.out.println("Inside outer class");
    }

    class B{  //inner class
        public void show1(){
            System.out.println("Inside inner class");
        }
    }

    static class C{
        public void show2(){
            System.out.println("Inside static inner class");
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        A obj=new A(); //outer class object
        obj.show();

        A.B obj1=obj.new B(); //inner class object
        obj1.show1(); 

        A.C obj2=new A.C();  //static inner class object
        obj2.show2();
    }
    
}
