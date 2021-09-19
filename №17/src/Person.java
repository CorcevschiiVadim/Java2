public class Person {
    public String name = "Vitya";
    public String surname = "Kolkin";
    public String sexofaperson = "man";
    public int day = 07;
    public int month = 05;
    public int year = 1986;
    public int height = 180;
    public int weight = 50;
    public int age = 30;
    public int maximumheartrate = 220;
    public int targetheartrate = 54;

    public void say (String name, String surname) {
        System.out.println("Hello, " + name + surname);
    }

    public Person(String n, String s, String sp, int d, int mo, int y, int h, int w, int a, int ma, int t) {
        name = n;
        surname = s;
        sexofaperson = sp;
        day = d;
        month = mo;
        year = y;
        height = h;
        weight = w;
        age = a;
        maximumheartrate = ma;
        targetheartrate = t;
    }
}
