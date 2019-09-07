import java.util.Scanner;

public class Second
{
 public static void main(String args[])
{
	
 	Scanner input = new Scanner(System.in);		//For user input
	System.out.println("Enter a Character");
	char ch = input.next().charAt(0);		//Taking user from user

	switch(ch)
	{	
	case 'a':
		System.out.println(ch+"\t character is a vowel");
		break;
	case 'e':
		System.out.println(ch+"\t character is a vowel");
		break;
	case 'i':
		System.out.println(ch+"\tcharacter is a vowel");
		break;
	case 'o':
		System.out.println(ch+"\t character is a vowel");
		break;
	case 'u':
		System.out.println(ch+"\t character is a vowel");
		break;
	
	default:
	System.out.println(ch+"\t Character is not vowel");
	break;
	}

}    
}