class Animal:
    def __init__(self, age):
        self.age = age

class Person(Animal):
    def __init__(self, name, age):
        Animal.__init__(self, age)
        self.set_name(name)
        self.friends = []

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def get_friends(self):
        return self.friends

    def get_age(self):
        return self.age

    def speak(self):
        print("Hello")

    def add_friend(self, fname):
        if fname not in self.friends:
            self.friends.append(fname)

    def age_diff(self, other):
        diff = self.age - other.age
        print(abs(diff), "year(s) difference")

    def __str__(self):
        return "Person: " + str(self.name) + ": " + str(self.age)

print("\n---- Person tests ----")
p1 = Person("Jack", 30)
p2 = Person("Jill", 25)
print(p1.get_name())
print(p1.get_age())
print(p2.get_name())
print(p2.get_age())
print(p1)
p1.speak()
p1.age_diff(p2)
