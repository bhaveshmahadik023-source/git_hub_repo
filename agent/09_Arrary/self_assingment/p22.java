class Demo{
	public static void main(String[]args){
		int arr [] ={1,2,3,4,6,7,8};
		int sum=0;
		for(int i=1;i<=arr.length+1;i++){
			sum=sum+i;
		}
		int missing=sum;
		for(int i =0;i<arr.length;i++){
			missing=missing-arr[i];
		}
		System.out.println(missing);	
	}	
}