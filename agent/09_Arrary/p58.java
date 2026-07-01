class Demo{
	public static void main(String[]args){
		
		int arr [] = {1,1,5,6,7,7,9,20};
		int max=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				count=1;
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						count++;
					}
				}
			System.out.println(arr[i]+":"+count);
			max=arr[i];
			}	
		}
	}
}