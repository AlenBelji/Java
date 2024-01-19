import calculator.calcul;

public class Packages {
    public static void main(String args[]){
        calcul obj=new calcul();
        System.out.println("Square root = "+obj.squareRoot(16));
        System.out.println("Cube root = "+obj.cubeRoot(125));
    }
}
