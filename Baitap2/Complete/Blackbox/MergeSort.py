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
        if len(ent) > 1:
                m = len(ent) // 2
                L1 = ent[:m]
                L2 = ent[m:len(ent)]
                L = merge(mergeSort(L1) , mergeSort(L2))
                return L
        else: return ent
        
arr = [5, 6, -6, 1, 3, -7]
print(arr)

print(mergeSort(arr))