def isPrime(n):
    return len(list(filter(
        lambda x: x == 0,
        list(map(
            lambda y: n%y, range(2, int(n * 0.5) + 1)
        ))
    ))
    ) == 0

for i in range(2, 100):
    if isPrime(i):
        print(i)