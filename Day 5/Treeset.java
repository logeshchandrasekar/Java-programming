import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args)
    {
        Set<String> L=new TreeSet<String>();
        L.add("Logesh");
        L.add("SSE");
        L.add("192110242");
        System.out.println(L);
        L.remove("SSE");
        System.out.println(L);
    }
}
