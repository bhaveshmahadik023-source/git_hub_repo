import java.util.*;


class Demo{
	public static void main(String[]args){
		int arr []={1,5,7,10,6,3};
		int count=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				count++;
			}
		}
		System.out.println(count);
		
		int arr1 []=new int[4];
		int j=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				arr1[j]= arr[i];
			j++;
			}	
		}
		System.out.println(Arrays.toString(arr1));
	}

}