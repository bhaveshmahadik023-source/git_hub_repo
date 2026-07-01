import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner k1 = new Scanner(System.in);
		System.out.print("enter length of array:");
		
		int length = k1.nextInt();

		int arr [] = new int [length];

		System.out.print("enter the array element:");

		for(int i=0;i<arr.length;i++){
			arr[i]=	k1.nextInt();
		}
		int max=0;
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int min=max;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int second = max;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<second && arr[i]>min){
				 second = arr[i];
			}
		}
		System.out.println("second min :"+second);
	}
}