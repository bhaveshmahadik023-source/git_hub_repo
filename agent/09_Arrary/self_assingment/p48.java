import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,5,8,9,9,2};	

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j+1]<arr[j]){
					int remove=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=remove;
				}	
			}		
		}
	}
}