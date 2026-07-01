//even from first array to second array

class Demo{
	public static void main(String[]args){
		
		
		int arr []={45,25,30,32,43};
		int arr1 []= new int [arr.length];

		int j=0;
		for(int i=0;i<arr.length;i++){
				
			if(arr[i]%2==0){
				arr1[j]=arr[i];
			}
					
		j++;

		}
		for(int k=0;k<arr1.length;k++){
			System.out.println(arr1[k]);
		
		}	
		
	}
}