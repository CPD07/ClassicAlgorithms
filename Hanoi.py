"""
This is the code for the classic tower of hanoi problem in Python.
It is famous for utilising dynamic programming.
这是经典汉诺塔问题的 Python 代码。
它因运用递归算法而闻名。
"""

def Hanoi(n, A, B, C):
    if n == 1:
        print(f"Move plate {n} from disk {A} to disk {C}")
    else:
        Hanoi(n-1, A, C, B)
        print(f"Move plate {n} from disk {A} to disk {C}")
        Hanoi(n-1, B, A, C)
        
n = int(input("Please input the number of disks you want to move: "))
Hanoi(n, 'A', 'B', 'C')
