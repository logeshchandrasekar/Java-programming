public class Stringsample {
    public static void main(String[] args){
        String s="my name is logesh";
        String c=s.toUpperCase();
        System.out.println("UPPER CASE: "+c);
        String b=s.replace('m','c');
        System.out.println("NEW STRING:"+b);
        String a=s.toLowerCase();
        System.out.println("LOWERCASE:"+a);
        String d=s.substring(2,8);
        System.out.println("SUBSTRINGS:"+d);
        char e=s.charAt(6);
        System.out.println("CHAR AT:"+e);
        String f=s.concat("$");
        System.out.println("CONCAT:"+f);
        String g=s.substring(9);
        System.out.println(g);
        boolean h=s.startsWith("m");
        System.out.println(h);
    }
}