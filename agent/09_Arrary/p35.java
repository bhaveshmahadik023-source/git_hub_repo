import java.util.*;

class Demo{
	public static void main(String[]args){
				
	Scanner g1 =new Scanner(System.in);

		System.out.print("enter length of arr n:");
		
		int n= g1.nextInt();
		
		int arr[]=new int[n];
	
					
		
		for(int i=0;i<arr.length;i++){
			int j=g1.nextInt();
			arr [i]=j;
			
		}
	for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");	
		}
	}
}