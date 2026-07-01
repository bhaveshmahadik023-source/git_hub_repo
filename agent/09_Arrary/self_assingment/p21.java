import java.util.*;

class Demo{
	public static void main(String[]args){
		int arr [] ={1,2,3,4,5};
		int targat =3;
		int arr1 [] =new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=targat){	
				arr1[j]=arr[i];
			j++;
			}
		}
		System.out.println(Arrays.toString(arr1));	
	}
}