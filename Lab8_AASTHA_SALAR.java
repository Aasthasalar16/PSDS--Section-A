/*import java.util.*;
class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt(), sum = 0;
        for (int i = 0; i < k; i++)
            sum += a[i];
        int max = sum;
        for (int i = k; i < n; i++) {
            sum += a[i] - a[i - k];
            max = Math.max(max, sum);
        }
        System.out.println("Maximum sum: " + max);
    }
}import java.util.*;
class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i)))
                set.remove(s.charAt(start++));
            set.add(s.charAt(i));
            max = Math.max(max, i - start + 1);
        }
        System.out.println(max);
    }
}*/
import java.util.*;
class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] edges = new int[m][3];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < 3; j++)
                edges[i][j] = sc.nextInt();
        int src = sc.nextInt(), dest = sc.nextInt(), k = sc.nextInt();
        int[] d = new int[n];
        Arrays.fill(d, 999999);
        d[src] = 0;
        for (int i = 0; i < k; i++) {
            int[] nd = d.clone();
            for (int[] e : edges)
                if (d[e[0]] != 999999)
                    nd[e[1]] = Math.min(nd[e[1]], d[e[0]] + e[2]);
            d = nd;
        }
        System.out.println(d[dest] == 999999 ? -1 : d[dest]);
    }
}