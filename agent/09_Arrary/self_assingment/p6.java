//panlindom
import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,2,3,2,1};
		
		int arr1 [] =new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--){
			arr1[j]=arr[i];
		j++;
		}

		boolean is_palindrom=true;
		j=arr1.length-1;
		for (int i=0;i<arr.length;i++){
			if(arr[i]!=arr1[j]){
				is_palindrom=false;
			}
		j--;
		}
		if(is_palindrom){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}