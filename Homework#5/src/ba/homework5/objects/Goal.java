package ba.homework5.objects;

public class Goal extends StoryElement {
	public static final int EASY = 1;
	public static final int MEDIUM = 2;
	public static final int HARD = 3;
	
	private String nameGoal;
	private int posibility;
	private String goal;
	private Character withWho;

	public Goal( String nameGoal,int posibility, String goal, Character withWho) {
	
		this.posibility = posibility;
		this.goal = goal;
		this.withWho = withWho;
		this.nameGoal = nameGoal;
	}

	public int getPosibility() {
		return posibility;
	}

	public void setPosibility(int posibility) {
		this.posibility = posibility;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public Character getWithWho() {
		return withWho;
	}

	public void setWithWho(Character withWho) {
		this.withWho = withWho;
	}

}
