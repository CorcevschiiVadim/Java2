public class Student extends Person{
    int course = 2;
    public Student(String name, String surname, int day, int month, int year, int age, int maximumheartrate, int targetheartrate, int course)
    {
        super(name, surname, day, month, year, age, maximumheartrate, targetheartrate);
        this.course = course;
    }
    void say () {
        System.out.println(super.name);
        System.out.println(super.surname);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(super.age);
        System.out.println(super.maximumheartrate);
        System.out.println(super.targetheartrate);
        System.out.println(course);
    }
}
