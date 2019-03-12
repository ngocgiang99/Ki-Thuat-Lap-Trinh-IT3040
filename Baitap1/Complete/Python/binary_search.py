def binary_search(lst, target):
    i = 0
    j = len(lst) - 1
    while i < j:

        #print(i,j)
        m = int((i+j) / 2)

        if lst[m] < target:
            i = m + 1
        else:
            j = m

    if lst[i] == target:
        return i
    else:
        return -1

a_list = [0]
print(binary_search(a_list,0))
