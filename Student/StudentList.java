import java.io.*;
import java.util.Scanner;
class StudentList
{
	int count;
	Student[] students;
	public StudentList(int count)
	{
		this.count = count;
		students= new Student[count];
	}
	public void readList()throws IOException
	{
		for (int i =0;i<count;i++)
		{
			students[i] = new Student();
			students[i].read();
			students[i].calculate();
		}
	}
	public void sort()
	{
		for (int i =0 ; i<count;i++)
		{
			for(int j=0;j<count;j++)
			{
				if(students[i].getTotalMark()>students[j].getTotalMark())
				{
					Student temp =students[i];
					students[i]=students[j];
					students[j] = temp;
				}
			}
		}
	}
	public void displayList()
	{
		for(int i=0;i<count;i++)
		{
			students[i].display();
		}
	}
}
			
