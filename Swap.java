final class Swap{

	private Swap(){}

	static double[] swapper(double array[]){
	
		array[0]=array[0]+array[1];
		array[1]=array[0]-array[1];
		array[0]=array[0]-array[1];

		return array;

	}

}
		