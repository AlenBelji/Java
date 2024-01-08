class calculate{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

public class methods {
    public static void main(String args[]){
        calculate c=new calculate();
        c.add(10,4,8);
    }
}
