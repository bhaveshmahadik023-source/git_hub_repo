import java.util.*;

class Demo{
	public static void main(String [] arsg){

		int arr [] ={1,2,3,4,5};
		for(int i=0; i<arr.length ; i++){
			int sum =arr[i]+arr.length-1-i;
			int add = sum-i;
			arr[i]=add;
		}	
		System.out.println(Arrays.toString(arr));
	}
}