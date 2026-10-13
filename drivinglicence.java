import java.util.Scanner;

public class drivinglicence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18) {
            System.err.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
