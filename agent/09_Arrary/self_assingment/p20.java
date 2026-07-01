//missing value from array

import java.util.*;

class Demo {
	public static void main(String[]args){
		int count=1;	
		int arr	[] = {10,7,3,5,2,6,9};
		
		int newarr [] = new int[arr.length];
		int k=0;
		for(int i=0; i<=arr.length+1;i++){
	
			for(int j=0 ;j<arr.length;j++){

				if(count == arr[j]){
					newarr[k] =count;
				k++;		
				}else{
				count++;
					if(count==arr[j]){
						newarr[k]=count;	
					}
				count--;
				}
			}
		count++;
		}
		System.out.println(Arrays.toString(newarr));
		
		count=1;
		for(int i=0; i<newarr.length ;i++){
			if(newarr[i] != count){
				System.out.println(count);
			count++;
			}
		count++;	
		}

	}	
}	