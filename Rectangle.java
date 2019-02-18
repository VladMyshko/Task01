class Rectangle{
	public int perim(int a, int b){
		return 2*(a+b);
	}
	public int sq(int a, int b){
		return a*b;
	}
	public void main(){
		Rectangle obj=new Rectangle();
		system.out.println("P= "+obj.perim(2,3));
		system.out.println("S= "+obj.sq(2,3));
	}
} 