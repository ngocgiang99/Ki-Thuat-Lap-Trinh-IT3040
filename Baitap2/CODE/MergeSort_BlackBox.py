import traceback
import sys
import os
import random
from random import shuffle

def merge(L1, L2):      
        if (len(L1) == 0): return L2
        if (len(L2) == 0): return L1
        i = i1 = i2 = 0
        L = []
        while(i1 < len(L1) and i2 < len(L2)):
                if (L1[i1] < L2[i2]): 
                        L.append(L1[i1])
                        i1 += 1
                else:
                        L.append(L2[i2])
                        i2 += 1
        
        while(i1 < len(L1)):
                L.append(L1[i1])
                i1 += 1
        while(i2 < len(L2)):
                L.append(L2[i2])
                i2 += 1
        return L


def mergeSort(ent):
        #if (i > 5): return ent
        if len(ent) > 1:
                m = len(ent) // 2
                L1 = ent[:m]
                L2 = ent[m:len(ent)]
                L = merge(mergeSort(L1) , mergeSort(L2))
                return L
        else: return ent
        
def process(ind):
        arrResult = []
        inputname = "test" + str(ind) + ".inp"
        if os.path.isfile("./" + inputname): 
                f = open(inputname, "r")
                f1 = f.readlines()
                for x in f1: 
                        temp = (list(map(int, x.split())))
                        if (len(temp) == 1): n = temp[0]
                        else: arrResult = arrResult + temp
        else :
                n = random.randint(4, 10)
                arrResult = [[i] for i in range(1,n+1)]
                shuffle(arrResult)
        return arrResult

def clear() :
        os.system('cls' if os.name == 'nt' else 'clear')

def printListTest() :
        for i in range(1, 500) :
                inputname = "test" + str(i) + ".inp"
                if os.path.isfile("./" + inputname) : 
                        print(inputname)
                        f = open(inputname, "r")
                        f1 = f.readlines()
                        for x in f1: 
                                print(x)

try :   
        arr = []
        if len(sys.argv) > 1 and os.path.isfile("./" + sys.argv[1]): 
                f = open(sys.argv[1], "r")
                f1 = f.readlines()
                for x in f1: 
                        temp = (list(map(int, x.split())))
                        if (len(temp) == 1): n = temp[0]
                        else: arr = arr + temp
        else:
                while True :
                        clear()
                        printListTest()
                        ind = int(raw_input("Ban muon test truong hop may: "))
                        arr = process(ind)
                        print(arr)

                        print(mergeSort(arr))

                        answer = raw_input("Ban muon kiem tra tiep khong (Y/N) :")
                        if answer == 'N' : break
        
       
except IndentationError:
        print("Ban vua dung Space vua dung Tab")
except ValueError:
        print("Du lieu ban nhap khong phai dung")
except Exception :
        traceback.print_exc()
