// rotation from left (logic-1 self)

import java.util.*;

 class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,3,4,5,6,7,9,10};
		int j=0;
		int newarr [] = new int[arr.length];

		for(int i=1;i<arr.length;i++){
			newarr[j] = arr[i];
		j++;
		}
		newarr[j]=arr[0];
		System.out.println(Arrays.toString(newarr));
	}
}