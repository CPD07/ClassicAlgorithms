"""
This is the code for classic string matching algorithms in Python.
It compares the efficiency of Knuth–Morris–Pratt algorithm, brute force and Boyer–Moore string-search algorithm.
这是 Python 中经典字符串匹配算法的代码。
它比较了 Knuth-Morris-Pratt 算法，暴力破解算法和 Boyer-Moore 字符串搜索算法的效率。
"""

import timeit
#Knuth–Morris–Pratt algorithm
def build_next(key):
    next = [0]
    prefix_len = 0
    i = 1
    while i < len(key):
        if key[prefix_len] == key[i]:
            prefix_len += 1
            next.append(prefix_len)
            i += 1
        else:
            prefix_len = next[prefix_len - 1]
            if prefix_len == 0:
                next.append(0)
                i += 1
    return next

def kmp(string, key):
    next = build_next(key)
    i = 0
    j = 0
    while i < len(string):
        if string[i] == key[j]:
            i += 1
            j += 1
        elif j > 0:
            j = next[j - 1]
        else:
            i += 1
        if j == len(key):
            return i - j
    return -1
#brute force / 暴力破解
def brute_force(string, key):
    n = len(string)
    m = len(key)
    for i in range(n - m + 1):
        j = 0
        while j < m and string[i + j] == key[j]:
            j += 1
        if j == m:
            return i
    return -1
#Boyer–Moore string-search algorithm
def bm(string, key):
    n = len(string)
    m = len(key)
    bad_char = {}
    for i in range(m):
        bad_char[key[i]] = i
    p = 0 
    while p <= n - m:
        j = m - 1
        while j >= 0 and key[j] == string[p + j]:
            j -= 1
        if j < 0:
            return p
        else:
            bad_shift = j - bad_char.get(string[p + j], -1)
            p += max(1, bad_shift)
    return -1

string = input("Please input your string: ")
key = input("Please input your key: ")

time_a = timeit.timeit(lambda: kmp(string, key), number=1000)
time_b = timeit.timeit(lambda: brute_force(string, key), number=1000)
time_c = timeit.timeit(lambda: bm(string, key), number=1000)

print(f"KMP took {time_a} seconds for 1000 runs.")
print(f"Brute force took {time_b} seconds for 1000 runs.")
print(f"BM took {time_c} seconds for 1000 runs.")
