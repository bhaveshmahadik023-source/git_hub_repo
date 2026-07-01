//decending sorting of array

import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={25,98,35,97,26,8,3,56};
		
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int digit = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=digit;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}