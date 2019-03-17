import random

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

def BubbleSort(arr):
    for pass_num in range(len(arr)-1, 0, -1):
        for i in range(pass_num):
            
            if arr[i] > arr[i+1]:
                temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp

    return arr

def Fakearr():
    file = open("Input.txt", "w")
    
    n = random.randint(1,1001)
    newarr = []
    file.write(str(n) + "\n")
    for i in range(n):
        a = random.randint(1,1000001)
        file.write(str(a) + "\n")
        newarr.append(a)
    
    file.close() 

    newarr = BubbleSort(newarr)
    return newarr

def Check(arr, arrLeft, arrRight):
    file = open("Check.txt", "w")
    n1 = len(arrLeft)
    n2 = len(arrRight)
    n = len(arr) 
    
    if n != n1 + n2:
        file.write("False\n")
        return

    for i in range(n-1):
        if not(arr[i] <= arr[i+1]):
            file.write("False\n")
            return

    file.write("True\n")  
    file.close()

def Writearr(arr):
    n = len(arr)

    file = open("Output.txt","w")
    for i in range(n):
        file.write(str(arr[i]) + "\n")
    file.close() 

def TestD():
    arrLeft = Fakearr()
    arrRight =  Fakearr()
    arr = merge(arrLeft, arrRight)
    Writearr(arr)
    Check(arr, arrLeft, arrRight)

TestD()

'''
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
                                # end A

main()
'''
