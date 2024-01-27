@FunctionalInterface  //this ensures that the interface has only one method
interface abc{
    void show();
}

class hello{
    public void xyz(){
        System.out.println("In hello class");
    }
}

public class Annotation extends hello{
    @Override  //this keyword ensure that we are overriding else we get an error
        public void xyz(){
            System.out.println("In Annotation class");
        }
    public static void main(String args[]){
        hello obj=new Annotation();
        obj.xyz();
    }
}
