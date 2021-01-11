import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        double money=1;
        int month=1;
        double interest_rate=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter investment amount");
        money=sc.nextDouble();
        System.out.println("Enter number of month");
        month=sc.nextInt();
        System.out.println("Enter interest rate");
        interest_rate=sc.nextDouble();


        double total_interest=0;
        for (int i = 0; i < month; i++) {
            total_interest +=(money*(interest_rate/100)/12)*month;
        }
        System.out.println("Total of interest is: "+total_interest);
    }
}
