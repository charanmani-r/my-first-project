public class LargestOfThree {
	public static void main(String[] args) {
	 int a, b, c;
	 Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the values of a , b an c :");
	  
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.nextInt();
	
	if ( a>b)
	{
		if(a>c)
			System.out.println("a is biggest :"+a);
	}
	else {
		if (b>c)
			System.out.println("b is biggest :"+b);
		else 
			System.out.println("c is biggest :"+c);
	}

	}

}
