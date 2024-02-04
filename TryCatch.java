public class TryCatch {
    public static void main(String args[]){
        try{   //"try" is to check error possible statement
            int a=10/0;
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception found");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception found");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception found");
        }
        catch(Exception e){
            System.out.println("Some type of exception found");
        }
    }
}
