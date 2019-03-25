import traceback
import sys
import os
import random
from random import shuffle
from merge_sort import *
        
def process(ind):
        arrResult = []
        inputname = "test" + str(ind) + ".inp"
        if os.path.isfile("./Test/" + inputname): 
                f = open("Test/" + inputname, "r")
                f1 = f.readlines()
                for x in f1: 
                        temp = (list(map(int, x.split())))
                        #if (len(temp) == 1): n = temp[0]
                        #else: 
                        arrResult = arrResult + temp
        else :
                n = random.randint(4, 10)
                arrResult = [i for i in range(1,n+1)]
                shuffle(arrResult)
        return arrResult

def clear() :
        os.system('cls' if os.name == 'nt' else 'clear')

def printListTest() :
        i = 1
        while(True):
                inputname = "test" + str(i) + ".inp"
                if os.path.isfile("./Test/" + inputname) : 
                        print(inputname)
                        f = open("Test/" + inputname, "r")
                        f1 = f.readlines()
                        for x in f1: 
                                print(x)
                        i = i+1
                else : return i-1

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
                        cntTest = printListTest()
                        ind = int(raw_input("Ban muon test truong hop may (nhap 1 so tu 1-" + str(cntTest)+") :"))
                        arr = process(ind)
                        print(arr)

                        print(sort(arr))

                        answer = raw_input("Ban muon kiem tra tiep khong (Y/N) :")
                        if answer == 'N' : break
        
       
except IndentationError:
        print("Ban vua dung Space vua dung Tab")
except ValueError:
        print("arr is not a list of int!")
except Exception :
        traceback.print_exc()
