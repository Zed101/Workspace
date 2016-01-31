package ba.excercices.objects;

public  class LifeForm {
	
	private boolean isAlive;
	
	public LifeForm( boolean isAlive){
		this.isAlive = isAlive;
	}

	
	public boolean getIsAlive(){
		return isAlive;
	}
	public void setIsAlive( boolean deadOrAlive){
		this.isAlive = deadOrAlive;
	}
	
	
	@Override
	public String toString() {
		return "Is alive" + isAlive + " ";
	}
	

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive != other.isAlive)
			return false;
		return true;
	}
}
