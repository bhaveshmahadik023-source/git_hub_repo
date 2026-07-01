import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr []= {1,0,3,0,4,8,0,1};
		int j=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]>0){
				arr[j] = arr[i];
			j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int k=j;k<arr.length;k++){
			arr[k]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}