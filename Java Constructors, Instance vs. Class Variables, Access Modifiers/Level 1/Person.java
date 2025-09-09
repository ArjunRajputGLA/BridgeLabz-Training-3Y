public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Person name is: " + name + " age " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sam", 22);
        Person p2 = new Person(p1); // copy constructor
        p1.display();
        p2.display();
    }
}
