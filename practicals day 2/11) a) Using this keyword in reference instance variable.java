public class Java {
    private int number;

    public void setNumber(int number) {
        // Use 'this' to refer to the instance variable
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Java obj = new Java();
        obj.setNumber(42);

        System.out.println("Number: " + obj.getNumber());
    }
}
