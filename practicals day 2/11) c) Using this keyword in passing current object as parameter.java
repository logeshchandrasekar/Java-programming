public class Java {
    private int number;
    public Java(int number) {
        this.number = number;
    }
    public void processData(Java anotherObject) {
        int sum = this.number + anotherObject.number;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        Java obj1 = new Java(30);
        Java obj2 = new Java(15);
        obj1.processData(obj2);
    }
}
