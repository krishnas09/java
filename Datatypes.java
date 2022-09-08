//wrp to demo short,byte,int,long datatype values.
class Datatypes
{
	public static void main(String[] args)
	{
		byte a=127;
		short b=32766;
		int c=21470563;
		long d=415715451;
		double e=451354515.024151;
		char ch='K';
		String str="JAVA_PROGRAMMING.... HELLO WORLD!!!";
//float f=100.123450;
//System.out.println("float datatype can store 4 bytes (32 bits), maximum decimals : 7 (.0000000) exponential range : 1.4 e pow -38 to 3.4 e pow +38 value of float f : "+f);
//-2^n-1 to 2^n-1(-1)

		System.out.println("byte datatype can store only 1 byte (8 bits), range : -128 to +127 value of byte a : "+a);
		System.out.println("short datatype can store 2 bytes (16 bits), range : -32768 to +32767 value of short b : "+b);
		System.out.println("int datatype can store 4 bytes (32 bits), range : -2147483648 to +2147483647 value of int c : "+c);
		System.out.println("long datatype can store 8 bytes (64 bits), range : -2 pow 63 to +2 pow 63 -1 value of long d : "+d);
		System.out.println("double datatype can store 8 bytes (64 bits), maximum decimals : 15 (.000000000000000) exponential range : 4.9 e pow -319 to 1.7 e pow +308 value of double d : "+d);
		System.out.println("Character datatype can store 2 bytes (16 bits), range : 0 to 65535 (Unicode Char) value of character ch : "+ch);
		System.out.println("String is a Class value of String str : "+str);
	}
}