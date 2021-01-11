import java.util.Scanner;
public class UOCSOCHUNGMAX {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b= input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);

        if((a==0)&&(b==0)){
            System.out.println(a +","+b+"has not greatest common divisor");
        }else if((a==0)&&(b!=0)){
            System.out.println("the greatest common divisor is "+b);
        }else if((b==0)&&(a!=0)){
            System.out.println("the greatest common divisor is "+a);
        }else if(a%b==0){
            System.out.println("the greatest common divisor is "+b);
        }else {
            System.out.println(" has not greatest common divisor");
        }
    }
}
