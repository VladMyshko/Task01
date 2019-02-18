final class Converter{

	private final static int CONSTANT_FOR_KELVIN = 273;
	private final static int CONSTANT_FOR_FAHRENHEIT = 32;
	private final static double FROM_CELSIUS_TO_FAHRENHEIT_COEFFICIENT = 1.8;
	private final static double FROM_FAHRENHEIT_TO_CELSIUS_COEFFICIENT = 0.56;

	private Converter(){}

	static double fromCelsiusToFahrenheit(double celsius){

		return FROM_CELSIUS_TO_FAHRENHEIT_COEFFICIENT * (celsius + CONSTANT_FOR_FAHRENHEIT);

	}

	static double fromCelsiusToKelvin(double celsius){

		return celsius + CONSTANT_FOR_KELVIN;

	}

	static double fromFahrenheitToCelsius(double fahrenheit){

		return FROM_FAHRENHEIT_TO_CELSIUS_COEFFICIENT * (fahrenheit - CONSTANT_FOR_FAHRENHEIT);

	}

	static double fromFahrenheitToKelvin(double fahrenheit){

		return FROM_FAHRENHEIT_TO_CELSIUS_COEFFICIENT * (fahrenheit - CONSTANT_FOR_FAHRENHEIT) + CONSTANT_FOR_KELVIN;

	}

	static double fromKelvinToCelsius(double kelvin){

		return kelvin - CONSTANT_FOR_KELVIN; 

	}

	static double fromKelvinToFahrenheit(double kelvin){

		return (FROM_CELSIUS_TO_FAHRENHEIT_COEFFICIENT * (kelvin - CONSTANT_FOR_KELVIN + CONSTANT_FOR_FAHRENHEIT));

	}

}
			