final class RuleOfTriangle{

	private RuleOfTriangle(){}
	
	 static boolean isTriangle(float a, float b, float c){
		
		return (c<a+b && b<a+c && a<b+c);

	}


}