package process.transaction;

public class MoneyTransaction {
	
	public void transactions(int arr[],int target) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>=target) {
				System.out.println("target achieved after "+(i+1)+" transactions");
				break;
			}
			
		}
		if(sum<target) {
			System.out.println("Target cannot be achieved");
		}
	}
	
}
