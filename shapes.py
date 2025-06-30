"""
This is the code for printing out various shapes in Python.
这是用循环代码打出各种图形 Python 代码。
"""


n=5
#prints out equilateral triangle
#打出等腰三角形
for i in range(1, n+1):
    for j in range(n-i, 0, -1):
        print(" ", end="")
    for k in range(2*i-1):
        print("*", end="")
    print()

print()
#prints out parallelogram
#打出平行四边形
for i in range(1, n+1):
    for j in range(n-i, 0, -1):
        print(" ", end="")
    for k in range(1, 2*n):
        print("*", end="")
    print()

print()
#prints out rhombus
#打出菱形
for i in range(1, n+1):
    for j in range(n-i, 0, -1):
        print(" ", end="")
    for k in range(2*i-1):
        print("*", end="")
    print()
for i in range(1, n):
    for j in range(i):
        print(" ", end="")
    for k in range((n-i)*2-1, 0, -1):
        print("*", end="")
    print()

print()
#prints out 2 right angled triangles
#打出2个直角三角形
for i in range(1, n+1):
    for j in range(1, i+1):
        print("*", end="")
    for k in range((n-i)*2-1, -1, -1):
        print(" ", end="")
    for l in range(1, i+1):
        print("*", end="")
    print()

print()
#prints out 2 right angled triangles upside down
#打出2个倒着的直角三角形
for i in range(1, n+1):
    for j in range(n-i+1, 0, -1):
        print("*", end="")
    for k in range(2*i-2):
        print(" ", end="")
    for l in range(n-i+1, 0, -1):
        print("*", end="")
    print()

print()
#prints out "butterfly"
#打出"蝴蝶"
for i in range(1, n+1):
    for j in range(1, i+1):
        print("*", end="")
    for k in range((n-i)*2-1, -1, -1):
        print(" ", end="")
    for l in range(1, i+1):
        print("*", end="")
    print()
for i in range(1, n+1):
    for j in range(n-i+1, 0, -1):
        print("*", end="")
    for k in range(2*i-2):
        print(" ", end="")
    for l in range(n-i+1, 0, -1):
        print("*", end="")
    print()