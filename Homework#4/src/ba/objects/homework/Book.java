package ba.objects.homework;

public class Book {
	private String nameOfBook;
	private int yearOfPublish;
	private String genre;
	private boolean isBestseller;

	
	public Book (String name, int yearOfPublish, String genre, boolean isBestseller){
		this.nameOfBook = name;
		this.yearOfPublish = yearOfPublish;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
	
	public int getyearOfPublish(){
		return yearOfPublish;
	}
	public void setyearOfPublish( int yearOfPublish){
		this.yearOfPublish = yearOfPublish;
	}
	
	public boolean getisBestseller(){
		return isBestseller;
	}
	public void setisBestseller (boolean isBestseller){
		this.isBestseller  = isBestseller;
	}
	@Override
	public String toString() {
	
		return nameOfBook + "\n";
	}
}
