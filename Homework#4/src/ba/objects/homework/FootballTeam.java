package ba.objects.homework;

public class FootballTeam {
	private String name;
	private FootballPlayer[] arrayOfFP;
	
	public FootballTeam(String name, FootballPlayer[] arrayOfFP){
		this.name = name;
		this.arrayOfFP = arrayOfFP;
	}

	
	
	public String getname() {
		return name;
	}

	public FootballPlayer[] getarrayOfFP() {
		return arrayOfFP;
	}

	public void setarrayOfFP(FootballPlayer[] arrayOfFP) {
		this.arrayOfFP = arrayOfFP;
	}
}
