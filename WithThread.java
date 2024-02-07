class Bat extends Thread{
    
    public void run(){  //to make a class a thread we need to extend Thread class and override run method
        for(int i=0;i<10;i++){
            System.out.println("Bat");
            try{
                Thread.sleep(10);  //to make a thread to wait before next execution
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Ball extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Ball");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class WithThread {
    public static void main(String args[]){
        Bat obj1=new Bat();
        Ball obj2=new Ball();

        obj1.start();
        obj2.start();
    }
}
