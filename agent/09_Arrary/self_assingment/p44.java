import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {1,7,8,9,12,15,10,20,40,48};
		
		int mid=arr.length/2;
		
		int first=0;
		
		while(first<mid){
			int digit=arr[first];
			arr[first]=arr[mid];
			arr[mid]=digit;
		first++;
		mid--;
		}

		int j=arr.length/2+1;
		int k=arr.length-1;
		
		while(j<k){
			int digit1 = arr[k];
			arr[k] = arr[j];
			arr[j]=digit1;
		j++;
		k--;
		
		}
		System.out.println(Arrays.toString(arr));
	}
}