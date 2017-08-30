public class testModularExp {
	public static long x = 1, power = 1, 
				b = 72, e = 13, m = 77;
	public static int numBits;
	
	public static void main(String[] args) {
		
		numBits = (Long.toBinaryString(e).length());
		long result = Long.parseLong(Long.toBinaryString(e));
		//System.out.println(result);
		
		/*if(Math.log(n)/Math.log(2)%2 == 0)
			numBits  = Math.log(n)/Math.log(2);*/
			
		power = b%m;
		//numBits = Math.ceil(Math.log(n)/Math.log(2));
		
		for(int i=0; i<numBits; i++) {
					
					if(result%10 == 1) 
						x = (x*power)%m;
					
					power = (power*power)%m;
					result = result/10;
		}
		
		
		System.out.println(x);	
	
	}
}
