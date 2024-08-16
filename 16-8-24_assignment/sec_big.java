package java_Day_2;
import java.util.Scanner;

public class sec_big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max1=arr[0];
		int max2=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			
			else if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		System.out.println("Second largest element is: "+max2);
		

	}

}
