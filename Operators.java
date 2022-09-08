//wrp to demo all kind of operators in single program.
class Operators
{
	public static void main(String[] args)
	{
		int a=10, b=20;
		System.out.println("Value of A : "+a);//10;
		System.out.println("Value of B : "+b);//20;

		System.out.println("(1) Arthmetic Operators : +,-,*,/,%");

		System.out.println("A+B = "+(a+b));
		System.out.println("A-B = "+(a-b));
		System.out.println("A*B = "+(a*b));
		System.out.println("B/A = "+(b/a));
		System.out.println("B%A = "+(b%a));

		System.out.println("(2) Assignment Operator : =");

		int c = b;//c=20
		int d = a+5;//d=15
		int e = a+b;//e=30
		System.out.println("Value of C : "+c);//20;
		System.out.println("Value of D : "+d);//15;
		System.out.println("Value of E : "+e);//30;

		System.out.println("(3) Multiple Assignment Operator : +=,-=,*=,/=,%=");

		a*=10;//{a=a*10}=100
		b/=10;//{b=b/10}=2
		c+=5;//{c=c+5}=25
		d-=10;//{d=d-10}=5
		e%=10;//{e=e%10}=0
		System.out.println("a*=10; : "+a);
		System.out.println("b/=10; : "+b);
		System.out.println("c+=5; : "+c);
		System.out.println("d-=10; : "+d);
		System.out.println("e%=10; : "+e);

		System.out.println("(4) Relational Operator : >,<,>=,<=,==,!=");

		System.out.println("Value of A : "+a);//100
		System.out.println("Value of B : "+b);//2
		System.out.println("Value of C : "+c);//25;
		System.out.println("Value of D : "+d);//5;
		System.out.println("Value of E : "+e);//0;
		System.out.println("A>B : "+(a>b));
		System.out.println("C<E : "+(c<e));
		System.out.println("D>=A : "+(d>=a));
		System.out.println("B<=D : "+(b<=d));
		System.out.println("B==C : "+(b==c));
		System.out.println("A==E : "+(a==e));
		System.out.println("A!=E : "+(a!=e));
		System.out.println("E!=C : "+(e!=c));

		System.out.println("(5) Logical Operator : &&,||,!");

		/*&& (AND) all conditions must be true than only executes
		  || (OR) atlease one condition should to true.
		   ! (NOT) inverse the condition if it is true than ! makes it false
		*/
		System.out.println("Value of C : "+c);//25;
		System.out.println("Value of D : "+d);//5;
		System.out.println("Value of E : "+e);//0;
		System.out.println("(C>D)&&(D<C)&&(E!=C) : "+((c>d)&&(d<=c)&&(e!=c)));
		System.out.println("(C==D)&&(D<C)&&(E<C) : "+((c==d)&&(d<c)&&(e<c)));
		System.out.println("(C>D)||(D==C)||(E!=C) : "+((c>d)||(d==c)||(e!=c)));
		System.out.println("(C==D)||(D>C)||(E>C) : "+((c==d)||(d>c)||(e>c)));
		System.out.println("!(E>C) : "+(!(e>c)));
		System.out.println("!(D>E) : "+(!(d>e)));

		System.out.println("(6) Unary Operator : ++, --");

		int x,y,z;
		x=5;
		y=++x;//y=6
		++x;//pre increament x=1+x x=1+6=7
		x++;//post increament x=x+1 x=7+1=8
		z=x-- + --y;//8+5=13 (after operation value of x=7 and y=5)
		System.out.println("Value of X : "+x+" Valur of Y : "+y+" Vlaue of Z : "+z);

		System.out.println("(7) Ternary Operator : ? , : ");
		System.out.println("Syntax : (cond)? v1 : v2; ");
		int m1, m2, m3;
		String res;
		m1=50;
		m2=40;
		m3=90;
		res=(m1>=35 && m2>=45 && m3>=40)?"Passed":"Failed";
		System.out.println(res);
		
		System.out.println("(8) Bitwise Operator : &,|,^,<<,>>,~");
		int a1,b1,c1;
		a1=5;
		b1=7;
		c1=9;
		System.out.println("The value of A : "+a1+" The value of B : "+b1+" The value of C : "+c1);
		System.out.println("The binary of a1 : "+Integer.toBinaryString(5)+" The binary of b1 : "+Integer.toBinaryString(7)+" The binary of c1 : "+Integer.toBinaryString(9));
		System.out.println("Operation of Bitwise AND Operator A & B & C : "+(a1&b1&c1));
		System.out.println("Operation of Bitwise OR Operator A | B | C : "+(a1|b1|c1));
		System.out.println("Operation of Bitwise XOR Operator A ^ B ^ C : "+(a1^b1^c1));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator A >> : "+(a1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator A >> : "+(a1>>2));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator B >> : "+(b1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator B >> : "+(b1>>2));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator C >> : "+(c1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator C >> : "+(c1>>2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator A << : "+(a1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator A << : "+(a1<<2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator B << : "+(b1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator B << : "+(b1<<2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator C << : "+(c1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator C << : "+(c1<<2));
		System.out.println("Complement of A = "+(~a1));
		System.out.println("Complement of B = "+(~b1));
		System.out.println("Complement of C = "+(~c1));
	}
}