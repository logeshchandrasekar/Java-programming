public class Pair<T extends Number> {

    private T value;

    public Pair(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Using the generic class with Integer
        Pair<Integer> integerExample = new Pair<>(42);
        System.out.println("Integer value: " + integerExample.getValue());

        // Using the generic class with Double
        Pair<Double> doubleExample = new Pair<>(3.14);
        System.out.println("Double value: " + doubleExample.getValue());


    }
}
