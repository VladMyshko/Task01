final class Cost{

	private double productCostOfGelatin;
	private double productCostOfSweets;
	private double ratioOfGelatinAndSweet;

	void findCostOfGelatin(double gelatinMass, double gelatinCost){
	
		productCostOfGelatin = gelatinMass / gelatinCost;

	}

	void findCostOfSweets(double sweetsMass, double sweetsCost ){

		productCostOfSweets = sweetsMass / sweetsCost;

	}

	void findRatioOfGelatinAndSweet(){

		ratioOfGelatinAndSweet = productCostOfSweets/productCostOfGelatin;

	}

	public double getGelatin(){

		return productCostOfGelatin;

	}

	
	public double getSweets(){

		return productCostOfSweets;

	}

	public double getRation(){

		return ratioOfGelatinAndSweet;

	}

}

		