package ba.excercices.objects.plants;

public class Trees extends Plants {
	private int eatable;
	
	
	public Trees(boolean isAlive, boolean isToxic, String utilization, int eatable ){
		super(isAlive, isToxic, utilization);
		this.eatable = eatable;
	}
	
	public int getEatable(){
		return eatable;
	}
	public void setEatable(int setOn){
		
		this.eatable = setOn;
	}

}
