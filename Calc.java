import java.util.Scanner;
public class Calc
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter the num1:");
int num1=S.nextInt();
System.out.println("Enter the num2:");
int num2=S.nextInt();
int Sum=num1+num2;
System.out.println("Sum of the two numbers is:"+Sum);
int Diff=num1-num2;
System.out.println("Diff of the two numbers is:"+Diff);
}
} 
