import java.util.Scanner;
public class DrawShape {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String option;
        int width;
        int height;
        String top_left;
        String top_right;
        String bottom_left;
        String bottom_right;
        int row, row_isosceles;

        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Draw rectangle");
                System.out.println("enter width");
                width = input.nextInt();
                System.out.println("enter height");
                height = input.nextInt();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Draw square triangle");
                System.out.println("A.Top-Left");
                System.out.println("B.Top-Right");
                System.out.println("C.Bottom-Left");
                System.out.println("D.Bottom-Right");
                System.out.println("Enter your option");
                option = input.nextLine();
                switch (option) {
                    case "A":
                        System.out.println("Draw Top-Left square triangle");
                        System.out.println("enter number of rows ");
                        row = input.nextInt();
                        for (int i = row; i >= 1; i--) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                            break;
                        }
                    case "B":
                        System.out.println("Draw Top-Right square triangle");
                        System.out.println("enter number of row ");
                        row = input.nextInt();
                        for (int i = 0; i < row; i++) {
                            for (int j = i; j >= 1; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                            break;
                        }
                    case "C":
                        System.out.println("Draw Bottom-Left square triangle");
                        System.out.println("enter number of row ");
                        row = input.nextInt();
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                            break;
                        }
                    case "D":
                        System.out.println("Draw Bottom-Right square triangle");
                        System.out.println("enter number of row ");
                        row = input.nextInt();
                        for (int i = row; i >= 1; i++) {
                            for (int j = i; j > row; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                            break;
                        }
                }
            case 3:
                System.out.println("Draw isosceles");
                System.out.println("enter number of row_isosceles");
                row_isosceles = input.nextInt();
                for (int i = 1; i <= row_isosceles; i++) {
                    for (int j = 1; j <= row_isosceles - i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println("\n");
                }
//                    System.out.println("");
                break;

            case 4:
                System.exit(0);
        }
    }
}



