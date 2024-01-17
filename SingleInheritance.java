class Calc{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    int multi(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
public class SingleInheritance {
    public static void main(String args[]){
        AdvCalc obj=new AdvCalc();
        System.out.println("Sum = "+obj.add(4,6));
        System.out.println("Diff = "+obj.sub(73,43));
        System.out.println("Product = "+obj.multi(32,6));
        System.out.println("Div = "+obj.div(46,6));
    }
}
