import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            num = scanner.nextInt();

            if (num == 0)
                break;

            if (num % 2 == 0)
                System.out.println("P"); // Par
            else
                System.out.println("I"); // Ímpar

        } while (num != 0);

        scanner.close();
    }
}
