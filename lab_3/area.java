import java.util.Scanner;

class area
{
    public static int calcArea(int length,int breadth)
    {
        return length*breadth;

    }
    public static int calcArea(int side)
    {

        return side*side;
    }
    public static double calcArea(Double radius)
    {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
do
{
        System.out.println("\n\nEnter \n1 for calculate the area of rectangle \n2 for square \n3 for circle:\n4 for exit\n:");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1: 
            System.out.println("\nenter the length and width of rectangle");
            int length=sc.nextInt();
            int width=sc.nextInt();
            int area=calcArea(length,width);
            System.out.println("the area of rectangle is "+area);
            break;
            case 2:
            System.out.println("\nenter the length of side");
            int side=sc.nextInt();
            area=calcArea(side);
            System.out.println("the area of square is "+ area);
            break;
            case 3:
            System.out.println("\nenter the radius of circle");
            double radius=sc.nextDouble();
            double circleA=calcArea(radius);
            System.out.println("the area of circle is "+circleA);
            break;
	    case 4:
	    return;
	    default:
	    System.out.println("\nWrong Choice");
            

        }
}while(i!=0); 
    }
    }


