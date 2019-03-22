import random
from MergeSort import merge
def BubbleSort(arr): 
    for pass_num in range(len(arr)-1, 0, -1):
        for i in range(pass_num):
            
            if arr[i] > arr[i+1]:
                temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp

    return arr

def CreateArrLeft():
    file = open("ArrLeft.txt", "w")
    
    n = random.randint(1,1001)
    newarr = [] 
    file.write(str(n) + "\n")
    for i in range(n):
        a = random.randint(1,1000001)
        file.write(str(a) + "\n")
        newarr.append(a)
    
    file.close() 

    return newarr

def CreateArrRight():
    file = open("ArrRight.txt", "w")
    
    n = random.randint(1,1001)
    newarr = [] 
    file.write(str(n) + "\n")
    for i in range(n):
        a = random.randint(1,1000001)
        file.write(str(a) + "\n")
        newarr.append(a)
    
    file.close() 

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

def WriteArr(arr):
    n = len(arr)

    file = open("Output.txt","w")
    for i in range(n):
        file.write(str(arr[i]) + "\n")
    file.close() 

def Driver():
    arrLeft = CreateArrLeft()
    arrRight =  CreateArrRight()

    arrLeft = BubbleSort(arrLeft)
    arrRight = BubbleSort(arrRight)

    arr = merge(arrLeft, arrRight)

    WriteArr(arr)
    Check(arr, arrLeft, arrRight)

Driver()