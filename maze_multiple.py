"""
This is the code to find multiple solutions to solve a maze in Java using dynamic programming.
2 represents the walls, 0 represents the paths.
这是用递归算法找出多种迷宫解法的 Java 代码。
2代表墙，0代表路。
"""

maze = [
    [2, 2, 2, 2, 2, 2, 2],
    [2, 0, 0, 0, 0, 0, 2],
    [2, 0, 2, 2, 0, 0, 2],
    [2, 0, 0, 0, 0, 0, 2],
    [2, 2, 2, 2, 0, 2, 2],
    [2, 0, 0, 0, 0, 0, 2],
    [2, 2, 2, 2, 2, 2, 2]
]

startX = 1
startY = 1
endX = 5
endY = 5

paths = []
colors = [
    "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m",
    "\u001B[35m", "\u001B[36m", "\u001B[91m", "\u001B[92m"
]

def solve(X, Y, path):
    maze[X][Y] = 1
    path.append((X, Y))
    if X == endX and Y == endY:
        paths.append(path[:])
    else:
        if Y + 1 < 7 and maze[X][Y+1] == 0:
            solve(X, Y+1, path)
        if Y - 1 >= 0 and maze[X][Y-1] == 0:
            solve(X, Y-1, path)
        if X + 1 < 7 and maze[X+1][Y] == 0:
            solve(X+1, Y, path)
        if X - 1 >= 0 and maze[X-1][Y] == 0:
            solve(X-1, Y, path)
    path.pop()
    maze[X][Y] = 0

for X in range(7):
    for Y in range(7):
        if maze[X][Y] == 2:
            print("|", end="")
        else:
            print(" ", end="")
    print()
print()

solve(startX, startY, [])

if len(paths) == 0:
    print("There is no exit!")
else:
    for i in range(len(paths)):
        path = paths[i]
        color = colors[i]
        print("Path", i + 1)
        for X in range(7):
            for Y in range(7):
                if maze[X][Y] == 2:
                    print("|", end="")
                elif (X, Y) in path:
                    print(color + "." + "\u001B[0m", end="")
                else:
                    print(" ", end="")
            print()
        print()