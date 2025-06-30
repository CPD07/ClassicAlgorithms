/* This is the code for printing the multiplication table in Java.
这是用循环代码打出乘法表的 Java 代码。
*/

public class multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}