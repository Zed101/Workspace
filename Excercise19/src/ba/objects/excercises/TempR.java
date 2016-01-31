package ba.objects.excercises;

public class TempR {

	public static void main(String[] args) {
		Temperature outTemp = new Temperature(-1);
		System.out.println(getTemperatureinK(outTemp));
		outTemp.setTemp(5);

		outTemp = changeTemperature(outTemp, 50);

		System.out.println(outTemp.getTemp());
	}

	/**
	 * Convert temperature from Celsius in Farenheit
	 * @param outTemp  <code>double</> current temperature in Celsius 
	 * @return <code> double </> temperature in Farenheit
	 */
	public static double getTemperatureinF(Temperature outTemp) {
		double temp = 0.0;

		temp = outTemp.getTemp() * 1.8 + 32;
		return temp;
	}
/**
 * Convert temperature from Celsius in Kelvin
 * @param outTemp <code> double</> temperature in Celsius
 * @return <code> double </> temperature in Kelvin
 */
	public static double getTemperatureinK(Temperature outTemp) {
		double temp = 0.0;

		temp = outTemp.getTemp() + 273.15;
		return temp;
	}
/**
 * Returns current set temperature
 * @param outTemp  <code> double </> temperature in Celsius 
 * @return <code> double </> Temperature in Celsisus
 */
	public static double getTemperatureinC(Temperature outTemp) {
		return outTemp.getTemp();
	}
/**
 * Change current temperature
 * @param temp <code> double </>  old temperature in Celsius 
 * @param newTemp <code> double </> new temperature in Celsius
 * @return
 */
	public static Temperature changeTemperature(Temperature temp, double newTemp) {
		temp.setTemp(newTemp);
		return temp;
	}

}
