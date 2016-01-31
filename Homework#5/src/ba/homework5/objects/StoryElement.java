package ba.homework5.objects;

public abstract class  StoryElement {
	private String name;
	
	public StoryElement(String name){
		this.name = name;
	}
	public StoryElement(){
		this("STElement");
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
