"""
This is the code for finding a solution to a maze in Java using dynamic programming.
2 represents the walls, 0 represents the paths.
这是用递归算法找出迷宫解法的 Java 代码。
2代表墙，0代表路。
"""

maze = [
    [2, 2, 2, 2, 2, 2, 2],
    [2, 0, 0, 0, 2, 0, 2],
    [2, 0, 2, 2, 2, 0, 2],
    [2, 0, 0, 0, 0, 0, 2],
    [2, 2, 2, 2, 0, 2, 2],
    [2, 0, 0, 0, 0, 0, 2],
    [2, 2, 2, 2, 2, 2, 2]
]
startX = 1
startY = 1
endX = 5
endY = 5
success = 0

def solve(X, Y):
    global success
    maze[X][Y] = 1
    if X == endX and Y == endY:
        success = 1
    if success != 1 and Y + 1 < 7 and maze[X][Y+1] == 0:
        solve(X, Y+1)
    if success != 1 and Y - 1 >= 0 and maze[X][Y-1] == 0:
        solve(X, Y-1)
    if success != 1 and X + 1 < 7 and maze[X+1][Y] == 0:
        solve(X+1, Y)
    if success != 1 and X - 1 >= 0 and maze[X-1][Y] == 0:
        solve(X-1, Y)
    if success != 1:
        maze[X][Y] = 0
    return success

for X in range(7):
    for Y in range(7):
        if maze[X][Y] == 2:
            print("|", end="")
        else:
            print(" ", end="")
    print()
print()
if solve(startX, startY) == 0:
    print("There is no exit!")
else:
    for X in range(7):
        for Y in range(7):
            if maze[X][Y] == 2:
                print("|", end="")
            elif maze[X][Y] == 1:
                print("\u001B[32m" + "." + "\u001B[0m", end="")
            else:
                print(" ", end="")
        print()