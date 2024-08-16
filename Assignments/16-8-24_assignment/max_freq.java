package java_Day_2;
import java.util.Scanner;

public class max_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int count=0,max_count=0;
		int freq=0;
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(max_count<count) {
				max_count=count;
				freq=arr[i];
			}
		}
		
		System.out.print("Most frequent element is: " + freq);
		
		

	}

}
