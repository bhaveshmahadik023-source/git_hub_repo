import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] = {3,2,1,4,5};
		int count=1;
		for(int i=0;i<arr.length;i++){
			for(int j =0; j<arr.length;j++){
				if(count==arr[j]){
					int remove=arr[i];
					arr[i]=arr[j];	
					arr[j]=remove;
				}
			}
		count++;	
		}
		System.out.println(Arrays.toString(arr));
	}
}