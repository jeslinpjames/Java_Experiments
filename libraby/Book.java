public class Book{
	String title;
	String author;
	boolean avilable;
	public Book(String title, String author, boolean avilable){
		this.title = title;
		this.author = author;
		this.avilable = avilable;
	}
	public boolean return_Avilable(){
		return (avilable);
	}
	public String return_Title(){
		return title;
	}
	public String return_Author(){
		return author;
	}
}
