import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 sorted elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = 4;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            } else if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Not Found");
    }
}