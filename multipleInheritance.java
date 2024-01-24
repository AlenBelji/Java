interface m{
    public void show1();
    public void show2();
}

interface n extends m{ //inheritance between interfaces
    public void show3();
}

class o implements m,n{

    public void show1(){
        System.out.println("in show 1");
    }

    public void show2(){
        System.out.println("in show 1");
    }

    public void show3(){
        System.out.println("in show 1");
    }

}
public class multipleInheritance {
    public static void main(String[] args) {
        o obj=new o();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}
