/* This is the code for printing out various shapes in Java.
这是用循环代码打出各种图形 Java 代码。
*/

public class shapes {
    public static void main(String[] args) {
        int n = 5;
//prints out equilateral triangle
//打出等腰三角形
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//prints out parallelogram
//打出平行四边形
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*n-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//prints out rhombus
//打出菱形        
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = (n-i+1)*2-1; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//prints out 2 right angled triangles
//打出2个直角三角形
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = (n-i)*2-1; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//prints out 2 right angled triangles upside down
//打出2个倒着的直角三角形
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= (2*i)-3; k++) {
                System.out.print(" ");
            }
            for (int l = n-i+1; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//prints out "butterfly"
//打出"蝴蝶"
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = (n-i)*2-1; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= (2*i)-3; k++) {
                System.out.print(" ");
            }
            for (int l = n-i+1; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}