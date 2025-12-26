import java.util.Scanner;
class Gradeevolution
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade(A,B,C,D,F):");
		char grade=sc.next().charAt(0);
		switch (grade)
		{
		case 'A':
		System.out.println("excellent");
		break;
		case 'B':
		System.out.println("good");
		break;
		case 'c':
		System.out.println("poor");
		break;
		case 'd':
		System.out.println("fail");
		
		break;
		default:
		System.out.println("invalid grade");
}
sc.close();
}
}