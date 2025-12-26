import java.util.Scanner;
class Railwayticketclass
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter saet type(1 to 5):");
		int seat=sc.nextInt();
		switch (seat)
		{
			case 1:
			System.out.println("class:genral");
			System.out.println("ticket rate:rs 300");
			break;
			case 2:
			System.out.println("class sleeper");
			System.out.println("ticket rate:rs 350");
			break;
			case 3:
			System.out.println("class:AC3");
			System.out.println("ticket rate:400");
			break;
			case 4:
			System.out.println("class:Ac2");
			System.out.println("ticket rate:450");
			break; 
			case 5:
			System.out.println("class:Ac1");
			System.out.println("ticket rate:500");
			break;
			default:
			System.out.println("no tickets");
			
		}
		sc.close();
	}
}