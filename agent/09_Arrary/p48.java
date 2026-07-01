import java.util.*;


class Demo{
	public static void main(String[]args){
		int arr []={1,5,7,10,6,3};
		int max=0;
		int i=0;
		int arr2 [] = new int[1];	
		int j=0;
		for( i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				arr2[j]=max;
			}	
		}
		System.out.println(max);
		System.out.println(Arrays.toString(arr2));
	}

}