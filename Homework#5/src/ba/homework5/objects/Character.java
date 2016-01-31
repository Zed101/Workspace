package ba.homework5.objects;

public class Character extends StoryElement {
	private String characterName;
	private String gender;
	private boolean isAlive;
	private boolean skills;
	
	public Character( String characterName, String gender, boolean isAlive, boolean skills){
		
		this.characterName = characterName;
		this.gender = gender;
		this.isAlive = isAlive;
		this.skills = skills;
	}
	public void makeSkilfulCha(){
		skills = true;
	
	}
	public void killCharacter(boolean isAlive){
		isAlive = false;
		
	}
	public String getNameOfCharacter(){
		return characterName;
	}
	public boolean getIsAlive(){
		return isAlive;
	}
	public void setIsAlive(boolean isAlive){
		this.isAlive = isAlive;
	}
	public boolean getSkills(){
		return skills;
	}
	
}
