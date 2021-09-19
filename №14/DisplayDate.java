import java.util.Scanner;
public class DisplayDate {
    public static void main(String[] args) {
        String input = "Июнь,9,2021";
        String[] out = input.split(",");
        System.out.println("Year = " + out[2]);
        System.out.println("Month = " + out[0]);
        System.out.println("Day = " + out[1]);
    }
}
