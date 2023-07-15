import java.io.*;
public class StudentMain
{
	public static void main(String args[])throws IOException
	{
		StudentList list = new StudentList(3);
		list.readList();
		list.sort();
		list.displayList();
	}
}
