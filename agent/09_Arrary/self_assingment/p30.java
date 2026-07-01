//value is negative change it to 0
import java.util.*;

class Demo{
	public static void main(String[]args){
		int targat = 6;
		int arr [] = {1,2,-3,4,-5,6,-8};
		boolean is_equal=true;

		for(int i=0;i<arr.length;i++){
			
			if(arr[i] <0){
				arr[i]=0;
			}	
		}
		System.out.println(Arrays.toString(arr));
	}
}