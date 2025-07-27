/* This is the code to find multiple solutions to solve a maze in Java using dynamic programming.
2 represents the walls, 0 represents the paths.
这是用递归算法找出多种迷宫解法的 Java 代码。
2代表墙，0代表路。
*/

import java.util.*;

public class maze {
    static int[][] maze = {
        {2, 2, 2, 2, 2, 2, 2},
        {2, 0, 0, 0, 0, 0, 2},
        {2, 0, 2, 2, 0, 0, 2},
        {2, 0, 0, 0, 0, 0, 2},
        {2, 2, 2, 2, 0, 2, 2},
        {2, 0, 0, 0, 0, 0, 2},
        {2, 2, 2, 2, 2, 2, 2}
    };

    static int startX = 1;
    static int startY = 1;
    static int endX = 5;
    static int endY = 5;

    static List<List<int[]>> paths = new ArrayList<>();

    static String[] colors = {
        "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m",
        "\u001B[35m", "\u001B[36m", "\u001B[91m", "\u001B[92m"
    };

    public static void main(String[] args) {
        int X, Y;

        for (X = 0; X < 7; X++) {
            for (Y = 0; Y < 7; Y++) {
                if (maze[X][Y] == 2) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        solve(startX, startY, new ArrayList<>());

        if (paths.size() == 0) {
            System.out.println("There is no exit!");
        } else {
            for (int i = 0; i < paths.size(); i++) {
                List<int[]> path = paths.get(i);
                String color = colors[i];
                System.out.println("Path " + (i + 1));
                for (X = 0; X < 7; X++) {
                    for (Y = 0; Y < 7; Y++) {
                        if (maze[X][Y] == 2) {
                            System.out.print("|");
                        } else if (inPath(path, X, Y)) {
                            System.out.print(color + "." + "\u001B[0m");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

    public static void solve(int X, int Y, List<int[]> path) {
        maze[X][Y] = 1;
        path.add(new int[]{X, Y});

        if (X == endX && Y == endY) {
            paths.add(new ArrayList<>(path));
        } else {
            if (Y + 1 < 7 && maze[X][Y + 1] == 0) solve(X, Y + 1, path);
            if (Y - 1 >= 0 && maze[X][Y - 1] == 0) solve(X, Y - 1, path);
            if (X + 1 < 7 && maze[X + 1][Y] == 0) solve(X + 1, Y, path);
            if (X - 1 >= 0 && maze[X - 1][Y] == 0) solve(X - 1, Y, path);
        }

        path.remove(path.size() - 1);
        maze[X][Y] = 0;
    }

    public static boolean inPath(List<int[]> path, int x, int y) {
        for (int[] p : path) {
            if (p[0] == x && p[1] == y) return true;
        }
        return false;
    }
}
