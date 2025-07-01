/* This is the code for printing the Pascal's triangle in Java using dynamic programming.
这是用递归算法打出杨辉三角的 Java 代码。
*/

public class Pascal_dp {
    public static void main(String[] args) {
        int n = 12;
        for(int i = 0; i <= n; i++) {
            long c = 1;
            for(int k = 0; k <= i; k++) {
                if (k == 0) {
                    for (int j = 0; j <= n-i; j++) {
                        System.out.print("   ");
                    }
                }else{
                    System.out.print("   ");
                }
                System.out.printf("%3d", c);
                c = c * (i - k) / (k + 1);
            }
            System.out.println();
        }
        }
    }