import java.utils.*;
public class Student
{
	private String name;
	private int rollNo,totalMark;
	private int marks[];
	public Student()
	{
		marks = new int[3];
	}
	public void read()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the student : ");
		name = sc.nextLine();
		System.out.print("Enter the roll Number : ");
		rollNo= sc.nextInt();
		for(int i =0;i<3;i++)
		{
			System.out.print("Enter the mark of subject "+(i+1)+" : ");
			marks[i]= sc.nextInt();
		}
	}
	public void calculate()
	{
		totalMark=0;
		for(int i =0;i<3;i++)
		{
			totalMark+=marks[i];
		}
	}
	public int getTotalMark()
	{
		return totalMark;
	}
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollNo);
		System.out.print("Marks : ");
		for(int i =0;i<3;i++)
		{
			System.out.print(marks[i] + " ");
		}
		System.out.println("\nTotal Marks : "+totalMark);
	}

}



