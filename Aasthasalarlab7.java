/*import java.util.*;
public class main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = 0;
        while (left <= right) {
            result[index++] = arr[left++];
            if (index < n)
                result[index++] = arr[right--];
        }
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs((long) result[i] - result[i + 1]);
        }
        System.out.println("Rearranged Array:");
        System.out.println(Arrays.toString(result));
        System.out.println("Maximum Sum of Differences: " + sum);
    }
}*/
import java.util.*;
public class Aasthasalarlab7 {
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }    public static void main(String[] args) {
   PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);
        System.out.println("Priority Queue:");
        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");
        int[] arr = {1,7,4,2,5,3};
        heapSort(arr);
        System.out.println("\nSorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
/*public class main {
           public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int target = 7;
        int start = 0;
        int sum = 0;
        int minLength = arr.length + 1;
        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            while (sum > target) {
                int length = end - start + 1;
                if (length < minLength)
                    minLength = length;
                sum = sum - arr[start];
                start++;
            }
        }
        if (minLength == arr.length + 1)
            System.out.println(-1);
        else
            System.out.println("Smallest Length = " + minLength);
    }
}*/
