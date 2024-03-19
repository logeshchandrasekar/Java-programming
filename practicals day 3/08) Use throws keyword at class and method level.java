import java.io.IOException;

class UseThrows {
    public static void main(String[] args) {
        try {
            UseThrows obj = new UseThrows();
            obj.method1();
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
    }

    void method1() throws IOException {
        System.out.println("Inside method1()");
        method2();
    }

    void method2() throws IOException {
        System.out.println("Inside method2()");
        throw new IOException("An error occurred");
    }
}
