import java.util.Scanner;
public class HarryAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int CurrentYear = 2024;
        int BirthYear = 2000;
        int Realage = CurrentYear - BirthYear;
        System.out.println("Harry's age in 2024 is: "+ Realage);
        sc.close();

    }
}