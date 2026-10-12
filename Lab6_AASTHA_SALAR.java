/*import java.util.*;
class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                if (sum == 0) {
                    System.out.println(a[i] + " " + a[l] + " " + a[r]);
                    l++;
                    r--;
                } else if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
    }
}
import java.util.*;
class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}*/
import java.util.*;
class Lab6 {
    static void hanoi(int n, char s, char a, char d) {
        if (n == 1) {
            System.out.println(s + " -> " + d);
            return;
        }
        hanoi(n - 1, s, d, a);
        System.out.println(s + " -> " + d);
        hanoi(n - 1, a, s, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter disks: ");
        int n = sc.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }
}
