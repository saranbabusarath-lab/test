import java.util.Scanner;

class Areasmeasures
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        int choice = sc.nextInt();
        double area;

        switch (choice) 
		{
            case 1: 
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                area = 3.14159 * radius * radius;
                System.out.println("Area of Circle: " + area);
                break;

            case 2: 
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square: " + area);
                break;

            case 3: 
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle: " + area);
                break;

            case 4: 
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle: " + area);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
