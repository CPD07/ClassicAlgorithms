"""
This is the code for printing the Pascal's triangle in Python using dynamic programming.
这是用递归算法打出杨辉三角的 Python 代码。
"""

n = 12

def pascal(n, k):
    if k == 0 or k == n:
        return 1
    return pascal(n-1, k-1) + pascal(n-1, k)
    
def print_triangle(n):
    for i in range(n):
        for j in range(n-i):
            print("   ", end="")
        for k in range(i+1):
            if k>0:
                print("   ", end="")
            print(f"{pascal(i, k):3}", end="")
        print()

print_triangle(n)