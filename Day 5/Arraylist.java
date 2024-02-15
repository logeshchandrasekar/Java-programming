import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
        List<Integer> L=new ArrayList<Integer>();
        L.add(23);
        L.add(8);
        L.add(21);
        L.add(24);
        System.out.println(L);
        L.remove(3);
        System.out.println(L);
    }
}