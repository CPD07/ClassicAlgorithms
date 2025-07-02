/* This is the code for solving the Dutch Flag Sort problem in Java.
这是解决荷兰国旗问题的 Java 代码。
*/

public class three {
    public static void swap(char[] color, int x, int y) {
        char temp = color[x];
        color[x] = color[y];
        color[y] = temp;
    }
    public static void main(String[] args) {
        char[] color = {'r', 'w', 'r', 'b', 'w', 'r', 'w', 'b', 'r'};
        int s = 0;
        int m = 0;
        int e = color.length-1;
        for (int i = 0; i < color.length; i++) {
            System.out.print(color[i]);
        }
        while (s <= e) {
            if (color[s] == 'w') {
                s++;
            } else if (color[s] == 'b') {
                swap(color, s, e);
                e--;
            } else {
                swap(color, m, s);
                m++;
                s++;
            }
        }
        System.out.println();
        for (int i = 0; i < color.length; i++) {
            System.out.print(color[i]);
        }
    }
}