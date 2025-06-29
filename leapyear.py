"""
This is the code for the classic leap year problem in Java.
We use this to find leapyears that are between 1900-2025.
It is famous for utilising loop algorithms.
这是用经典的循环代码解决闰年问题的 Java 代码。
这个算法可以帮我们找出1900-2025之间的闰年。
它因运用循环代码而闻名。
"""

for i in range(1900, 2025):
    if i%4 == 0 and i%100 != 0:
        print(i)
    if i%400 == 0:
        print(f"Year {i} is a super leap year!")