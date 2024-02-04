class MyException extends Exception{  //this is a custom exception
    public MyException(String x){
        super(x);
    }
    public MyException(){
        super();
    }
}

public class ThrowAndThrows {
    static void a() throws MyException{  //"throws" keyword is used to send the responsibility of handling an exception to the method calling function
        b();
        throw new NullPointerException();
    }
    static void b() throws MyException{
        c();
        throw new ArrayIndexOutOfBoundsException();
    }
    static void c() throws MyException{
        throw new MyException("This is the message");  //"throw" keyword is used to manually throw an exception
    }
    public static void main(String args[]){
        try{
            a();
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
