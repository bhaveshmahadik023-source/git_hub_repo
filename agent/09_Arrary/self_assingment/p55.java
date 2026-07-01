import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {1,0,3,0,4,8,0,5,6,7,0,1,0};
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				arr[j]=arr[i];
			j++;
			
			}
		}	
		
		for(int i=j;i<arr.length;i++){
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}