def __validate_(arr):
    if (type(arr) is not list):
        return False
    for x in arr:
        if (type(x) is not int):
            return False
    return True

def merge(arrLeft, arrRight):
    if (not __validate_(arrLeft)):
        raise ValueError("arrLeft is not a list of int!")
    if (not __validate_(arrRight)):
        raise ValueError("arrRight is not a list of int!")
    lenL = len(arrLeft); lenR = len(arrRight)
    result = []; idxL = 0; idxR = 0
    
    while idxL < lenL and idxR < lenR:
        if (arrLeft[idxL] < arrRight[idxR]):
            result.append(arrLeft[idxL])
            idxL += 1
        else:
            result.append(arrRight[idxR])
            idxR += 1
    while idxL < lenL:
        result.append(arrLeft[idxL])
        idxL += 1
    while idxR < lenR:
        result.append(arrRight[idxR])
        idxR += 1

    return result

def sort(arr):
    if (not __validate_(arr)):
        raise ValueError("arr is not a list of int!")
    if (len(arr) <= 1):
        return arr
    middle = len(arr) // 2
    arrLeft = sort(arr[0: middle])
    arrRight = sort(arr[middle: len(arr)])
    result = merge(arrLeft, arrRight)
    return result
