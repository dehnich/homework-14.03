import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проэкт 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь вводит трехзначное число : ");
        int a = scanner.nextInt();
        System.out.println(a / 100);
        System.out.println(a / 10 % 10);
        System.out.println(a % 10);
        System.out.println("Проект 2:");
        Random random = new Random();
        int b = random.nextInt(999);
        long c = random.nextLong(999);
        int r = random.nextInt(999);
        System.out.println("Сгенерированное значение = "+ b);
        System.out.println("Сгенерированное значение = "+ c);
        System.out.println("Сгенерированное значение = "+ r);
        System.out.println("Cума сгенерированных чисел = "+ (b + c + r));
        System.out.println("Произведение сгенерированных чисел = "+ b + c + r);



    }
}
