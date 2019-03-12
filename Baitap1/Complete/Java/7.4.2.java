import java.util.List;

public class Main {

    static class Animal {
        protected int age;

        public Animal(int age) {
            this.age = age;
        }
    }

    static class Person extends Animal {
        private String name;
        private List<String> friends;

        public Person(String name, int age, List<String> friends) {
            super(age);
            setName(name);
            this.friends = friends;
        }

        public Person(String name, int age) {
            this(name, age, null);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public List<String> getFriends() {
            return friends;
        }

        public int getAge() {
            return age;
        }

        public void speak() {
            System.out.println("Hello");
        }

        public void addFriend(String friendName) {
            if (!friends.contains(friendName))
                friends.add(friendName);
        }

        public void ageDiff(Person other) {
            int diff = age - other.age;
            System.out.println(Math.abs(diff) + " year(s) difference");
        }

        public String toString() {
            return "Person: " + name + ": " + Integer.toString(age);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n---- Person tests ----");
        Person p1 = new Person("Jack", 30);
        Person p2 = new Person("Jill", 25);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p1);
        p1.speak();
        p1.ageDiff(p2);
    }
}