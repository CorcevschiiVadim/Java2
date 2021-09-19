public class Employee extends Person{
    public Employee(String name, String surname, int salary, int yearsalary, String name1, String surname1, int salary1, int yearsalary1)
    {
        super(name, surname, salary, yearsalary, name1, surname1, salary1, yearsalary1);
    }
    void say() {
        System.out.println(super.name);
        System.out.println(super.surname);
        System.out.println(super.salary);
        System.out.println(super.yearsalary);
        System.out.println(super.name1);
        System.out.println(super.surname1);
        System.out.println(super.salary1);
        System.out.println(super.yearsalary1);
    }
}
