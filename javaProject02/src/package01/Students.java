package package01;

public class Students {
	
	
	int c;
	int d;
	int e;
	
	public void sum(int a, int b) {
		c = a+b;
		System.out.println("result of sum " + c);
				
	}
	
	public void sub(int b) {
		
		d = c-b;
		System.out.println("result of sub " + d);

	}
	
	public void mul(int b) {
		
		e = d*b;
		System.out.println("result of mul " + e);

	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		
		Students result = new Students();
		
		result.sum(10, 2);
		result.sub(2);
		result.mul(2);


		
		
	}

}
