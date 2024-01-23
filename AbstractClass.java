//abstract class
abstract class Car{
    //abstract method
    public abstract void drive();

    //non-abstract method
    public void playMusic(){
        System.out.println("Playing music...");
    }
}    

//concrete class
class Alto extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

//concrete class
public class AbstractClass {
    public static void main(String args[]){
        Alto obj=new Alto();
        obj.drive();
        obj.playMusic();
    }
}
