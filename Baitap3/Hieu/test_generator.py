import numpy as np
length = int(input("Input the length of the test: "))
std = int(input("Input the standard deviation of the values: "))
arr = np.random.rand(length)
f = open("test.txt", "w")
f.write(str(length) + "\n")
for x in arr:
    f.write(str(int(x * std)) + " ")
