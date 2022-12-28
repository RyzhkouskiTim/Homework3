import java.util.Scanner;

public class TimeOfYear {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        switch (q) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }

    }
}
