import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={10,20,30,40,50,60,55,6,8};
		
	
		int i=0;
		int mid = arr.length/2;
	
		int j=1;
		while(i<mid-j){
			int remove =arr[i];
			arr[i]=arr[mid-j];
			arr[mid-j]=remove;
		i++;
		j++;
		}
	
		j=arr.length-1;
		while(mid<j){
			int remove =arr[mid];
			arr[mid]=arr[j];
			arr[j]=remove;
		mid++;
		j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}