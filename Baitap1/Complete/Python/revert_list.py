def rev_list(L):
	"""
	input: L, a list
	Modifies L such that its elements are in reverse order
	returns: nothing
	"""
	for index in range(len(L)//2):
		j = len(L) - index - 1
		temp = L[index]
		L[index] = L[j]
		L[j] = temp

L = [1, 2, 3, 4]
rev_list(L)
print(L)
