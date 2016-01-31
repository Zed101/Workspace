package ba.objects.excercises;

/**
 * Class Temperature have one attribute representing temperature in Celsius
 * 
 * @author prika
 *
 */
public class Temperature {

	private double temp;

	/**
	 * Public constructor of Temperature class, takes one parameter
	 * <code>double</code> value
	 * 
	 * @param temp
	 *            <code>double</code> value of temperature in Celsius
	 */
	public Temperature(double temp) {
		this.temp = temp;
	}

	/**
	 * Returns <code>double</code> value of temperature
	 * 
	 * @return <code>double</code> value of temperature
	 */
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

}
