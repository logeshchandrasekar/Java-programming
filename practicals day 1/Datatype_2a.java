public class Datatype_2a {
    public static void main(String[] args) {
        // Implicit conversion
        int intValue = 10;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Conversion (Widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        double doubleNum = 123.456;
        float floatNum = (float) doubleNum;
        long longNum = (long) floatNum;
        int intNum = (int) longNum;

        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + floatNum);
        System.out.println("float to long: " + longNum);
        System.out.println("long to int: " + intNum);

        // Overflow and Underflow
        int smallInt = Integer.MAX_VALUE; // smaller value for overflow
        short shortNum = (short) smallInt; // int to short (overflow)
        byte byteNum = (byte) smallInt; // int to byte (overflow)

        System.out.println("\nOverflow and Underflow:");
        System.out.println("int to short (Overflow): " + shortNum);
        System.out.println("int to byte (Overflow): " + byteNum);

        int largeInt = Integer.MIN_VALUE; // larger value for underflow
        short shortNum2 = (short) largeInt; // int to short (underflow)
        byte byteNum2 = (byte) largeInt; // int to byte (underflow)

        System.out.println("int to short (Underflow): " + shortNum2);
        System.out.println("int to byte (Underflow): " + byteNum2);
    }
}