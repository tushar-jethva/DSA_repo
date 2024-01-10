package Question_6.B;

public class q1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};

        findKthPositive(arr,5);
    }
    static int findKthPositive(int[] arr, int k)
    {
        int n = arr.length;
        int start = 0, end = n - 1, mid, ans=-1;
        while (start <= end)
        {
            mid = start + (end - start) / 2;
            int missed = arr[mid] - mid - 1;
            if (missed >= k)
            {
                ans = arr[mid] - (missed - k) - 1;
                end = mid - 1;
            }
            if (missed < k)
            {
                start = mid + 1;
                ans = arr[mid] + k - missed;
            }
        }
        return ans;
    }
}
