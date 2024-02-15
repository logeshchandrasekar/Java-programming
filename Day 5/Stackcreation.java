import java.util.Stack;

public class Stackcreation {
    public static void main(String[] args){
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        System.out.println(S);
        System.out.println("Popped element: "
                + S.pop());
        System.out.println("Popped element: "
                + S.pop());
        System.out.println("Stack after pop operation "
                + S);
    }
}