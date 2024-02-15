import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
    public static void main(String[] args){
        SortedSet<String> L=new TreeSet<String>();
        L.add("Logesh");
        L.add("like");
        L.add("Valorant");
        L.add("and movies");
        System.out.println(L);
        L.remove("and movies");
        System.out.println(L);
    }
}