import java.util.Vector;
public class Vectorcreation{
    public static void main(String[] args)
    {
        Vector<String> G=new Vector<>();
        G.add("L");
        G.add("E");
        G.add("G");
        System.out.println(G);
        G.remove("E");
        System.out.println(G);
    }
}