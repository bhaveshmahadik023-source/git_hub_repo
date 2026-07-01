import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,4,7,8,5,6,3,2,10,9};
		int count=1;
		int digit=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){	
				if(count==arr[j]){
					digit=arr[i];
					arr[i]=count;
					arr[j]=digit;
				}
			}
		count++;	
		}
		System.out.println(Arrays.toString(arr));		
	}
}