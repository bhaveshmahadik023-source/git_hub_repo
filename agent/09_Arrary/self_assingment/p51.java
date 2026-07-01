//all greater than 0 value from start and 0 value  in end
import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr []={2,5,0,0,8,0,4,0,9};
		int arr1 []=new int [arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				arr1[j]=arr[i];
			j++;
			}
		}
		System.out.println(Arrays.toString(arr1));

		for(int i=0;i<arr1.length;i++){

			for(j=0; j< arr1.length-1;j++){
				
				if(arr1[j+1]>arr1[j]){
					int remove=arr1[j+1];
					arr1[j+1]=arr1[j];
					arr1[j]=remove;
				}
			}	
		}
		System.out.println(Arrays.toString(arr1));
	}
}