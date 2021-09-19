public class Employee extends Person {
    public Employee(String name, String surname, int salary) {
        super(name, surname, salary);
    }
    void say() {
        System.out.println(super.name);
        System.out.println(super.surname);
        System.out.println(super.salary);
    }
}
