import java.util.Scanner;
public class Personalinfo
{
    public static void main(String[] args)
    {
    Scanner S =new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name =S.nextLine();
    System.out.println("Enter your age: ");
    int age = S.nextInt();
    S.nextLine(); 
    System.out.println("Enter your city: ");
    String city = S.nextLine();

    System.out.println("Enter your Name: " + name);
    System.out.println("Enter your Age: " + age);
    System.out.println("Enter your City: " + city);


    }
}
