package tasksprograms;

public class RecursiveNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		naturalNumbers(20); 
	}

	
	static int naturalNumbers(int n) {
		
		if(n == 0)
			return 0;
		
		System.out.println(n);
		
		return  naturalNumbers(n-1);
	}
}
