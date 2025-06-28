"""
This is the code for the classic Permutation and Combination problem in Python.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决排列组合问题的 Python 代码。
它因运用循环代码而闻名。
"""

n = int(input("Please input the total number of things you want to arrange and combine: "))
k = int(input("Please input the number of things you want to arrange and combine: "))
A = 1
C = 1
for i in range(n, n-k, -1):
    A = i * A
    C = (i/(i-(n-k)))*C
print(f"There are {A} ways to arrange this")
print(f"There are (int(C)) ways to combine this")
