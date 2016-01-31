package ba.excercices.objects.plants;

import ba.excercices.objects.LifeForm;

public class Plants extends LifeForm {

	private boolean isToxic;
	private String utilization;

	public Plants(boolean isAlive, boolean isToxic, String utilization) {
		super(isAlive);
		this.isToxic = isToxic;
		this.utilization = utilization;
	}

	public boolean getisToxic() {
		return isToxic;
	}

	public void setIsToxic(boolean isToxic) {
		this.isToxic = isToxic;
	}

	public String getUtilization() {
		return utilization;
	}

	public void setUtilization(String utilization) {
		this.utilization = utilization;
	}

	@Override
	public String toString() {

		return "Is plant toxic" + isToxic + " " + "\n" + "Level utilization " + utilization + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plants other = (Plants) obj;
		if (isToxic != other.isToxic)
			return false;
		if (utilization == null) {
			if (other.utilization != null)
				return false;
		} else if (!utilization.equals(other.utilization))
			return false;
		return true;
	}
}
