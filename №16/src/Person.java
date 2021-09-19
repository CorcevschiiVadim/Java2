public class Person {
    public String name = "Dima";
    public String surname = "Kocev";
    public int day = 06;
    public int month = 05;
    public int year = 2000;
    public int age = 21;
    public int maximumheartrate = 220;
    public int targetheartrate = 50-85;

    public void say(String name, String surname, int day, int age, int maximumheartrate, int targetheartrate) {
        System.out.println("Hello," + name + surname);
    }

    public Person(String n, String s, int d, int mo, int y, int a, int ma, int t) {
        name = n;
        surname = s;
        day = d;
        month = mo;
        year = y;
        age = a;
        maximumheartrate = ma;
        targetheartrate = t;
    }
}
