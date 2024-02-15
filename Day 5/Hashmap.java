import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> L=new HashMap<String,Integer>();
        L.put("Loki",23);
        L.put("Beri",8);
        L.put("Niran",21);
        System.out.println("size of map:"+L.size());
        System.out.println(L);
        L.remove("Beri",8);
        System.out.println(L);
    }
}
