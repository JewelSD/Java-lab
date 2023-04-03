import java.util.*;
class student
{

public void read(int l)
{
int to=0;
int t=0;
Scanner sc=new Scanner(System.in);
int[] ad=new int[l];
for(int i=0;i<l;i++)
{
t=i+1;
System.out.println("Enter the Mark "+t+":");
ad[i]=sc.nextInt();
}

for(int i=0;i<l;i++)
{
to=to+ad[i];
}
System.out.println("\nThe total mark of the student is:"+to);
int avg=to/t;
System.out.println("\nThe Average Mark of the student is:"+avg);
}
public static void main(String args[])
{
System.out.println("Mark Total and average");
System.out.println("----------------------");
System.out.println("\n Student Mark");
System.out.println("How many subjects mark do you want to enter:");
Scanner read =new Scanner(System.in);
int a=read.nextInt();
student obj=new student();
obj.read(a);
}
}



