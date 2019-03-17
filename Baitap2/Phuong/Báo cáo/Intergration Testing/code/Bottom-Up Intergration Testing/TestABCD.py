import random
                                # D
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

                                # D merge
    arr = merge(arrLeft, arrRight)
                                # end D
    return arr
                                # end B 

                                # A
def main():
    file = open("Input.txt","r")
    arr = []
    n = int(file.readline())
    for i in range(n):
        arr.append(int(file.readline()))
    file.close()

    arr = merge_sort(arr)

    file = open("Output.txt","w")
    for i in range(n):
        file.write(str(arr[i]) + "\n")
    file.close()

    Check(arr, n)
                                # end A

def RandInput():
    file = open("Input.txt", "w")
    
    n = random.randint(1,1001)
    file.write(str(n) + "\n")
    for i in range(n):
        file.write(str(random.randint(1,1000001)) + "\n")
    
    file.close() 

def Check(arr, n):
    file = open("Check.txt","w")
    if n!= len(arr):
        file.write("False")
        return

    for i in range(n-1):
        if not(arr[i] <= arr[i+1]):
            file.write("False")
            return

    file.write("True")
    return

def TestABCD():
    RandInput()
    main()

TestABCD()

#a=input('press any key to exit smilie')