interface abc{  //interface with only one method is called functional interface
    void show(int i);
}
interface xyz{
    String show1();
}

public class LambdaExp {
    public static void main(String args[]){

        abc obj=new abc(){   //normal method
            public void show(int i){
                System.out.println("normal method "+i);
            }
        };
        obj.show(10);

        abc obj1=(int i) ->  //lamda expression
            {
                System.out.println("lamda expression "+i);
            }
        ;
        obj1.show(10);

        abc obj2=i ->System.out.println("much smaller lamda expression "+i);  //much smaller lamda expression
        obj2.show(10);

        xyz obj3=() -> "lamda expression with return type";  //lamda expression with return type
        System.out.println(obj3.show1());
    }
}
