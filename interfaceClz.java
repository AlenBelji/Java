interface xyz{  //interface are by default abstract

    public void show1();  //interface methods are by default abstract
    public void show2();

    int x=10;  //variables in interface are static and final by default
    String str="Clark kent";
}

class abc implements xyz{  //we use implements for interface

    public void show1(){
        System.out.println("in show 1");
    }

    public void show2(){
        System.out.println("In show 2");
    }
}
class interfaceClz{
    public static void main(String args[]){
        abc obj=new abc();
        obj.show1();
        obj.show2();
        System.out.println(xyz.x);
        System.out.println(xyz.str);
    }
}