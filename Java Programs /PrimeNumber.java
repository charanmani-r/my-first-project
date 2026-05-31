public class PrimeNumber  {

	public static void main(String[] args) {
		
		int num = 10;
		int count = 0;
		
		//checking factors
		
		for(int i= 1; i <= num;i++) {
			
			if (num % i == 0 ) {
				
				count++;
			}
				
		}
		
		//checking prime or not
	
		if(count == 2) {
			
			System.out.println("Given number is prime number");
		}else {
		System.out.println("Given number is not a prime number ");
		
		
		}
			
			

	}
