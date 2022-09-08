import java.util.Scanner;

class Student
{
public static void main(String[] args)
{

int std_id; //Student ID
String std_name, std_attend; // Student Name, Studentt Attendence
 
System.out.println("Enter the Student Name : ");
Scanner sc=new Scanner(System.in); // making Scanner object sc
std_name=sc.next();	// Taking value from the user

System.out.println("Enter Student ID : ");
std_id=sc.nextInt();	// Taking value from the user

System.out.println("Enter Student Attendence Present or Absent 'P' or 'A' : ");
std_attend=sc.next();	// Taking value from the user

System.out.println("Student Name : "+std_name);	// Printing Value
System.out.println("Student ID : "+std_id);	// Printing Value
System.out.println("Student Attendence : "+std_attend);	// Printing Value
}
}