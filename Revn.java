import java.util.*;
class Revn{
	public static void main(String[] args)
	{
	int a, rem, rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	a=sc.nextInt();
	while(a>0)
	{
	rem=a%10;
	rev=rev*10+rem;
	a=a/10;
	}
	System.out.println("Reverse of Number : "+rev);
	}
}