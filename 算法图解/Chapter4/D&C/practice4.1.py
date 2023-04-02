def summary(arr):
    if arr == []:
        return 0
    else:
        return arr[0] + sum(arr[1:])

print(summary([1,2,3]))