public class Twodimarray {
    public static void  main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[1][1]==5 && a[1][2]==6 && a[1][0]==4){
                    a[1][1]=0;
                    a[1][2]=3;
                    a[1][0]=25;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
    }
}