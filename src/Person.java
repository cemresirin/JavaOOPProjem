public class Person {
    String name;
    int age;

public Person (String name, int age) {
    this.name = name;
    this.age = age;
}
}
class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
}