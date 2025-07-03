"""
This is the code for sorting a list in Python using merge sort.
这是用归并排序排数列的 Python 代码。
"""


A = [1, 65, 46 ,57, 555, 24, 0, 24, 62, 99, 3, 0]

def mergesort(A, low, high):
    if low < high:
        mid = (low+high)//2
        mergesort(A, low, mid)
        mergesort(A, mid+1, high)
        merge(A, low, mid, high)

def merge(A, low, mid, high):
    B = A[low:high+1]
    i = 0
    j = mid - low + 1
    k = low
    while i <= mid-low and j <= high-low:
        if B[i] <= B[j]:
            A[k] = B[i]
            i += 1
        else:
            A[k] = B[j]
            j += 1
        k += 1
    while i <= mid-low:
        A[k] = B[i]
        i += 1
        k += 1
    while j <= high-low:
        A[k] = B[j]
        j += 1
        k += 1
        
mergesort(A, 0, len(A)-1)
print(A)