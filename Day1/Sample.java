public class Sample {
    public static void main(String[] args){
        int a=10,b=5,c=7;
        if(a>b && a>c){
            System.out.println(a+" is greater number");
        } else if (b>a && b>c) {
            System.out.println(b+" is greater number");
        }else{
            System.out.println(c+" is greater number");
        }
    }
}