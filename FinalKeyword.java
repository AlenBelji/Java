final class Apple{
    void method1(){
        System.out.println("We can inherit this class");
    }
}

class Orange{
    final String str="we cant chage the value";
    final void method2(){
        System.out.println("This method cant be over ridden");
    }
}

public class FinalKeyword extends Orange{
     
    public static void main(String args[]){
        FinalKeyword obj=new FinalKeyword();
        System.out.println("See this is final variable,method and class");
    }
}
