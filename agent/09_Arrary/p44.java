//max from first array to second array backword direction


class Demo{
	public static void main(String[]args){
		
		
		int arr []={45,25,30,32,85};
		int arr1 []= new int [arr.length];

		int j=arr.length-1;
		int max=0;
		for(int i=0;i<arr.length;i++){
				
			if(arr[i]>max){
				arr1[j]=arr[i];
				max= arr[i];
						
			j--;
			}
		}
		for(int k=0;k<arr1.length;k++){
			System.out.println(arr1[k]);
		
		}	
		
	}
}