class Count{
    int x=0;
    public synchronized void incre(){
        x++;
    }
}
    
public class ThreadSynchronization {
    public static void main(String args[]){
        Count c=new Count();

        Runnable r1=new Runnable(){
            public void run(){
                for(int i=0;i<100000;i++){
                    c.incre();
                }
            }
        };

        Runnable r2=() ->{
                for(int i=0;i<100000;i++){
                    c.incre();
                }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c.x);
    }
}
