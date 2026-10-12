import java.util.Scanner;
public class Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int count = 0;
            for (char c = 'a'; c <= 'z'; c++) {
                int freq = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == c)
                        freq++;
                }
                count += freq / 2;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
