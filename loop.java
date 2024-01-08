public class loop {
    public static void main(String args[]){
        System.out.println("For loop");

        for(int i=0;i<10;i++)
            System.out.print((i+1)+" ");

        System.out.println();
        System.out.println();
        System.out.println("while loop");

        int i=10;
        while(i>0){
            System.out.print((i)+" ");
            i--;
        }

        System.out.println();
        System.out.println();
        System.out.println("Do while loop");

        i=100;
        do{
            System.out.println("the condition is false");
        }while(i>100);
    }
}
