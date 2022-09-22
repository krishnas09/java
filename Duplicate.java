//Krishna_Sinha, Anudip ID: AF0221117, github:-krishnas09
//Q.2. wrp to find duplicate elements and copy to another array 
import java.util.*;
class Duplicate
{
	void dcheck(int[] k)
	{
		System.out.println("The Duplicate elements in the arry are : ");
		for(int i=0;i<k.length;i++)
		{
			for(int j=i+1;j<k.length;j++)
			{
				if(k[i]==k[j])
				System.out.print(k[i]+" ");
			}	
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int l=sc.nextInt();
		int[] a=new int[l];
		Duplicate d=new Duplicate();
		System.out.println("Enter "+l+" elements of Array  : ");
		for(int i = 0; i<l; i++)
		{
			System.out.println("Enter value of "+i+" index : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array : ");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		d.dcheck(a);
	}

}