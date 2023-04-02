def element(arr):
    if arr == []:
        return 0
    else:
        return 1 + element(arr[1:])

print(element([1,2,3,4]))