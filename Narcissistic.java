/* This is the code for the classic Narcissistic number problem in Java.
We use this to find 3-digit Narcissistic numbers (The sum of its digits cubed is the number itself).
It is famous for utilising loop algorithms.
这是用经典的循环代码找到水仙花数的 Java 代码。
这个算法可以帮我们找出三位数的水仙花数（每位数的三次方的和等于这个数本身）。
它因运用循环代码而闻名。
*/

public class Narcissistic {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i/10)%10;
            int c = i/100;
            if (a*a*a+b*b*b+c*c*c == c*100+b*10+a) {
                System.out.println(c*100+b*10+a);
            }
            }
        }
    }