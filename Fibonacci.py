"""
This is the code for the classic Fibonacci number problem in Python.
It is famous for utilising dynamic programming.
这是经典斐波那契数列问题的 Python 代码。
它因运用递归算法而闻名。
"""

def Fib(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return Fib(n-1) + Fib(n-2)
        
n = int(input("Please input which Fibonacci number you are interested to know: "))
print(f"The {n}th Fibonacci number is", Fib(n))
