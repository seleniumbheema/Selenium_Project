
public class passbyref {

	
	int x;
	int y;
	
	public static void main(String[] args) {

		 passbyref p = new passbyref();
		p.x=10;
		p.y=20;
		System.out.println("before swapping "+ p.x + "-----" +p.y);
		swap(p.x, p.y);
		
		System.out.println("after swapping "+ p.x + "-----" +p.y);
		swapval(p);
		System.out.println("after pass by ref "+ p.x + "-----" +p.y);
	
	}
	
	public static void swap(int a, int b){
		
		int temp =a;
		a=b;
		b=temp;

	
	}
	
	public static void swapval(passbyref t){
		
		int temp = t.x;
		t.x=t.y;
		t.y=temp;
	}
	

}

