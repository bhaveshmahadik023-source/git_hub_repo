//missing value from array

import java.util.*;

class Demo {
	public static void main(String[]args){
		int count=1;	
		int arr	[] = {1,2,4,5,};

		for(int i=0;i<arr.length-1;i++){
			if(count != arr[i]){
				System.out.println(count);
			count++;	
			}
		count++;
		}
		
	}	
}	