import java.util.Scanner;
class Vowel
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character");
		char ch = sc.next().charAt(0);

		
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
			System.out.print("vowel");
			break;
			default:
			System.out.print("consont");
}
sc.close();
	}
}