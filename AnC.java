/* This is the code for the classic Permutation and Combination problem in Java.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决排列组合问题的 Java 代码。
它因运用循环代码而闻名。
*/

import java.util.Scanner;

public class AnC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the total number of things you want to arrange and combine: ");
        int n = scanner.nextInt();
        System.out.println("Please input the number of things you want to arrange and combine: ");
        int k = scanner.nextInt();
        int A = 1;
        float C = 1;
        for (int i=n-k+1; i<=n; i++) {
            A = i * A;
            C = (float) ((i*1.0/(i-(n-k)))*C);
        }
        System.out.printf("There are %s ways to arrange this\n", A);
        System.out.printf("There are %s ways to combine this", (int) C);
    }
}