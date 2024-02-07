class Aa implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Bb implements Runnable {  //Another method to create a thread is to implement interface Runnable
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class WithRunnable {
    public static void main(String args[]){
        Aa obj1=new Aa();
        Bb obj2=new Bb();
         
        Thread t1=new Thread(obj1);  //create objects of Thread class and pass object of class that extends Runnable to constructor
        Thread t2=new Thread(obj2);

        t1.start();  //use object of Thread to call start method
        t2.start();


    }
}
