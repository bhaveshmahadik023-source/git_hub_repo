class Demo{
	public static void main(String[]args){
		int arr[]={25,54,8,5,8,587,587,78};

		int mid=arr[arr.length-1];
		
		arr[arr.length-1]=arr[0];
		arr[0]=mid;
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}		
	}
}