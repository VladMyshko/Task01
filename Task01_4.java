public class Task01_4{

	public static void main(String[] args){

		double centimeter = 100000;

		System.out.println("Distance in centimeters: " + centimeter + ". Distance in meters: " + CentimeterTransfer.transferToMeter(centimeter) + ". Distance in kilometers: " + CentimeterTransfer.transferToKilometer(centimeter));

	}

}