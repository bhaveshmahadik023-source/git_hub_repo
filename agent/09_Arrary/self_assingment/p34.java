// both side start to mid and mid to end (logic-1)

import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {10,20,30,40,50,60,70,80};
		
		int i=0;
		int j=arr.length/2-1;

		int k=j+1;
		int l=arr.length-1;

		while(i<j){
			System.out.println("bhavesh");
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				while(k<l){
				System.out.println("mahadik");
					int digit=arr[k];
					arr[k]=arr[l];
					arr[l]=digit;		
				k++;
				l--;
				}
		i++;
		j--;
		}	
		System.out.println(Arrays.toString(arr));
	}
}