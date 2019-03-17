                                # D merge
def merge(arrLeft, arrRight):
    newlist = []

    lenL = len(arrLeft)
    lenR = len(arrRight)
    idxL=0 
    idxR=0

    while (idxL < lenL) & (idxR < lenR):
        if arrLeft[idxL] < arrRight[idxR]:
            newlist.append(arrLeft[idxL])
            idxL = idxL + 1
        else:
            newlist.append(arrRight[idxR])
            idxR = idxR + 1

    while idxL < lenL:
        newlist.append(arrLeft[idxL])
        idxL = idxL + 1

    while idxR < lenR:
        newlist.append(arrRight[idxR])
        idxR = idxR + 1

    return newlist
                                # end D

                                # B
def merge_sort(arr):
    if len(arr) <= 1:
        return arr

                                # C divide arr into
    mid = len(arr)//2
    arrLeft = arr[0 : mid]
    arrRight = arr[mid : len(arr)]
                                # end C
                                
    arrLeft = merge_sort(arrLeft)
    arrRight = merge_sort(arrRight)

                                # D merge_sort two small lists
    arr = merge(arrLeft, arrRight)
                                # end D

    return arr

                                # end B 

                                # A
def main():
    print("input a list:")
    arr = []
    n = int(input())
    for i in range(n):
        arr.append(int(input()))

    arr = merge_sort(arr)
    print("sorted list:")
    print(arr)

    a = input('press any key to exit smilie')
                                # end A

main()
