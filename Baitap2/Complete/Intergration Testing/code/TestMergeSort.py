import random
from MergeSort import sort

def CreateArr():
    file = open("Input.txt", "w")
    
    n = random.randint(6,10)
    newarr = []
    file.write(str(n) + "\n")
    for i in range(n):
        a = random.randint(1,100)
        file.write(str(a) + "\n")
        newarr.append(a)
    
    file.close() 

    return newarr

def WriteArr(arr):
    n = len(arr)

    file = open("Output.txt","w")
    for i in range(n):
        file.write(str(arr[i]) + "\n")
    file.close() 

def Check(arr):
    file = open("Check.txt", "w")
    n = len(arr) 

    for i in range(n-1):
        if not(arr[i] <= arr[i+1]):
            file.write("False\n")
            return

    file.write("True\n")  
    file.close()
def Driver():
    arr = CreateArr()
    arr = sort(arr)
    WriteArr(arr)
    Check(arr)

Driver()