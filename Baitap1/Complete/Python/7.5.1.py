def printMove(fr, to):
    print('Move from ' + str(fr) + ' to ' + str(to))

def solveHanoiTowers(n, fr, to, spare):
    if n == 1:
        printMove(fr, to)
    else:
        solveHanoiTowers(n - 1, fr, spare, to)
        solveHanoiTowers(1, fr, to, spare)
        solveHanoiTowers(n - 1, spare, to, fr)

solveHanoiTowers(4, 'P1', 'P2', 'P3')
