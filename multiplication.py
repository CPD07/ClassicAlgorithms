"""
This is the code for printing the multiplication table in Python.
这是用循环代码打出乘法表的 Python 代码。
"""

for i in range(1, 10):
    for j in range(1, i+1):
        print(f"{i}*{j}={i*j} ", end="")
    print()