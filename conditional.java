public class conditional {
    public static void main(String args[]){
        int x=10;
        System.out.println("If else below");
        System.out.println();
        if(x>10)
            System.out.println("in if statement");
        else if(x<10)
            System.out.println("Inside else if");
        else
            System.out.println("Inside else");

        System.out.println("______________________");
        System.out.println();
        System.out.println("switch case below");
        System.out.println();
        switch(x){
            case 1->System.out.println("case 1");
            case 10->System.out.println("In case 10");
            default->System.out.println("In default");
        }
    }
}
