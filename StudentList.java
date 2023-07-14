class StudentList
{
	int count;
	Student[] student;
	public StudentList(int count)
	{
		this.count = count;
		student = new Student[count];
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
			for(int j=0;i<count;j++)
			{
				if(students[i].getTotalMarks()>students[j].getTotalMarks())
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
			
