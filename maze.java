/* This is the code for finding a solution to a maze in Java using dynamic programming.
2 represents the walls, 0 represents the paths.
这是用递归算法找出迷宫解法的 Java 代码。
2代表墙，0代表路。
*/

public class maze {
    static int success = 0;
    public static void main(String[] args) {
        int[][] maze = {
            {2, 2, 2, 2, 2, 2, 2},
            {2, 0, 0, 0, 2, 0, 2},
            {2, 0, 2, 2, 2, 0, 2},
            {2, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 0, 2, 2},
            {2, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 2, 2}
        };
        int startX = 1;
        int startY = 1;
        int endX = 5;
        int endY = 5;
        int X, Y;
        for (X = 0; X < 7; X++) {
            for (Y = 0; Y < 7; Y++) {
                if (maze[X][Y] == 2) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        solve(maze, endX, endY, startX, startY);
        if (success == 0) {
            System.out.print("There is no exit!");
        }
        else {
            for (X = 0; X < 7; X++) {
                for (Y = 0; Y < 7; Y++) {
                    if (maze[X][Y] == 2) {
                        System.out.print("|");
                    }
                    else if (maze[X][Y] == 1){
                        System.out.print("\u001B[32m" + "." + "\u001B[0m");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void solve(int[][] maze, int endX, int endY, int X, int Y) {
        maze[X][Y] = 1;
        if (X == endX && Y == endY) {
            success = 1;
            return;
        }
        if(success != 1 && maze[X][Y+1] == 0) {
            solve(maze, endX, endY, X, Y+1);
        }
        if(success != 1 && maze[X][Y-1] == 0) {
            solve(maze, endX, endY, X, Y-1);
        }
        if(success != 1 && maze[X+1][Y] == 0) {
            solve(maze, endX, endY, X+1, Y);
        }
        if(success != 1 && maze[X-1][Y] == 0) {
            solve(maze, endX, endY, X-1, Y);
        }
        if (success != 1) {
            maze[X][Y] = 0;
        }
    }
}