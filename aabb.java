/* This is the code for the classic maths puzzle in Java.
We use this to find square numbers that are in aabb forms.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决数学问题的 Java 代码。
这个算法可以帮我们找出aabb形式的完全平方数。
它因运用循环代码而闻名。
*/

public class aabb {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int num = a*1100+b*11;
                if (Math.floor((Math.sqrt(num))) == Math.sqrt(num)) {
                    System.out.println(num);
            }
            }
        }
    }
}