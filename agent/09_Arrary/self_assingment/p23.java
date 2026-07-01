import java.util.Arrays;

class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,3,4,5};
		
		int mid= arr.length/2;
		int j=0;
		for(int i=arr.length-1;i>mid;i--){
			int last = arr[i];
			arr[i]=arr[j];
			arr[j]=last;
		j++;	
		}
		System.out.println(Arrays.toString(arr));
	}
}