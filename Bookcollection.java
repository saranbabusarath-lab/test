import java.util.Scanner;
class Bookcollection

{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("THE WORLD OF KNOWLEDGE");
        System.out.println("Select Category:");
        System.out.println("1. Fiction");
        System.out.println("2. Fantasy");
        System.out.println("3. Business");
        System.out.println("4. Psychology");

        int category = sc.nextInt();

        if (category == 1) 
		{   
            System.out.println("Fiction Books:");
            System.out.println("1. Rise of the Fallen - Rs.300");
            System.out.println("2. Shadows Rising - Rs.250");
            System.out.println("3. It Ends with Us - Rs.350");

            int book = sc.nextInt();

            if (book == 1)
				{
                System.out.println("You selected Rise of the Fallen");
                System.out.println("Price: Rs.300");
            } 
			else if (book == 2) 
			{
                System.out.println("You selected Shadows Rising");
                System.out.println("Price: Rs.250");
            } 
			else if (book == 3)
				{
                System.out.println("You selected It Ends with Us");
                System.out.println("Price: Rs.350");
            } 
			else
				{
                System.out.println("Invalid book choice");
            }

        }
		else if (category == 2)
			{   
            System.out.println("Fantasy Books:");
            System.out.println("1. Compass and Blade - Rs.370");
            System.out.println("2. Blood Metal Bone - Rs.275");
            System.out.println("3. The Shadows Between Us - Rs.304");

            int book = sc.nextInt();

            if (book == 1)
				{
                System.out.println("You selected Compass and Blade");
                System.out.println("Price: Rs.370");
            } 
			else if (book == 2) 
			{
                System.out.println("You selected Blood Metal Bone");
                System.out.println("Price: Rs.275");
            }
			else if (book == 3) 
			{
                System.out.println("You selected The Shadows Between Us");
                System.out.println("Price: Rs.304");
            }
			else 
			{
                System.out.println("Invalid book choice");
            }

        } 
		else if (category == 3) 
		{ 
            System.out.println("Business Books:");
            System.out.println("1. The Psychology of Money - Rs.300");
            System.out.println("2. Do It Today - Rs.100");
            System.out.println("3. Atomic Habits - Rs.350");

            int book = sc.nextInt();

            if (book == 1) 
			{
                System.out.println("You selected The Psychology of Money");
                System.out.println("Price: Rs.300");
            }
			else if (book == 2)
				{
                System.out.println("You selected Do It Today");
                System.out.println("Price: Rs.100");
            }
			else if (book == 3)
				{
                System.out.println("You selected Atomic Habits");
                System.out.println("Price: Rs.350");
            }
			else 
			{
                System.out.println("Invalid book choice");
            }

        } 
		else if (category == 4)
			{   
            System.out.println("Psychology Books:");
            System.out.println("1. Dark Psychology - Rs.300");
            System.out.println("2. Power of Subconscious Mind - Rs.100");
            System.out.println("3. The Courage to Be Disliked - Rs.350");

            int book = sc.nextInt();

            if (book == 1)
				{
                System.out.println("You selected Dark Psychology");
                System.out.println("Price: Rs.300");
            }
			else if (book == 2) 
			{
                System.out.println("You selected Power of Subconscious Mind");
                System.out.println("Price: Rs.100");
            }
			else if (book == 3) 
			{
                System.out.println("You selected The Courage to Be Disliked");
                System.out.println("Price: Rs.350");
            } 
			else 
			{
                System.out.println("Invalid book choice");
            }

        } 
		else 
		{
            System.out.println("Invalid category choice");
        }

        sc.close();
    }
}
