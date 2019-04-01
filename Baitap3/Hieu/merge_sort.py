def __validate_(arr):
    if (type(arr) is not list):
        return False
    for x in arr:
        if (type(x) is not int):
            return False
    return True

def merge(left, right):
    if (not __validate_(left)):
        raise ValueError("left is not a list of int!")
    if (not __validate_(right)):
        raise ValueError("right is not a list of int!")
    lenL = len(left); lenR = len(right)
    result = []; idLeft = 0; idRight = 0
    for i in range(lenL + lenR):
        if (idLeft == lenL):
            result.append(right[idRight])
            idRight += 1
        else:
            if (idRight == lenR):
                result.append(left[idLeft])
                idLeft += 1
            else:
                if (left[idLeft] < right[idRight]):
                    result.append(left[idLeft])
                    idLeft += 1
                else:
                    result.append(right[idRight])
                    idRight += 1
    return result

def sort(arr):
    if (not __validate_(arr)):
        raise ValueError("arr is not a list of int!")
    if (len(arr) <= 1):
        return arr
    middle = len(arr) // 2
    left = sort(arr[0: middle])
    right = sort(arr[middle: len(arr)])
    result = merge(left, right)
    breakpoint()
    return result

def main():
    array = []
    n = int(input())
    for i in range(n):
        a = int(input())
        array.append(a)
    array = sort(array)
    for i in range(n):
        print(array[i])
main()