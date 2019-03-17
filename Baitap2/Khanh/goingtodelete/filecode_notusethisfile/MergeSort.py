def Merge(array, left, mid, right):
    if (left > mid) or (mid >= right):
        print("Wrong order! \n")
        return 
    l = left ; m = mid + 1 ; r = right
    temp_array = list()                
    while l <= mid and m <= right:          
        if(array[l] < array[m]):            
            temp_array.append(array[l])    
            l += 1
        else:
            temp_array.append(array[m])
            m += 1
    if l > mid:                           
        while(m <= right):
            temp_array.append(array[m])
            m += 1
    else:                                
        while l <= mid:
            temp_array.append(array[l])
            l += 1
    for index in range(0 , right - left + 1):
        i = index + left
        array[i] = temp_array[index]

def MergeSort(array, left, right):
    if left >= right:
        return
    mid = (left + right) // 2
    MergeSort(array, left ,mid)
    MergeSort(array, mid + 1, right)
    Merge(array, left, mid, right)

def main():
    array = list()
    n = int(input())
    for i in range(n):
        a = int(input())
        array.append(a)
    MergeSort(array, 0, n-1)
    for i in range(n):
        print(array[i])
main()