//rotation in same array left to rigth 

import java.util.*;

class Demo {
	public static void main(String[]args){
		int j=4;
		int arr	[] = {1,2,3,4,5};
		
		int first = arr[0];

		for(int i = 0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		System.out.println(Arrays.toString(arr));
	}	
}