for num in range(10,20):

    isPrime = 1
    for i in range(2,num):
        if num % i == 0:
            j = num / i
            print(num, "la bang", i, "*",j)
            isPrime = 0
            break
    if isPrime:
        print(num, "la so nguyen to")