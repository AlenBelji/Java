sealed class one permits two,three,four{  //sealed class determine what class can extend them using "permits" keyword
    public void show1(){
        System.out.println("In one");
    }
}

sealed class two extends one permits five{  //the class a sealed class permits should be sealed
    public void show2(){
        System.out.println("In two");
    }
}

non-sealed class three extends one{  //the class a sealed class permits should be non-sealed
    public void show3(){
        System.out.println("In three");
    }
}

final class four extends one{  //the class a sealed class permits should be final
    public void show4(){
        System.out.println("In four");
    }
}

final class five extends two{
    public void show5(){
        System.out.println("In five");
    }
}
public class SealedClass {
    public static void main(String[] args) {
        one o1=new one();
        two o2=new two();
        three o3=new three();
        four o4=new four();
        five o5=new five();
        o1.show1();
        o2.show2();
        o3.show3();
        o4.show4();
        o5.show5();
    }
}
