package ba.objects.homework;

public class Author {
	private String name;
	private int yearOfBirth;
	private Book[] authorsBooks;
	private Author[] authors;
	
	public Author (String name, int yearOfBirth, Book[] authorsBooks){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.authorsBooks = authorsBooks;
	}
	public Author[] getAuthors (){
		return authors;
	}
	public void setAuthors (Author[] authors){
		this.authors = authors;
	}
	
	public int getyearOfBirth(){
		return yearOfBirth;
	}
	public void setyearOfBirth( int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}
	public Book[] getauthorsBooks(){
		return authorsBooks;
	}
	public void setauthorsBooks (Book[] authorsBooks){
		this.authorsBooks = authorsBooks;
	}
	
	@Override
	public String toString() {
		return name + " \n"; 
	}

}
