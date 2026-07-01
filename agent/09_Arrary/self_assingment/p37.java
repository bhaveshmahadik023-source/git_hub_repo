//left rotation

import java.util.Arrays;

class Demo{
	public static void main(String[]args){
		int arr []= {44,10,77,86,99};
		
		
		int first_digit=arr[0];	

		for(int i =0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first_digit;
		System.out.println(Arrays.toString(arr));
	}
}