public class array {
    public static void main(String args[]){
        int s[]=new int[5];

        //Adding values
        for(int i=0;i<s.length;i++){
                s[i]=(int)(Math.random()*100);
        }

        //Accessing values
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
