class JaggedArray{
    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[5];
        a[2]=new int[1];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(int)(Math.random()*100);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}