//last to mid-1 rotation

import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {10,20,30,40,50,60,70};
		int i=0;
		int j=arr.length/2;
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		i++;
		j--;
		}	
		System.out.println(Arrays.toString(arr));
	}
}