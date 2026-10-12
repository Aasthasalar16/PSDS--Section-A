/*import java.util.*;
class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int l = 0, r = n - 1;
        while (l < r) {
            System.out.print(a[l++] + " ");
            System.out.print(a[r--] + " ");
        }
        if (l == r)
            System.out.print(a[l]);
    }
}
import java.util.*;
class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min.add(a[i]);
            max.add(a[i]);
        }
        System.out.println("Min Heap: " + min);
        System.out.println("Max Heap: " + max);
        System.out.println("Priority Queue (ascending):");
        while (!min.isEmpty())
            System.out.print(min.poll() + " ");
        Arrays.sort(a);
        System.out.println("\nHeap Sort: " + Arrays.toString(a));
    }
}*/
import java.util.*;
class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int target = sc.nextInt(), sum = 0, start = 0, min = n + 1;
        for (int end = 0; end < n; end++) {
            sum += a[end];
            while (sum > target) {
                min = Math.min(min, end - start + 1);
                sum -= a[start++];
            }
        }

        System.out.println(min == n + 1 ? 0 : min);
    }
}