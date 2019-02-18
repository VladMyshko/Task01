final class CentimeterTransfer{
	
	private static final int FROM_CENTIMETERS_TO_METERS = 100;
	private static final int FROM_CENTIMETERS_TO_KILOMETERS = 100000;

	private CentimeterTransfer(){}

	static double transferToMeter(double centimeter){

		return centimeter / FROM_CENTIMETERS_TO_METERS;

	}

	static double transferToKilometer(double centimeter){

		return centimeter / FROM_CENTIMETERS_TO_KILOMETERS;

	}

}