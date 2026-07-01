import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner f1= new Scanner(System.in);
		System.out.print("enter size: ");
		int size =f1.nextInt();
		
		int arr []=new int[size];
		int arr1 []= new int [arr.length];
	
		for(int i=0;i<arr.length;i++){
			arr1[i]=f1.nextInt();
		}	
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr1[i]);
		}	
	}
}