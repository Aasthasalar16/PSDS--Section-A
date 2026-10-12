import java.util.*;
class Lab3 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack element: ");
        stack.push(sc.nextInt());
        System.out.println("Popped: " + stack.pop());
        System.out.print("Enter queue element: ");
        queue.add(sc.nextInt());
        System.out.println("Dequeued: " + queue.remove());
    }
}
