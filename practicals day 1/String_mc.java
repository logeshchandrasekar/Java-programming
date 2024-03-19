public class String_mc {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("Hello");
        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray);
        byte[] byteArray = {65, 66, 67, 68, 69};
        String str4 = new String(byteArray);
        System.out.println("String Constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        String original = "Hello World";
        System.out.println("\nString Methods:");
        System.out.println("Original String: " + original);
        System.out.println("Length: " + original.length());
        String concatString = original.concat("!");
        System.out.println("Concatenated String: " + concatString);
        String substring = original.substring(6);
        System.out.println("Substring from index 6: " + substring);
        char charAt5 = original.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
        String upperCaseString = original.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
        String lowerCaseString = original.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);
}
}
