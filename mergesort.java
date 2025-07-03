/* This is the code for sorting a list in Python using merge sort.
这是用归并排序排数列的 Python 代码。
*/

public class mergesort {
    static int[] B;
    public static void merge (int A[], int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            B[k] = A[k];
        }
        int i = low, j = mid + 1, k = i;
        while (i <= mid && j <= high) {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= mid) {
            A[k++] = B[i++];
        }
        while (j <= high) {
            A[k++] = B[j++];
        }
    }
    public static void mergesort (int A[], int low, int high) {
        if (low < high) {
            int mid = (low+high)/2;
            mergesort(A, low, mid);
            mergesort(A, mid+1, high);
            merge(A, low, mid, high);
        }
    }
    public static void main (String[] args) {
        int[] A = {1, 65, 46 ,57, 555, 24, 0, 24, 62, 99, 3, 0};
        B = new int[A.length];
        mergesort(A, 0, A.length - 1);
        for (int val : A) {
            System.out.print(val + " ");
        }
    }
}