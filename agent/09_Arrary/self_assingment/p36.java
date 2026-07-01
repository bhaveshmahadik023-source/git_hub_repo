//right rotation

import java.util.Arrays;

class Demo{
	public static void main(String[]args){
		int arr []= {44,10,77,86,99};
		
		
		int last_digit=arr[arr.length-1];	
		int i=0;
		for(i =arr.length-1;i>0;i--){

			arr[arr.length-1]=arr[i-1];
		}
		arr[i]=last_digit;
		System.out.println(Arrays.toString(arr));
	}
}