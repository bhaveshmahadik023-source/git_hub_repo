//print value greater that target

import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,5,8,9,9,2};
		
		int target=5;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>target){
				System.out.println(arr[i]);
			}
		}	
	}
}