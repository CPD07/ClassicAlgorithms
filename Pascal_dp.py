"""
This is the code for printing the Pascal's triangle in Python using dynamic programming.
这是用递归算法打出杨辉三角的 Python 代码。
"""

n = 12
for i in range(n):
    c = 1
    for k in range(i+1):
        if k == 0:
            for j in range(n-i):
                print("   ", end="")
        else:
            print("   ", end="")
        print(f"{c:3}", end="")
        c = c * (i - k) // (k + 1)
    print()