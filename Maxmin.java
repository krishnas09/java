//Krishna_Sinha, Anudip ID: AF0221117, github:-krishnas09
//Q.2. wrp to Find maximum of array element,Minimum of array element using Methods
import java.util.*;
class Maxmin
{
	void min(int[] k)
	{
		int min=k[0];
		for(int i=0;i<k.length;i++)
		{
			if(k[i]<min)
			min=k[i];
		}
		System.out.println("The minimum value of Array is : "+min);
	}

	void max(int[] k)
	{
		int max=0;
		for(int i=0;i<k.length;i++)
		{
			if(k[i]>max)
			max=k[i];
		}
		System.out.println("The maximum value of Array is : "+max);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int l=sc.nextInt();
		int[] a=new int[l];
		Maxmin m=new Maxmin();
		System.out.println("Enter "+l+" elements of Array : ");
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter value of "+i+" index : ");
			a[i]=sc.nextInt();
		}

		System.out.println("Printing Array : ");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		m.max(a);
		m.min(a);
	}
}