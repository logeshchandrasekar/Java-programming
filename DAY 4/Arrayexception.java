public class Arrayexception {
    public static void main(String[] args){
        int a[]={2,3,4,5,6};
        try{
            for(int i=0;i<=5;i++){
                System.out.println(a[i]);
            }
        }
        catch(Exception e){
            System.out.println("there is an exception "+e);
        }
    }
}