import java.util.Scanner;
class Traficlight
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("traficlight(red,yellow,green):");
		String color=sc.next();
		switch (color)
		
		{
			case "red":
			System.out.println("Stop");
			break;
			case "yellow":
			System.out.println("get ready");
			break;
			case "green":
			System.out.println("go");
			break;
			default:
			System.out.println("invalid color");
		}
		sc.close();
	}
}