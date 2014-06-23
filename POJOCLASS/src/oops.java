
public class oops {

	int in;
	static String mob;
	
	String a;
	String b;
	String c;
	public static void main(String[] args) {

		mob= "anil";
		
		mymeht();
		
		oops op =new oops();
		op.in=2;
		op.inher();
		op.poly();
		
		op.a="a";
		op.b ="b";
		op.c ="c";
	
	

		System.out.println(op.a);
		System.out.println(op.b);
		System.out.println(op.c);
		
		op.a=op.b;
		op.b=op.c;
		op.c=op.a;
		
		System.out.println(op.a);
		System.out.println(op.b);
		System.out.println(op.c);
		
		op.c="1234";
		
		
		System.out.println(op.a);
		System.out.println(op.b);
		System.out.println(op.c);
		
	}
	
	public void inher(){
		System.out.println(mob +" inher");
		
	}

	public void poly(){
		System.out.println(mob + " poly");
	}
	
	public static void mymeht(){
		System.out.println(mob + " mymeth");
	}
}