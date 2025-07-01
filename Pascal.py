"""
This is the code for printing the Pascal's triangle in Python using loops.
这是用循环代码打出杨辉三角的 Python 代码。
"""

n = 12
def combin(n, k):
    c = 1
    for i in range(1, k+1):
        c = c*(n-i+1)//i
    return c
for i in range(n):
    for k in range(i+1):
        if k == 0:
            for j in range(n-i):
                print("   ", end="")
        else:
            print("   ", end="")
        print(f"{combin(i, k):3}", end="")
    print()