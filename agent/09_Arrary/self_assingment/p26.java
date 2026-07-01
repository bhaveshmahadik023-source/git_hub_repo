import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,4,2,6,8,7,5};
		int arr1 [] =new int[arr.length];
		int k=0;
		int count=1;
		for(int i=0;i<=arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(count==arr[j]){
					arr1[k]=arr[j];
				k++;	
				}
			}

		count++;
		}
		System.out.println(Arrays.toString(arr1));	
		
		count=1;

		for(int i=0;i<arr1.length;i++){
			if(count != arr1[i]){
				System.out.println(count);
			count++;
			}
		count++;
		}
	}
}