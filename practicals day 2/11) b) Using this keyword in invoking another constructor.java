public class Java {
    private int number;
    private String text;

    // Constructor with two parameters
    public Java(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Constructor with one parameter, invoking the two-parameter constructor using 'this'
    public Java(int number) {
        this(number, "Default Text");
    }

    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Java obj1 = new Java(42, "Hello, World!");
        obj1.displayValues();

        Java obj2 = new Java(17);
        obj2.displayValues();
    }
}
