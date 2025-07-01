/* This is the code for printing the Pascal's triangle in Java using dynamic programming.
这是用递归算法打出杨辉三角的 Java 代码。
*/

public class Pascal_dp {
    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n-1, k-1) + pascal(n-1, k);
    }
    public static void print_triangle(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k <= i; k++) {
                if (k>0) {
                    System.out.print("   ");
                }
                System.out.printf("%3d", pascal(i, k));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 12;
        print_triangle(n);
    }
}