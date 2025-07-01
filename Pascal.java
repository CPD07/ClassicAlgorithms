/* This is the code for printing the Pascal's triangle in Java using loops.
这是用循环代码打出杨辉三角的 Java 代码。
*/

public class Pascal {
    public static long combin(int n, int k) {
        long c = 1;
        for (int i = 1; i <= k; i++) {
            c = c*(n-i+1)/i;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 12;
        for(int i = 0; i <= n; i++) {
            for(int k = 0; k <= i; k++) {
                if (k == 0) {
                    for (int j = 0; j <= n-i; j++) {
                        System.out.print("   ");
                    }
                }else{
                    System.out.print("   ");
                }
                System.out.printf("%3d", combin(i, k));
            }
            System.out.println();
        }
        }
    }