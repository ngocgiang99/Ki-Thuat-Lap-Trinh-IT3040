def get_stats(class_list):
    new_stats = []
    for person in class_list:
        new_stats.append([person[0], person[1], avg(person[1])])
    return new_stats

# avg function: version with an exception
def avg(grades):
    if (len(grades) == 0):
        return 0.0
    return sum(grades)/len(grades)
