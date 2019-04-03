import datetime

def __validate_(arr):
    if (type(arr) is not list):
        return False
    for x in arr:
        if (type(x) is not int):
            return False
    return True

def __merge_(arr, fr, middle, to):
    cache = arr[fr:to]
    idLeft = fr; idRight = middle; iterPos = fr
    while (idLeft < middle and idRight < to):
        if (cache[idLeft - fr] < cache[idRight - fr]):
            arr[iterPos] = cache[idLeft - fr]
            idLeft += 1
        else:
            arr[iterPos] = cache[idRight - fr]
            idRight += 1
        iterPos += 1

    while (idLeft < middle):
        arr[iterPos] = cache[idLeft - fr]
        iterPos += 1
        idLeft += 1

    while (idRight < to):
        arr[iterPos] = cache[idRight - fr]
        iterPos += 1
        idRight += 1

def __sort_recursive_(arr, fr, to):
    length = to - fr
    if (length <= 1):
        return
    middle = fr + (length >> 1)
    __sort_recursive_(arr, fr, middle)
    __sort_recursive_(arr, middle, to)
    __merge_(arr, fr, middle, to)

def sort(arr):
    if (not __validate_(arr)):
        raise ValueError("arr is not a list of int!")
    __sort_recursive_(arr, 0, len(arr))

def main():
    inputFile = open("test.txt", "r")
    n = int(inputFile.readline())
    array = list(map(int, inputFile.readline().split()))

    start_time = datetime.datetime.now()
    sort(array)
    end_time = datetime.datetime.now()
    print(end_time - start_time)
    
if __name__ == '__main__':
    main()