public class Teacher extends Person {
    public Teacher(String name, String surname, String sexofaperson, int day, int month, int year, int height, int weight, int age, int maximumheartrate, int targetheartrate)
    {
        super(name, surname, sexofaperson, day, month, year, height, weight, age, maximumheartrate, targetheartrate);
    }

    void say() {
        System.out.println(super.name);
        System.out.println(super.surname);
        System.out.println(super.sexofaperson);
        System.out.println(super.day);
        System.out.println(super.month);
        System.out.println(super.year);
        System.out.println(super.height);
        System.out.println(super.weight);
        System.out.println(super.age);
        System.out.println(super.maximumheartrate);
        System.out.println(super.targetheartrate);
    }
}
