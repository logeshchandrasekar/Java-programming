public class Example extends Sample{
    void add(int a,int b,int c){
        int d= a + b + c;
        System.out.println(d);
    }
    public static void main(String[] args){
        Example c=new Example();
        c.add(3,2,6);
    }
}