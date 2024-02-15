import java.util.LinkedList;
import java.util.Queue;

public class Queuecreation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("mango");
        System.out.println("Queue: " + queue);
        String front = queue.remove();
        System.out.println("Removed element: " + front);
        System.out.println("Queue after removal: " + queue);
        queue.add("orange");
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue after peek: " + queue);
    }
}