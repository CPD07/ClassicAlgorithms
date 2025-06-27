/* This is the code for the classic Fibonacci number problem in Java.
It is famous for utilising dynamic programming.
这是经典斐波那契数列问题的 Java 代码。
它因运用递归算法而闻名。
*/

import java.util.Scanner;

public class Fibonacci {
    public static int Fib(int n){
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return Fib(n-1) + Fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input which Fibonacci number you are interested to know: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + Fib(n));
    }
}
