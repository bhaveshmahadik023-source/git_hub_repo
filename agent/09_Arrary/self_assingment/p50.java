//put 0 a place have negative value	

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner k1 =new Scanner(System.in);
		
		System.out.print("give length of array :");
		
		int length =k1.nextInt();
		
		int arr [] = new int[length];
		
		System.out.println("give element to array :");
		for(int i=0; i<arr.length;i++){
			
			arr[i]=k1.nextInt();
		}
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr[i]=0;
			}		
		}
	System.out.println(Arrays.toString(arr));
	}
}