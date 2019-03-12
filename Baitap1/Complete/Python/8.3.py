def get_stats(class_list):
    new_stats = []
    for person in class_list:
        new_stats.append([person[0], person[1], avg(person[1])])
    return new_stats


def avg(grades):
    assert len(grades) != 0, 'warning: no grades data'
    return sum(grades)/len(grades)


test_grades = [[['Peter', 'Parker'], [80.0, 70.0, 85.0]],
               [['Bruce', 'Wayne'], [100.0, 80.0, 74.0]],
               [['Captain', 'America'], [80.0, 70.0, 96.0]],
               [['Deadpool'], []]]

print(get_stats(test_grades))
