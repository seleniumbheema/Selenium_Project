
public class car {

String mob;
int price;



public car(String mob, int price){
	this.mob=mob;
	this.price=price;
}
public car(){
	System.out.println("intialize classes");
}
	public static void main(String[] args) {

		
		car c1 =new car();
		c1.mob="Merc";
		c1.price=220;
		c1.start();
		
		
		
		
		
	}
	
	public void start(){
		System.out.println(mob + " start");
		
	}

}
