import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr [] ={6,0,7,1,2,0,8,0,9};
		int j=0;	
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				arr[j]= arr[i];
				count++;
			j++;
			}
		}
		
		int mid= arr.length/2;
		for(int i=count;i<arr.length;i++){
			arr[i]=0;	
		}
		
		
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++){
			for(int k=0;k<arr.length-1;k++){
				if(arr[k+1]>arr[k]){
					int remove=arr[k+1];
					arr[k+1]=arr[k];
					arr[k]=remove;
				}	
			}	
		}
		System.out.println(Arrays.toString(arr));
	}
}