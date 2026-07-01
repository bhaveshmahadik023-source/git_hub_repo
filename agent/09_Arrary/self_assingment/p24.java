import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,2,3,4,5};
		int arr1 [] = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++){		
			int sum =arr[i]+arr.length-1-i;
			int add=sum-i;
			arr1[j]=add;
		j++;
		}
		System.out.println(Arrays.toString(arr1));
	}
}