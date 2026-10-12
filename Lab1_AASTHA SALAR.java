/*import java.util.Scanner;
class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5], top = -1;
        System.out.print("Enter 2 elements: ");
        a[++top] = sc.nextInt();
        a[++top] = sc.nextInt();
        System.out.println("Popped: " + a[top--]);
    }
}*/
import java.util.Scanner;
class Lab1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5], front = 0, rear = -1;
        System.out.print("Enter 3 elements: ");
        for (int i = 0; i < 3; i++)
            a[++rear] = sc.nextInt();
        System.out.println("Deleted: " + a[front++]);
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
            System.out.print(a[i] + " ");
    }
}