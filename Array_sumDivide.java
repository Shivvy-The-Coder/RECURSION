import java.util.*;

public class Array_sumDivide {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.println(countDivision(arr, 0, arr.length - 1));
        }

        sc.close();
    }

    public static int countDivision(int[] arr, int si, int li) {
        int sum = getSum(arr, si, li);

        if (li - si <= 0)
            return 0;

        int mid = getMid(arr, si, li, sum);
        if (mid == -1)
            return 0;

        int ct1 = countDivision(arr, si, mid);
        int ct2 = countDivision(arr, mid + 1, li);
        
        return Math.max(ct1, ct2) + 1;
    }

    public static int getSum(int[] arr, int si, int li) {
        int sum = 0;
        for (int i = si; i <= li; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMid(int[] arr, int si, int li, int sum) {
        int leftSum = 0;
        
        for (int i = si; i < li; i++) {
            leftSum += arr[i];
            int rightSum = sum - leftSum;
            
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
