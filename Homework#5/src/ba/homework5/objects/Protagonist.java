package ba.homework5.objects;

import java.util.Arrays;

public class Protagonist extends Character {

	private Goal goalOfProtagonist;
	private Character[] acomplices = new Character[3];
	private Character enemy;
	static int c = 0;

	public Protagonist(String characterName, String gender, boolean isAlive, boolean skills, Goal goalOfProtagonist,
			Character enemy) {
		super(characterName, gender, isAlive, skills);
		this.goalOfProtagonist = goalOfProtagonist;

		this.enemy = enemy;

	}

	public Goal getGoalOfProtagonist() {
		return goalOfProtagonist;
	}

	public void setEnemy(Character enemy) {
		this.enemy = enemy;
	}

	public String getNameOfEnemy() {
		return enemy.getNameOfCharacter();
	}

	public void addAcomplices(Character acomplices, int e) {
		
	
		c++;
		
	
		
		
			if(e ==0){
				this.acomplices[0] = acomplices;
			}else if(e ==1){
				this.acomplices[1] = acomplices;
			}else if( e == 2){
				this.acomplices[2] = acomplices;
			}
		
			
		
		
		if (c > 4) {
			throw new UnsupportedOperationException("Only 3 acomplices allow");
		}
	
	
	}

	public String getNamesOfAcomplices() {
		String[] array = new String[3];
		for (int i = 0; i < this.acomplices.length; i++) {
			String name = acomplices[i].getNameOfCharacter();
			array[i] = name;
			
		}
		System.out.println( "Array of  helpers of protagonist: " );
		return Arrays.toString(array);

	}

	public String attainGoal() {
		int p = 0;
		if (this.getIsAlive() == true) {
			if (this.getSkills() == true) {
				p += 40;
			}
			for (int i = 0; i < this.acomplices.length; i++) {
				if (this.acomplices[i].getSkills() == true) {
					//System.out.println(this.acomplices[i].getSkills());
					p += 20;
				}
			}
			if (enemy.getSkills() == true) {
				
				p -= 30;
			}
			if (this.getGoalOfProtagonist().getPosibility() == 2) {
				//System.out.println(this.getGoalOfProtagonist().getPosibility() + "medium" );
				p -= 20;
			} 
			if (this.getGoalOfProtagonist().getPosibility() == 3) {
				//System.out.println(this.getGoalOfProtagonist().getPosibility() + " hard");
				p -= 100;
			}
			if (p > 100) {
				p = 100;
			} else if (p < 0) {
				p = 0;
			}

		}
		int random = (int)(Math.random() * 2) ;
		
		if (p > 70) {
			
			acomplices[random].makeSkilfulCha(); // make one of helpers skillful because victory
			return "Success in goal: " + this.getGoalOfProtagonist().getGoal() + "\n" + "Score: " + p + "%";
			
		} else if (p < 70) {
			acomplices[random].setIsAlive(false); //kill one of helpers because failure
			int r = (int)(Math.random() * 2);
			acomplices[r].makeSkilfulCha(); // make one of helpers skillful because of experience
			return "Failure i goal: " + this.getGoalOfProtagonist().getGoal() + "\n" + "Score: " + p + "%";
		}
		return "e";
	}

}
