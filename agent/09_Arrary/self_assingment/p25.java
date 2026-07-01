import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={6,5,3,2,1,9,7,8,10};

		int sum=0;
		int rem=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		int min=max;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		for(int i=min;i<=max;i++){		
			sum =sum+i;
		}
		rem=sum;
		for(int i=0;i<arr.length;i++){
			rem = rem-arr[i];	
		}
		System.out.println(rem);
	}
}