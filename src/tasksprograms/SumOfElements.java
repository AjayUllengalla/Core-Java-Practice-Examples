package tasksprograms;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[] = {10,2,3};
		int index =0;
		System.out.println(sumOfElements(n,index));
	}

	static int sumOfElements(int n[],int index) {
	
		if(index >=n.length)
			return 0;
		
		int result = n[index] + sumOfElements(n,index+1);
		return result;
	}
}
