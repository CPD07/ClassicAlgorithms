"""
This is the code for the classic maths puzzle in Python.
We use this to find square numbers that are in aabb forms.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决数学问题的 Python 代码。
这个算法可以帮我们找出aabb形式的完全平方数。
它因运用循环代码而闻名。
"""

import math
for a in range(1, 10):
    for b in range(0, 10):
        num = a*1100+b*11
        if int(math.sqrt(num)) == math.sqrt(num):

            print(num)
