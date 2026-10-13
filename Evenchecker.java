import java.util.Scanner;

public class Evenchceker {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n > 10) {
            System.err.println("Even number is greater than 10");
        } else {
            System.out.println("Even number is not greater than 10");
        }
    }
}
