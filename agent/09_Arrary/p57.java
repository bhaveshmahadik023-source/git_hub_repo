//give count of maximum repeated number 

class Demo{
	public static void main(String[]args){
	int arr [] = {1,2,2,2,3,4,2,5,5,5,5,5,5,7,7,7,7};
	
	int arr1 [] = new int[arr.length];

	int privious=0;
	int k=0;
	int i =0;
	int num=0;
	int max=0;

	for(i=0;i<arr.length;i++){

			int count=0;
			num=arr[i];	
			
			if(arr[i]!=privious){
				for(int j=0;j<arr.length;j++){
					if(arr[j]==num){
					count++;
					}
				}
			arr1[k]=count;
			k++;
			}
		privious=arr[i];
			
		}
		for(k =0; k < arr1.length;k++){
			if(arr1[k]>max){
				max=arr1[k];
			}
		}
	System.out.println(max);

	}
}

