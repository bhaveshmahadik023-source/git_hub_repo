import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner f1= new Scanner(System.in);
		System.out.print("enter size: ");
		int size =f1.nextInt();
		
		int arr []=new int[size];
		int arr1 []= new int [arr.length];
		int j=0;
		for(int i=0;i<=arr.length/2;i++){
			arr[i]=f1.nextInt();
			arr1[j]=arr[i];
			j++;

		}
		for(int k=0;k<arr1.length;k++){
			System.out.println(arr1[k]);
		
		}	
		
	}
}