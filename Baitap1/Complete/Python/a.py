my_list = [1, 2, 3, 4, 5]

def so_chan(number):
    if number % 2 == 0:
        return True
    else:
        return False

print(list(filter(so_chan, my_list)))