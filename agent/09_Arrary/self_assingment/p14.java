// rotation from left (logic-2 sir)

import java.util.*;

 class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,3,4,5};

		int newarr [] = new int[arr.length];

		for(int i=0;i<=arr.length-2;i++){
			newarr[i] = arr[i+1];
		}
		newarr[newarr.length-1]=arr[0];
		System.out.println(Arrays.toString(newarr));
	}
}