public class Localvar{
	int i;//Instance Variable (Inside Class outside Method)
	int j=15;//Instance Variable (Inside Class outside Method)

	public void Test(){
	int a=10; //local variable (Inside Class Inside Method)
	System.out.println("Value of a : "+a);
}

static int b=50;//Static Variable (Inside Class outside Method with static keyword)

	public static void main(String[] args){
	Localvar loc1 = new Localvar();//Creating obj for Instance

	System.out.println("Instance Variable i : "+loc1.i);//default value of x will be printed
	System.out.println("Instance Variable j : "+loc1.j);

	Localvar loc2 = new Localvar();//Creating obj for Local
	loc2.Test();

	System.out.println("Static Variable b : "+Localvar.b);//Driectky Printing by Classname.variablename
}
}