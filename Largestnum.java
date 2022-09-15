import java.util.*;
class Largestnum
{
	public static void main(String[] args)
{
	int a,b,c;//variable initilized
	Scanner sc = new Scanner(System.in);//Scanner object created
	System.out.println("Enter three numbers : ");
	a = sc.nextInt(); //Taking value from user
	b = sc.nextInt();
	c = sc.nextInt();

	//Printing the values

	System.out.println("Value of a = "+a+" Value of b = "+b+" Value of c = "+c);
	
	//finding the largest num

	if(a>b && a>c)
	System.out.println("A is Greater value : "+a);

	else if(b>c && b>a)
	System.out.println("B is Greater value : "+b);

	else
	System.out.println("C is Greater value : "+c);
	
}
}