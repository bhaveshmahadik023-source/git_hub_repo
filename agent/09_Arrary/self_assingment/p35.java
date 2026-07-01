// both side start to mid and mid to end (logic-1)

import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {10,20,30,40,50,60};
		
		int i=0;
		int j=arr.length/2-1;

		

		while(i<j){

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		i++;
		j--;	
		}

		int k=arr.length/2;
		int l=arr.length-1;

		while(k<l){

			int temp=arr[k];
			arr[k]=arr[l];
			arr[l]=temp;
		k++;
		l--;		
		}	
		System.out.println(Arrays.toString(arr));
	}
}