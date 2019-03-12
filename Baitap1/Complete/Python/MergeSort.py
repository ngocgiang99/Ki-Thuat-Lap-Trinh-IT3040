def mergeSort(ent):
    if len(ent) > 1:
        m = len(ent) // 2
        L1 = ent[:m+1]
        L2 = ent[m+1:len(ent)]
        L = merge(mergeSort(L1) , mergeSort(L2))
print(mergeSort(ent))
