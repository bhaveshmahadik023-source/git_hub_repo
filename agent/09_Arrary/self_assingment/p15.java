//rotation from rigth diffirent array (logic-1)

import java.util.*;

 class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,3,4,5};

		int newarr [] = new int[arr.length];
		int j=1;
		
		for(int i=0;i<arr.length-1;i++){
		
			newarr[j] = arr[i];
		j++;
		}
		newarr[0]=arr[arr.length-1];
		System.out.println(Arrays.toString(newarr));
	}
}