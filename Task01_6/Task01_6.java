public class Task01_6{

	public static void main(String[] args){
		
		double gelatinMass = 27;
		double gelatinCost = 3;
		double sweetsMass = 12;
		double sweetsCost = 4;
		
		Cost cost=new Cost();

		cost.findCostOfGelatin(gelatinMass, gelatinCost);
		cost.findCostOfSweets(sweetsMass, sweetsCost);
		cost.findRatioOfGelatinAndSweet();

		System.out.println("Cost of gelatin: " + cost.getGelatin()  + ". Cost of sweets: " + cost.getSweets() + ". Ratio of sweets and gelatin: " + cost.getRation());

	}

}

