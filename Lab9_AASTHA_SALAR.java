import java.util.*;
public class Lab9 {
    static long solve(int N, int[] A) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 0)
                return -1;
            sum += A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            System.out.println(solve(N, A));
        }
    }
}