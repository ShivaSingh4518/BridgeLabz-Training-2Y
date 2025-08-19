import java.util.Scanner;

public class kmtoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println("Miles: " + miles);
        sc.close();

    }
}
