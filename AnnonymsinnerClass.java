class Ab{
    void show(){
        System.out.println("In Ab show");
    }
}

abstract class Bc{
    abstract void disp();
}
public class AnnonymsinnerClass {
    public static void main(String[] args) {
        Ab obj=new Ab(){
            void show(){
                System.out.println("In annonyms class");
            }
        };
        obj.show();

        Bc obj1=new Bc(){
            void disp(){
                System.out.println("In abstract method implementation");
            }
        };
        obj1.disp();
    }
}
