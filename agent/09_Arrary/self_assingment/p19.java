//missing value from array

import java.util.*;

class Demo {
	public static void main(String[]args){
		int count=1;	
		int arr	[] = {2,1,3,5,4};
		
		int newarr [] = new int[arr.length];
	
		for(int i=0; i< arr.length;i++){
	
			for(int j=0 ;j<arr.length;j++){
				if(count == arr[j]){
					newarr[i] = count;		
				}
			}
		count++;
		}
		System.out.println(Arrays.toString(newarr));
		
	}
}	