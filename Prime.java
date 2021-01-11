import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("please input a number to check");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean check = true;
        if (num < 2) {
            System.out.println(num + " " + " IS NOT A PRIME");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num+" IS prime number");
            } else
                System.out.println(num+" IS NOT prime number");
        }
    }
}
