public class Task01_7{

	public static void main(String[] args){

		double celsius = 36;
		double fahrenheit = 451;
		double kelvin = 273;

		System.out.println( "Temperature in fahrenheit from celsius: " + Converter.fromCelsiusToFahrenheit(celsius) + "\n Temperature in kelvin from celsius: " + Converter.fromCelsiusToKelvin(celsius) + "\n Temperature in celsius from fahrenheit: " + Converter.fromFahrenheitToCelsius(fahrenheit) + "\n Temperature in kelvin from fahrenheit: " + Converter.fromFahrenheitToKelvin(fahrenheit) + "\n Temperature in celsius from kelvin: " + Converter.fromKelvinToCelsius(kelvin) + "\n Temperature in fahrenheit from kelvin: " + Converter.fromKelvinToFahrenheit(kelvin));

	}

}