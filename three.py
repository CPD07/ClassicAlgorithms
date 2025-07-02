"""
This is the code for solving the Dutch Flag Sort problem in Python.
这是解决荷兰国旗问题的 Python 代码。
"""

color = ['r', 'w', 'r', 'b', 'w', 'r', 'w', 'b', 'r']
s = 0
m = 0
e = len(color)-1

def swap(x, y):
    temp = color[x]
    color[x] = color[y]
    color[y] = temp

for i in range(len(color)):
    print(color[i], end="")
while (s <= e):
    if color[s] == 'w':
        s += 1
    elif color[s] == 'b':
        swap(s, e)
        e -= 1
    else:
        swap(m, s)
        s += 1
        m += 1
print()
for i in range(len(color)):
    print(color[i], end="")