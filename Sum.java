//Krishna_Sinha, Anudip ID: AF0221117, github:-krishnas09
//Q.2. wrp To calculate sum of two numbers function if my input char is 'y' [yes] to continue again otherwise to stop process
import java.util.*;
class Sum
{
	void add(int a, int b)
	{
		System.out.println("Sum of "+a+" + "+b+" is : "+(a+b));
	}
	void sub(int a, int b)
	{
		System.out.println("Subtraction of "+a+" - "+b+" is : "+(a-b));
	}
	void mul(int a, int b)
	{
		System.out.println("Multiplication of "+a+" * "+b+" is : "+(a*b));
	}
	public static void main(String[] args)
	{
		Sum s=new Sum();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		do
		{
			int k1, s1;
			System.out.println("Enter first number : ");
			k1=sc.nextInt();
			System.out.println("Enter second number : ");
			s1=sc.nextInt();
			s.add(k1,s1);
			s.sub(k1,s1);
			s.mul(k1,s1);
			System.out.println("Enter 'Y' to continue again : ");
			ch=sc.next().charAt(0);
			ch=Character.toUpperCase(ch);
		}while(ch=='Y');
	}
}