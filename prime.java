/* This is the code for the classic prime number problem in Java.
We use this to find prime numbers that are between 100-200.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决素数问题的 Java 代码。
这个算法可以帮我们找出100-200之间的素数。
它因运用循环代码而闻名。
*/

public class prime {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    break;
                }
            if (i == j+1) {
                System.out.println(i);
            }
            }
        }
    }
}